package debug;

import model.Board;
import model.FieldType;

public class Debug {

	public static void main(String[] args) {
		Board b = new Board();
		b.placeSignAt(2, 1, FieldType.CROSS);
		b.placeSignAt(2, 3, FieldType.CIRCLE);
		System.out.println(b);
	}

}
