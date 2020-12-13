package mastermind.models;

import java.util.ArrayList;
import java.util.List;
import mastermind.types.Color;
import utils.Console;

public abstract class Combination {
	
	protected static final int NUMBER_COLORS = 4;
	
	protected Console console;
	protected List<Color> colors;
	
	public Combination() {
		colors = new ArrayList<>(Combination.NUMBER_COLORS);
		console = new Console();
	}
	
	public abstract void set();	
	
	public abstract void show();	
	
	protected boolean hasColorDuplicate() {
		for (int i=0; i < this.colors.size(); i++) {
			Color color = (Color)this.colors.get(i);
			for (int j=i+1; j < this.colors.size(); j++) {
				if (color == (Color)this.colors.get(j)) {
					return true;
				}
			}
		}
		return false;
	}

	protected boolean hasColorIncorrect(char character)
	{
		Color color = Color.getColor(character);
		return color.isNull();
	}
}
