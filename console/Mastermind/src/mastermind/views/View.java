package mastermind.views;

import mastermind.models.Board;

public class View {

	private StartView startView;
	private BoardView boardView;
	private ResumeView resumeView;

	public View(Board board) {
		this.startView = new StartView();
		this.boardView = new BoardView(board);
		this.resumeView = new ResumeView(board);
	}
	
	public void interact() {
		do { 
			this.startView.interact();
			this.boardView.show();
			boolean notFinished;
			do {
				notFinished = this.boardView.interact();
				this.boardView.show();
			} while (notFinished);
			this.resumeView.showResult();					
		} while(this.resumeView.isResumed());
	}
}
