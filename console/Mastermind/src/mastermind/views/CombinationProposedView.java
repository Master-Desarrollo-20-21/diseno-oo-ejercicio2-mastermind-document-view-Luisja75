package mastermind.views;

import mastermind.models.Combination;
import mastermind.models.CombinationProposed;
import mastermind.types.Color;
import mastermind.types.Error;
import utils.Console;

public class CombinationProposedView {
	private CombinationProposed combinationProposed;
	private Console console;
	
	public CombinationProposedView(CombinationProposed combinationProposed) {
		this.combinationProposed = combinationProposed;
		this.console = new Console();
	}
	
	public CombinationProposed read() {
        Error error;        
        do {
            error = Error.NULL;
			this.console.out("\nPropose a combination: ");
            String characters = this.console.inString();

            if (characters.length() != Combination.NUMBER_COLORS) {
                error = Error.WRONG_LENGTH;
            } else {
                for (int i = 0; i < characters.length(); i++) {
                	if (this.hasColorIncorrect(characters.charAt(i))){
                        error = Error.WRONG_CHARACTERS;
                    } else {
                    	Color color = Color.getColor(characters.charAt(i));
                    	this.combinationProposed.getColors().add(color);
                    }
                }
            	if (this.hasColorDuplicate()){
            		error = Error.DUPLICATED;
            	}       		
            }

            if (!error.isNull()) {
            	new ErrorView(error).show();
    			this.combinationProposed.getColors().clear();
            }
        } while (!error.isNull());
        
        return this.combinationProposed;
	}
	
	public void show() {
		String list = "";
		for (Color color: this.combinationProposed.getColors())
		{
			list += color.getKeyword();
		}
		this.console.out(list);
	}
	
	private boolean hasColorDuplicate() {
		for (int i=0; i < combinationProposed.getColors().size(); i++) {
			Color color = (Color)combinationProposed.getColors().get(i);
			for (int j=i+1; j < combinationProposed.getColors().size(); j++) {
				if (color == (Color)combinationProposed.getColors().get(j)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean hasColorIncorrect(char character)
	{
		Color color = Color.getColor(character);
		return color.isNull();
	}	
}
