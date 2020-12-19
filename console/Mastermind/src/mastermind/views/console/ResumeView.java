package mastermind.views.console;

import mastermind.models.Board;
import mastermind.views.Message;
import mastermind.views.WithBoardView;
import utils.Console;
import utils.YesNoDialog;

public class ResumeView extends WithBoardView {
	public ResumeView(Board board) {
		super(board);
	}

	public boolean isResumed() {
		board.reset();
        return new YesNoDialog(Message.RESUME.getMessage()).read();
	}
	
	public void showResult() {
		if (this.board.isWin()) {
			Console.getInstance().writeln(Message.WINNER.getMessage());
		} else {
			Console.getInstance().writeln(Message.LOOSER.getMessage());
			Console.getInstance().write(Message.SECRET_COMBINATION.getMessage());
			new CombinationSecretView(this.board.getCombinationSecret()).show();
		}
	}
}
