package mastermind.views;

import mastermind.models.Board;

public abstract class WithBoardView {

    protected Board board;

    public WithBoardView(Board board) {
        this.board = board;
    }
}
