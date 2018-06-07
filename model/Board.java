package model;

public class Board {
	
	private Field[][] fields;
	
	private static final int BOARD_SIZE=3;
	
	public Board() {
		this.fields = new Field[BOARD_SIZE][BOARD_SIZE];
		for(int i = 0;i<this.fields.length;i++) {
			for(int j = 0;j<this.fields[i].length;j++) {
				this.fields[i][j] = new Field();
			}
		}
	}
		
	public void placeSignAt(int row, int column, FieldType type) throws IllegalArgumentException, IllegalStateException {
		if(row>3 || column>3 || row<0 || column<0) throw new IllegalArgumentException("parameters should be within a range between 0 and 3");
		if(this.fields[row-1][column-1].getType()!=FieldType.NONE) throw new IllegalStateException("There is already a sign placed at this field");
		this.fields[row-1][column-1].setType(type);
	}
	
	public FieldType getSignAt(int row, int column) {
		if(row>3 || column>3 || row<0 || column<0) throw new IllegalArgumentException("parameters should be within a range between 0 and 3");
		return this.fields[row-1][column-1].getType();
	}
	
	public void resetFields() {
		for(int i = 0;i<this.fields.length;i++) {
			for(int j = 0;j<this.fields[i].length;j++) {
				this.fields[i][j].setType(FieldType.NONE);;
			}
		}
	}
	
	public String toString() {
		String s = new String();
		for(int i = 0;i<this.fields.length;i++) {
			s = s + "|" + " ";
			for(int j = 0;j<this.fields[i].length;j++) {
				s = s + this.fields[i][j] + " ";
			}
			s = s + "|" + "\n";
		}		
		return s;
	}

}
