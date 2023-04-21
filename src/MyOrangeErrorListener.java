import org.antlr.v4.runtime.BaseErrorListener;

import java.io.PrintStream;

public class MyOrangeErrorListener extends BaseErrorListener {
    public MyOrangeErrorListener(PrintStream programOutputPrintStream) {
    }

    public boolean parseResult() {
        return false;
    }
}
