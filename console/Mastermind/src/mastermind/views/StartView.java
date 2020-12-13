package mastermind.views;

import utils.Console;

public class StartView {
	private Console console;
	
	public StartView() {
		this.console = new Console();
	}
		
	public void interact() {
		this.console.out("----- MASTERMIND -----\n");	
	}
}
