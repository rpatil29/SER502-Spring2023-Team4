import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.util.Map;

public class MainFrame extends JFrame {
    private static final int DEFAULT_WINDOW_HEIGHT = 500;
    private static final int DEFAULT_WINDOW_WIDTH = 800;

    private final JTextArea jTextAreaCodeEditor;

    private final JTextArea jTextAreaProgramOutput;

    private final DefaultTableModel modelEnvironment;

    public MainFrame(){
        super("Orange");

        JPanel jPanelMainPanel = new JPanel();
        jPanelMainPanel.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0; c.gridy = 0; c.gridwidth = 2; c.weightx = 1; c.weighty = 5;
        c.insets = new Insets(2,5,2,5);

        jTextAreaCodeEditor = new JTextArea();
        jTextAreaCodeEditor.setTabSize(1);
        jTextAreaCodeEditor.setLineWrap(true);
        jPanelMainPanel.add(new JScrollPane(jTextAreaCodeEditor), c);

        jTextAreaProgramOutput = new JTextArea();
        jTextAreaProgramOutput.setLineWrap(true);

        c.gridx = 0; c.gridy = 2; c.gridwidth = 1; c.weightx = 5; c.weighty = 4;
        jPanelMainPanel.add(new JScrollPane(jTextAreaProgramOutput), c);

        modelEnvironment = new DefaultTableModel(new String[] { "Variable", "Type", "Value" }, 0);
        JTable jTableEnvironment = new JTable(modelEnvironment);

        c.gridx = 1; c.gridy = 2; c.gridwidth = 1; c.weightx = 3; c.weighty = 4;
        jPanelMainPanel.add(new JScrollPane(jTableEnvironment), c);

        JButton jButtonRun = new JButton("Run");
        jButtonRun.setHorizontalAlignment(JButton.CENTER);
        jButtonRun.addActionListener(e -> run());

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0; c.gridy = 1; c.gridwidth = 2; c.weighty = 0;
        jPanelMainPanel.add(jButtonRun, c);

        add(jPanelMainPanel);
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setSize(DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void run() {
        jTextAreaProgramOutput.setText("");
        modelEnvironment.setRowCount(0);

        PrintStream programOutputPrintStream = new PrintStream(new TextAreaOutputStream(jTextAreaProgramOutput));

        OrangeLexer OrangeLexer = new OrangeLexer(CharStreams.fromString(jTextAreaCodeEditor.getText()));
        CommonTokenStream commonTokenStream = new CommonTokenStream(OrangeLexer);
        OrangeParser OrangeParser = new OrangeParser(commonTokenStream);
        MyOrangeErrorListener myOrangeErrorListener = new MyOrangeErrorListener(programOutputPrintStream);
        OrangeParser.removeErrorListeners();
        OrangeParser.addErrorListener(myOrangeErrorListener);

        ParseTree parseTree = OrangeParser.program();
        if (myOrangeErrorListener.parseResult()) {
            jTextAreaProgramOutput.append("Parse Tree:\n" + parseTree.toStringTree(OrangeParser) + "\n\n");

            MyOrangeVisitor myOrangeVisitor = new MyOrangeVisitor(programOutputPrintStream);
            myOrangeVisitor.visit(parseTree);

            myOrangeVisitor.evaluationResult();
            for (Map.Entry<String, Variable> variableEntry : myOrangeVisitor.getVariableMap().entrySet()) {
                Variable variable = variableEntry.getValue();
                modelEnvironment.addRow(new Object[] { variableEntry.getKey(), variable.getType(), variable.getValue() });
            }
        }
    }
}
