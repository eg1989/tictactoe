package model;

import java.util.Observable;

public class GameBoard extends Observable {
	
	private Board board;
	private Player player1;
	private Player player2;
	private Player player_turn;
	
	
	public GameBoard(String player1_name, String player2_name) {
		this.board = new Board();
		this.player1 = new Player(player1_name, FieldType.CIRCLE);
		this.player2 = new Player(player2_name, FieldType.CROSS);
		
		this.player_turn = this.player1;
	}
	
	public void makeMove(Move m) throws IllegalArgumentException {
		this.board.placeSignAt(m.getRow(), m.getColumn(), this.player_turn.getType());
		this.setChanged();
		if(player1Wins()) {
			this.notifyObservers(GameBoardEvent.WIN_CIRCLE);
		}
		else if(player2Wins()) {
			this.notifyObservers(GameBoardEvent.WIN_CROSS);
		}
		else if(isFullBoard()) {
			this.notifyObservers(GameBoardEvent.GAME_OVER);
		}
		else {
			this.togglePlayer();
			if(this.player_turn==player1) {
				this.notifyObservers(GameBoardEvent.TURN_CIRCLE);
			}
			else {
				this.notifyObservers(GameBoardEvent.TURN_CROSS);
			}
		}
	}
	
	private void togglePlayer() {
		if(this.player_turn==player1) {
			player_turn=player2;
			/*this.setChanged();
			this.notifyObservers(GameBoardEvent.GAME_OVER);*/
		}
		else {
			player_turn=player1;
			/*this.setChanged();
			this.notifyObservers(GameBoardEvent.GAME_OVER);*/
		}

	}
	
	public boolean gameOver() {
		return player1Wins()||player2Wins()||isFullBoard();
	}
	
	private boolean isFullBoard() {
		for(int i = 1;i<=3;i++) {
			for(int j =1;j<=3;j++) {
				if(this.board.getSignAt(i, j)==FieldType.NONE) return false;
			}
		}
		return true;
	}
	
	public boolean player1Wins() {
		return (horizontalWin()==this.player1.getType() || verticalWin()==this.player1.getType() || diagonalWin()==this.player1.getType());
	}
	
	public boolean player2Wins() {
		return (horizontalWin()==this.player2.getType() || verticalWin()==this.player2.getType() || diagonalWin()==this.player2.getType());
	}
	
	private FieldType horizontalWin() {
		for(int i =1;i<=3;i++) {
			FieldType type = this.board.getSignAt(i, 1);
			if(type!=FieldType.NONE) {
				if(type==this.board.getSignAt(i, 2) && type==this.board.getSignAt(i, 3)) return type;
			}
		}
		return FieldType.NONE;
	}
	
	private FieldType verticalWin() {
		for(int i =1;i<=3;i++) {
			FieldType type = this.board.getSignAt(1, i);
			if(type!=FieldType.NONE) {
				if(type==this.board.getSignAt(2, i) && type==this.board.getSignAt(3, i)) return type;
			}
		}
		return FieldType.NONE;	
	}
	
	private FieldType diagonalWin() {
		boolean ldiagonal_identity = this.board.getSignAt(1, 1)==this.board.getSignAt(2, 2) && this.board.getSignAt(2, 2)==this.board.getSignAt(3, 3);
		boolean rdiagonal_identity = this.board.getSignAt(1, 3)==this.board.getSignAt(2, 2) && this.board.getSignAt(2, 2)==this.board.getSignAt(3, 1);
		if(ldiagonal_identity || rdiagonal_identity) return this.board.getSignAt(2, 2);
		return FieldType.NONE;			
	}
	
	public String toString() {
		return this.board.toString();
	}


}
