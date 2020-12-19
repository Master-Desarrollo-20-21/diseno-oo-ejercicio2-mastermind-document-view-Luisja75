package mastermind.views.console;

import mastermind.views.Message;
import utils.Console;

public class StartView {
	
	public void interact() {
		Console.getInstance().writeln(Message.TITLE.getMessage());	
	}
}
