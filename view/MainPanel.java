package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;

import javax.swing.JPanel;

import model.Board;

public class MainPanel extends JPanel{
	
	private static final int offset_x=50;
	private static final int offset_y=50;
	
	public MainPanel() {
		
		this.repaint();
		
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				int column = ((e.getX()-offset_x)/50)+1;
				int row = ((e.getY()-offset_y)/50)+1;
				
				if(row>=1 && column>=1 && row<=3 && column <=3) {
					
				}
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	public void paint(Graphics g) {
		
		g.setColor(Color.BLACK);
		
		// Vertikale Linien zeichnen
		g.drawLine(50+offset_x, 0+offset_y, 50+offset_x, 150+offset_y);
		g.drawLine(100+offset_x, 0+offset_y, 100+offset_x, 150+offset_y);
		
		// Horizontale Linien zeichnen
		g.drawLine(0+offset_x, 50+offset_y, 150+offset_x, 50+offset_y);
		g.drawLine(0+offset_x, 100+offset_y, 150+offset_x, 100+offset_y);
	}
	
	public void update(Observable board, Object board_event) {
		
	}

}
