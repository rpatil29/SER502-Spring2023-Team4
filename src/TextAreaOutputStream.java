import javax.swing.*;
import java.io.IOException;
import java.io.OutputStream;

public class TextAreaOutputStream extends OutputStream {
    private final JTextArea jTextAreaProgramOutput;
    public TextAreaOutputStream(JTextArea jTextAreaProgramOutput) {
        this.jTextAreaProgramOutput = jTextAreaProgramOutput;
    }

    @Override
    public void write(int b) throws IOException {
        jTextAreaProgramOutput.append(String.valueOf((char)b));
        jTextAreaProgramOutput.setCaretPosition(jTextAreaProgramOutput.getDocument().getLength());
    }
}
