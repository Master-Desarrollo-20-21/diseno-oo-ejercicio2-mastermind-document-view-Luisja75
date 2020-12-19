package mastermind.views;

import mastermind.models.Attempt;
import mastermind.models.Board;
import mastermind.models.CombinationProposed;
import utils.Console;

public class BoardView extends WithBoardView {
	
	public BoardView(Board board) {
		super(board);
	}

	public boolean interact() {
        CombinationProposed combinationProposed = new CombinationProposed();
        CombinationProposedView combinationProposedView = new CombinationProposedView(combinationProposed);
        this.board.addCombinationProposed(combinationProposedView.read());
        return this.board.isFinish();
	}

	public void show() {
		Console.getInstance().writeln(Message.ATTEMPTS.getMessage().replace("#NumAttempt",  "" + this.board.getCurrentAttempt()));
		new CombinationSecretView(this.board.getCombinationSecret()).showSecret();
		for(int i=0; i<=this.board.getCurrentAttempt()-1; i++) {
			Attempt attempt = this.board.getAttempts()[i];
			new CombinationProposedView(attempt.getCombinationProposed()).show();
	        Console.getInstance().writeln(Message.RESULT.getMessage().replace("#blacks", "" + attempt.getNumBlacks())
	                .replace("#whites", "" + attempt.getNumWhites()));			
		}
	}
}
