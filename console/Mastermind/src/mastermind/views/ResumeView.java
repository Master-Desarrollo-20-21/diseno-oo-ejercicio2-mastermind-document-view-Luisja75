package mastermind.views;

import mastermind.models.Board;
import utils.Console;

public class ResumeView extends WithBoardView {
	private Console console;
	
	public ResumeView(Board board) {
		super(board);
		this.console = new Console();
	}

	public boolean isResumed() { 
		String answer;
		do { 
			this.console.out("RESUME? (y/n): ");
			answer = this.console.inString(); 
		} while (!answer.equals("y") && !answer.equals("n")); 
		return answer.equals("y");
	}
	
	public void showResult() {
		if (this.board.isWin()) {
			this.console.out("You've won!!! :-)\n");
		} else {
			this.console.out("you've lost!!! :-(\n");
			this.console.out("Combination secret = ");
			new CombinationSecretView(this.board.getCombinationSecret()).show();
		}
	}
}
