package mastermind.views.console;

import mastermind.models.Board;
import mastermind.views.View;

public class ConsoleView extends View {

	private StartView startView;
	private BoardView boardView;
	private ResumeView resumeView;

	public ConsoleView(Board board) {
		super(board);
		this.startView = new StartView();
		this.boardView = new BoardView(board);
		this.resumeView = new ResumeView(board);
	}
		
	@Override
    protected void start() {
		this.startView.interact();
	}

	@Override
    protected boolean interactBoard() {
		return this.boardView.interact(); 	
	}
    
	@Override
    protected void showBoard() {
		this.boardView.show();
	}

	@Override
    protected void showResult() {
		this.resumeView.showResult();
	}
    
	@Override
    protected boolean isResumed() {
		return this.resumeView.isResumed();
	}	
}
