package mastermind.models;

import mastermind.types.Color;

public class CombinationProposed extends Combination {
	
	private int numberWhites;
	private int numberBlacks;
	
	public CombinationProposed() {
		numberWhites = 0;
		numberBlacks = 0;
	}

	public int getNumberBlacks(CombinationSecret combinationSecret) {
		assert combinationSecret != null;
		
		this.checkHits(combinationSecret);
		return numberBlacks;
	}

	public int getNumberWhites(CombinationSecret combinationSecret) {
		assert combinationSecret != null;
		
		this.checkHits(combinationSecret);
		return numberWhites;
	}
	
	private void checkHits(CombinationSecret combinationSecret) {
		assert combinationSecret != null;
		
		numberWhites = 0;
		numberBlacks = 0;
		for (int i=0; i<combinationSecret.colors.size(); i++) {
			Color color = combinationSecret.colors.get(i);
			this.checkColor(color,i);
		}
	}	
	
	private void checkColor(Color color, int position) {
		for (int i=0; i<this.colors.size(); i++) {
			if (color == this.colors.get(i)) {
				if (position==i) {
					numberBlacks++;
				}
				else {
					numberWhites++;
				}
			}
		}
	}		
}
