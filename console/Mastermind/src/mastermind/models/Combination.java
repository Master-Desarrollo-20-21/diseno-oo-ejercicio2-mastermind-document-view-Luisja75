package mastermind.models;

import java.util.ArrayList;
import java.util.List;
import mastermind.types.Color;

public abstract class Combination {
	
	public static final int NUMBER_COLORS = 4;
	
	protected List<Color> colors;
	
	public Combination() {
		colors = new ArrayList<>(Combination.NUMBER_COLORS);
	}
		
	public List<Color> getColors(){
		return this.colors;
	}
}
