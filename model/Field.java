package model;

public class Field {
	
	private FieldType type;
	
	public Field(){
		this.type = FieldType.NONE;
	}
	
	public void setType(FieldType type) {
		this.type = type;
	}
	
	public FieldType getType() {
		return this.type;
	}
	
	public String toString(){
		switch(type) {
			case NONE:
				return "_";
			case CIRCLE:
				return "O";
			case CROSS:
				return "X";
		}
		return null;
	}

}
