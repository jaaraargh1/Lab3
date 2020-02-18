package canvas;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class Rityta extends JPanel {

	public Rityta() {
		// this.addMouseListener(new Listener());
		this.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		System.out.println("Ritar ut fuel guage!");
		// getPreferredSize();
		g.setColor(Color.BLACK);
		g.fillOval(200, 200, 55, 55);
		g.drawOval(200, 200, 55, 55);

	}
}