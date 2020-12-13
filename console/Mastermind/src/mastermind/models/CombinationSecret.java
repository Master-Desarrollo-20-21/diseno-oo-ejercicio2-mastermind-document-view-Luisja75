package mastermind.models;

import java.util.Collections;
import java.util.Random;

import mastermind.types.Color;

public class CombinationSecret extends Combination {
	
	private int numberWhites;
	private int numberBlacks;

	public CombinationSecret() {
		numberWhites = 0;
		numberBlacks = 0;
		do {
			this.set();
		} while (this.hasColorDuplicate());			
	}

	public void set() {
        for (Color color : Color.values()) {
            if (!color.isNull()) this.colors.add(color);
        }
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < (Color.length() - 1) - Combination.NUMBER_COLORS; i++) {
            this.colors.remove(random.nextInt(this.colors.size()));
        }
        Collections.shuffle(this.colors);	
    }
		
	public void showSecret() {
		this.console.out("XXXX\n");
	}
	
	public int getNumberBlacks(CombinationProposed combinationProposed) {
		assert combinationProposed != null;
		
		this.checkHits(combinationProposed);
		return numberBlacks;
	}

	public int getNumberWhites(CombinationProposed combinationProposed) {
		assert combinationProposed != null;
		
		this.checkHits(combinationProposed);
		return numberWhites;
	}
	
	private void checkHits(CombinationProposed combinationProposed) {
		assert combinationProposed != null;
		
		numberWhites = 0;
		numberBlacks = 0;
		for (int i=0; i<combinationProposed.colors.size(); i++) {
			Color color = combinationProposed.colors.get(i);
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
