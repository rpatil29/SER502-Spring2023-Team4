import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class MyOrangeErrorListener extends BaseErrorListener {
    private final PrintStream programOutputPrintStream;
    private final List<Error> syntaxErrorList = new ArrayList<>();
    public MyOrangeErrorListener(PrintStream programOutputPrintStream) {
        this.programOutputPrintStream=programOutputPrintStream;
    }
    @Override public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                                      int charPositionInLine, String msg, RecognitionException e) {
        syntaxErrorList.add(new Error(msg, line, charPositionInLine + 1));
    }

    public boolean parseResult() {
        if (syntaxErrorList.size() == 0) {
            programOutputPrintStream.println("Program Parsing Successful.");
            return true;
        } else {
            programOutputPrintStream.println("Program Parsing Failed. Please Correct The Following Errors:");
            for (Error syntaxError : syntaxErrorList)
                programOutputPrintStream.println(syntaxError);
            return false;
        }
    }
}


