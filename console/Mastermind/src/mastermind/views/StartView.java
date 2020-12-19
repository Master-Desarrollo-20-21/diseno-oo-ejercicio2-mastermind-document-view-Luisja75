package mastermind.views;

import utils.Console;

public class StartView {
	
	public StartView() {
	}
		
	public void interact() {
		Console.getInstance().writeln(Message.TITLE.getMessage());	
	}
}
