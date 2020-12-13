package mastermind.models;

public class Board {

	private static final int NUMBER_MAXIMUN_ATTEMPTS = 10;
	
	private boolean win;
	private int currentAttempt;
	private Attempt[] attempts;
	private CombinationSecret combinationSecret;
	
	public Board() {
		this.reset();
	}
	
	private void reset(){
		currentAttempt = 0;
		win = false;
		combinationSecret = new CombinationSecret();
		attempts = new Attempt[NUMBER_MAXIMUN_ATTEMPTS+1];
		for (int i=0; i<=NUMBER_MAXIMUN_ATTEMPTS; i++) {
			attempts[i] = new Attempt(combinationSecret);
		}
	}
	
	public void addCombinationProposed(CombinationProposed combinationProposed) {
		assert combinationProposed != null;

		this.attempts[this.currentAttempt].setCombinationProposed(combinationProposed);
		win = this.attempts[this.currentAttempt].isSecret();
		this.currentAttempt++;
	}

	public boolean isFinish() {
		return (this.currentAttempt <= NUMBER_MAXIMUN_ATTEMPTS && !win);	
	}
	
	public boolean isWin() {
		return win;
	}
		
	public Attempt[] getAttempts(){
		return this.attempts;
	}
	
	public int getCurrentAttempt(){
		return this.currentAttempt;
	}
	
	public CombinationSecret getCombinationSecret() {
		return this.combinationSecret;
	}	
}
