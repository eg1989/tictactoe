package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MainPanel extends JPanel{
	
	public MainPanel() {
		
		this.repaint();
	}
	
	public void paint(Graphics g) {
		
		int offset_x=50;
		int offset_y=50;
		
		g.setColor(Color.BLACK);
		
		// Vertikale Linien zeichnen
		g.drawLine(50+offset_x, 0+offset_y, 50+offset_x, 150+offset_y);
		g.drawLine(100+offset_x, 0+offset_y, 100+offset_x, 150+offset_y);
		
		// Horizontale Linien zeichnen
		g.drawLine(0+offset_x, 50+offset_y, 150+offset_x, 50+offset_y);
		g.drawLine(0+offset_x, 100+offset_y, 150+offset_x, 100+offset_y);
	}

}
