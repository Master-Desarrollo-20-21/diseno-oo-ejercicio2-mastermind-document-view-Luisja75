package mastermind.views;

import mastermind.models.Attempt;
import mastermind.models.Board;
import mastermind.models.CombinationProposed;
import utils.Console;

public class BoardView {
	private Board board;
	private Console console;
	
	public BoardView(Board board) {
		this.console = new Console();
		this.board = board;
	}

	public boolean interact() {
        CombinationProposed combinationProposed = new CombinationProposed();
        CombinationProposedView combinationProposedView = new CombinationProposedView(combinationProposed);
        this.board.addCombinationProposed(combinationProposedView.read());
        return this.board.isFinish();
	}

	public void show() {
		this.console.out(this.board.getCurrentAttempt() + " Attempt(s):\n");
		new CombinationSecretView(this.board.getCombinationSecret()).showSecret();
		for(int i=0; i<=this.board.getCurrentAttempt()-1; i++) {
			Attempt attempt = this.board.getAttempts()[i];
			new CombinationProposedView(attempt.getCombinationProposed()).show();
			console.out(" --> " + attempt.getNumBlacks() + " blacks " +  attempt.getNumWhites() + " whites\n");
		}
	}
}
