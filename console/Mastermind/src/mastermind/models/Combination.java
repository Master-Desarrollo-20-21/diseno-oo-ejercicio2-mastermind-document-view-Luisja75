package mastermind.models;

import java.util.ArrayList;
import java.util.List;
import mastermind.types.Color;
import utils.Console;

public abstract class Combination {
	
	public static final int NUMBER_COLORS = 4;
	
	protected Console console;
	protected List<Color> colors;
	
	public Combination() {
		colors = new ArrayList<>(Combination.NUMBER_COLORS);
		console = new Console();
	}
		
	public List<Color> getColors(){
		return this.colors;
	}
}
