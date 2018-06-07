package view;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
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

}
