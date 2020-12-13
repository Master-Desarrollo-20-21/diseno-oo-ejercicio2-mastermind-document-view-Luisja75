package mastermind;

import mastermind.models.Board;
import mastermind.views.View;

public class Mastermind { 

	private Board board; 
	private View view;

	public Mastermind() {
		this.board = new Board();
		this.view = new View(board);
	}
	
	private void play() {
		view.interact();
	} 

	public static void main(String[] args) {
		new Mastermind().play(); 
	} 
}