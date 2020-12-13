package mastermind.models;

public class Attempt {

	private CombinationSecret combinationSecret;
	private CombinationProposed combinationProposed;
	private int numBlacks;
	private int numWhites;

	public Attempt(CombinationSecret combinationSecret) {
		assert combinationSecret != null;
	
		this.combinationSecret = combinationSecret;
		this.combinationProposed = new CombinationProposed();
		numBlacks = 0;
		numWhites = 0;
	}
		
	public void setCombinationProposed(CombinationProposed combinationProposed) {
		assert combinationProposed != null;

		this.combinationProposed = combinationProposed;
		numBlacks = combinationProposed.getNumberBlacks(combinationSecret);
		numWhites = combinationProposed.getNumberWhites(combinationSecret);	
	}

	public boolean isSecret() {
		return numBlacks == Combination.NUMBER_COLORS;
	}
	
	public int getNumBlacks(){
		return numBlacks;
	}
		
	public int getNumWhites(){
		return numWhites;
	}	
	
	public CombinationProposed getCombinationProposed() {
		return combinationProposed;
	}
}
