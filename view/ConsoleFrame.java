package view;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

import control.Control;
import model.GameBoard;
import model.GameBoardEvent;
import model.Move;

public class ConsoleFrame implements Observer {
	
	private Control control;

	@Override
	public void update(Observable board, Object event) {
		GameBoardEvent evt = (GameBoardEvent)event;
		GameBoard gameboard = (GameBoard)board;
		System.out.println(gameboard);
		
		Scanner scan = new Scanner(System.in);
		
		
		if(evt==GameBoardEvent.TURN_CIRCLE) {
			
			System.out.println("Spieler1 (O) am Zug: ");
			String myLine = scan.nextLine();
		}
		else if(evt==GameBoardEvent.TURN_CROSS) {
			
			System.out.println("Spieler2 (X) am Zug: ");
			String myLine = scan.nextLine();
		}
		
		else if(evt==GameBoardEvent.WIN_CIRCLE) {
			System.out.println("Spieler1 (O) hat gewonnen!");
			String myLine = scan.nextLine();
		}
		
		else if(evt==GameBoardEvent.WIN_CROSS) {
			System.out.println("Spieler2 (X) hat gewonnen!");
			String myLine = scan.nextLine();
		}
		
		else {
			System.out.println("Unentschieden!");
			String myLine = scan.nextLine();
		}

	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	private Move moveConvert(String mv) {
		return new Move(1,1);
	}

}
