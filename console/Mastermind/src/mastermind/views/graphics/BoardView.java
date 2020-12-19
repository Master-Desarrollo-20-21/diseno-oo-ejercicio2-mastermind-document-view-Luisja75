package mastermind.views.graphics;

import mastermind.models.Board;
import mastermind.models.CombinationProposed;
import mastermind.views.WithBoardView;

public class BoardView extends WithBoardView{

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
		// TODO Auto-generated method stub
	}
}
