package mastermind.views.console;

import mastermind.models.Combination;
import mastermind.models.CombinationSecret;
import mastermind.types.Color;
import mastermind.views.Message;
import utils.Console;

public class CombinationSecretView {
	private CombinationSecret combinationSecret;
	
	public CombinationSecretView(CombinationSecret combinationSecret) {
		this.combinationSecret = combinationSecret;
	}
	
	public void show() {
		String list = "";
		for (Color color: combinationSecret.getColors())
		{
			list += color.getKeyword();
		}
		Console.getInstance().writeln(list);
	}
	
	public void showSecret() {
		for (int i=0; i<Combination.NUMBER_COLORS; i++)
		{
			Console.getInstance().write(Message.SECRET.getMessage());
		}
		Console.getInstance().writeln("");
	}
}
