package mastermind.models;

import utils.Console;

public class Attempt {

	private Console console;
	private CombinationSecret combinationSecret;
	private CombinationProposed combinationProposed;
	private int num_blacks;
	private int num_whites;

	public Attempt(CombinationSecret combinationSecret) {
		assert combinationSecret != null;
	
		this.combinationSecret = combinationSecret;
		this.combinationProposed = new CombinationProposed();
		num_blacks = 0;
		num_whites = 0;
		console = new Console();
	}
		
	public void setCombinationProposed() {
		combinationProposed.set();
		num_blacks = combinationSecret.getNumberBlacks(combinationProposed);
		num_whites = combinationSecret.getNumberWhites(combinationProposed);	
	}

	public void show() {
		combinationProposed.show();
		console.out(" --> " + num_blacks + " blacks " +  num_whites + " whites\n");
	}

	public boolean isSecret() {
		return num_blacks == Combination.NUMBER_COLORS;
	}
}
