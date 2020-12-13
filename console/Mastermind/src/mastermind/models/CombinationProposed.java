package mastermind.models;

import mastermind.types.Error;
import mastermind.types.Color;

public class CombinationProposed  extends Combination {

	public void set() {
        Error error;        
        do {
            error = Error.NULL;
			this.console.out("\nPropose a combination: ");
            String characters = this.console.inString();

            if (characters.length() != Combination.NUMBER_COLORS) {
    			this.console.out("WRONG_LENGTH");
                error = Error.WRONG_LENGTH;
            } else {
                for (int i = 0; i < characters.length(); i++) {
                	if (this.hasColorIncorrect(characters.charAt(i))){
            			this.console.out("WRONG_CHARACTERS");
                        error = Error.WRONG_CHARACTERS;
                    } else {
                    	Color color = Color.getColor(characters.charAt(i));
                        this.colors.add(color);
                    }
                }
            	if (this.hasColorDuplicate()){
        			this.console.out("DUPLICATED");
            		error = Error.DUPLICATED;
            	}       		
            }

            if (!error.isNull()) {
    			this.console.out("Wrong colors, they must be " + Combination.NUMBER_COLORS + " not repeat of: " + Color.getListKeyword());
                this.colors.clear();
            }
        } while (!error.isNull());
	}

	public void show() {
		String list = "";
		for (Color color: this.colors)
		{
			list += color.getKeyword();
		}
		this.console.out(list);
	}	
}
