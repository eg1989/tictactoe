package view;

import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

public class MainFrame extends JFrame implements Observer {
	
	private MainPanel mainPanel;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("TicTacToe");
		this.setSize(new Dimension(400,300));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		// Initialisiere MainPanel
		this.mainPanel = new MainPanel();
		this.add(this.mainPanel);
		
		// Neu Zeichnen
		this.repaint();
	}

	@Override
	public void update(Observable board, Object board_event) {
		this.mainPanel.update(board,board_event);
	}

}
