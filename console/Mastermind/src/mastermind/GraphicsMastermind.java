package mastermind;

import mastermind.models.Board;
import mastermind.views.View;
import mastermind.views.graphics.GraphicsView;

public class GraphicsMastermind extends Mastermind{

	@Override
	protected View createView(Board board) {
		return new GraphicsView(board);
	}
	
	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}	
}
