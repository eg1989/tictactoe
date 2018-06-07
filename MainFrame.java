import java.awt.Dimension;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("--Titel einfügen--");
		this.setSize(new Dimension(400,300));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
