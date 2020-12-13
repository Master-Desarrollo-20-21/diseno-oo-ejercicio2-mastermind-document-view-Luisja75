package mastermind;

import mastermind.models.Board;
import utils.Console;

public class Mastermind { 

	private Board board; 

	private void play() { 
		do { 
			this.board = new Board();
			this.board.play();
			this.board.showResult();			
		} while(this.isResumed()); 
	} 

	private boolean isResumed() { 
		String answer;
		Console console = new Console(); 
		do { 
			console.out("RESUME? (y/n): ");
			answer = console.inString(); 
		} while (!answer.equals("y") && !answer.equals("n")); 
		return answer.equals("y");
	} 

	public static void main(String[] args) {
		new Mastermind().play(); 
	} 
}