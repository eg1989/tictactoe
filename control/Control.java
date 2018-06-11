package control;

import java.util.LinkedList;
import java.util.Observer;

import model.GameBoard;
import model.Move;

public class Control {
	
	private GameBoard board;
	
	public Control(GameBoard board, LinkedList<Observer> observers) {
		this.board = board;
		for(Observer o : observers) {
			this.board.addObserver(o);
		}
	}
	
	public void makeMove(Move m) {
		this.board.makeMove(m);
	}

}
