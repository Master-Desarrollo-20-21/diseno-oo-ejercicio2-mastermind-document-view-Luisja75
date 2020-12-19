package mastermind;

import mastermind.models.Board;
import mastermind.views.View;
import mastermind.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind{

	@Override
	protected View createView(Board board) {
		return new ConsoleView(board);
	}
	
	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}	
}
