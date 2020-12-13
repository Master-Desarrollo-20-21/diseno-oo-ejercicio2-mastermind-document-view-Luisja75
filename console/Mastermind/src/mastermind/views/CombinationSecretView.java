package mastermind.views;

import mastermind.models.CombinationSecret;
import mastermind.types.Color;
import utils.Console;

public class CombinationSecretView {
	private CombinationSecret combinationSecret;
	private Console console;
	
	public CombinationSecretView(CombinationSecret combinationSecret) {
		this.combinationSecret = combinationSecret;
		this.console = new Console();
	}
	
	public void show() {
		String list = "";
		for (Color color: combinationSecret.getColors())
		{
			list += color.getKeyword();
		}
		this.console.out(list+"\n");
	}
	
	public void showSecret() {
		this.console.out("XXXX\n");
	}
}
