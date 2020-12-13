package mastermind.models;

import utils.Console;

public class Board {

	private static final int NUMBER_MAXIMUN_ATTEMPTS = 10;
	
	private Console console;
	private boolean win;
	private int currentAttempt;
	private Attempt[] attempts;
	private CombinationSecret combinationSecret;
	
	public Board() {
		currentAttempt = 0;
		win = false;
		combinationSecret = new CombinationSecret();
		console = new Console();
		attempts = new Attempt[NUMBER_MAXIMUN_ATTEMPTS-1];
		for (int i=0; i<=NUMBER_MAXIMUN_ATTEMPTS; i++) {
			attempts[i] = new Attempt(combinationSecret);
		}
	}
	
	public void play() {
		do { 
			this.attempts[this.currentAttempt].setCombinationProposed();
			win = this.attempts[this.currentAttempt].isSecret();
			this.console.out(currentAttempt + " Attempt(s):\n");
			this.combinationSecret.showSecret();
			for(int i=0; i<=currentAttempt; i++) {
				this.attempts[i].show();
			}
			currentAttempt++;
		} while (currentAttempt <= NUMBER_MAXIMUN_ATTEMPTS && !win);	
	}
	
	public void showResult() {
		if (win) {
			console.out("You've won!!! :-)\n");
		} else {
			console.out("you've lost!!! :-(\n");
			console.out("Combination secret = ");
			combinationSecret.show();
		}				
	}
}
