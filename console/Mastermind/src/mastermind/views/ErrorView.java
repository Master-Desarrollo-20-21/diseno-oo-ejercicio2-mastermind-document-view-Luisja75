package mastermind.views;

import mastermind.types.Color;
import mastermind.types.Error;
import utils.Console;

public class ErrorView {
    private static final String[] MESSAGES = {
            "Repeated colors",
            "Wrong colors, they must be: " + Color.getListKeyword(),
            "Wrong proposed combination length"};
    private Error error;

    public ErrorView(Error error) {
        this.error = error;
    }

    public void show() {
        if (!this.error.isNull()) {
            Console.getInstance().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
        }
    }
}
