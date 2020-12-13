package mastermind.models;

import java.util.Collections;
import java.util.Random;

import mastermind.types.Color;

public class CombinationSecret extends Combination {

	public CombinationSecret() {
		set();
	}

	private void set() {
        for (Color color : Color.values()) {
            if (!color.isNull()) this.colors.add(color);
        }
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < (Color.length() - 1) - Combination.NUMBER_COLORS; i++) {
            this.colors.remove(random.nextInt(this.colors.size()));
        }
        Collections.shuffle(this.colors);	
    }			
}
