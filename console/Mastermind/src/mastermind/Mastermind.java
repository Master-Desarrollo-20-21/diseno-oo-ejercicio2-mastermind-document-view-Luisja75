package mastermind;

import mastermind.models.Board;
import mastermind.views.View;

public abstract class Mastermind { 

	private View view;

	public Mastermind() {
		this.view = this.createView(new Board());
	}
	
	protected abstract View createView(Board board);
	
	protected void play() {
		view.interact();
	} 
}