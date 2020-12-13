package mastermind.types;

public enum Color{
	RED('r'),
	BLUE('b'),
	YELLOW('y'),
	GREEN('g'), 
	ORANGE('o'), 
	PURPLE('p'),
	NULL(' ');
	
	private char keyword;
	
	Color (char  keyword){
		this.keyword = keyword;	
	}
		
	public char getKeyword(){
		return keyword;
	}
	
	public static int length() {
		return Color.values().length;
	}

	public boolean isNull() {
		return this == Color.NULL;
	}
	
	public static String getListKeyword() {
		String list = "";
		for (Color color: Color.values())
		{
			if (list != ""){
				list += ", ";
			}
			list += color.keyword;
		}
		return list;
	}
	
    public static Color getColor(char character) {
        for (int i = 0; i < Color.length(); i++) {
            if (Color.values()[i].getKeyword() == character) {
                return Color.values()[i];
            }
        }
        return Color.NULL;
    }
}
