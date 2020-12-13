package mastermind.views;

import mastermind.types.Color;
import mastermind.types.Error;
import utils.Console;

class ErrorView {
	private Console console;
	
    private static final String[] MESSAGES = {
            "Repeated colors",
            "Wrong colors, they must be: " + Color.getListKeyword(),
            "Wrong proposed combination length"};
    private Error error;

    ErrorView(Error error) {
    	this.console = new Console();
        this.error = error;
    }

    void show() {
        if (!this.error.isNull()) {
            console.out(ErrorView.MESSAGES[this.error.ordinal()] + "\n");
        }
    }
}
