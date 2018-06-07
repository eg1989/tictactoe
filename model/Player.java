package model;

public class Player {
	
	private String name;
	private FieldType type;
	
	public Player(String name, FieldType type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return this.name;
	}
	
	public FieldType getType() {
		return this.type;
	}
}
