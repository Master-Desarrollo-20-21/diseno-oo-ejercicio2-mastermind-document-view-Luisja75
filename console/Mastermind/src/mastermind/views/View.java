package mastermind.views;

import mastermind.models.Board;

public abstract class View {

	public View(Board board) {
	}
	
	public void interact() {
		do {
			this.start();
			this.showBoard();
			boolean notFinished;
			do {
				notFinished = this.interactBoard();
				this.showBoard();
			} while (notFinished);
			this.showResult();					
		} while(this.isResumed());
	}
	
    protected abstract void start();

    protected abstract boolean interactBoard();
    
    protected abstract void showBoard();

    protected abstract void showResult();
    
    protected abstract boolean isResumed();
}
