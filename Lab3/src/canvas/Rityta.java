package canvas;

import javax.swing.JPanel;
import listener.Listener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import shape.*;

public class Rityta extends JPanel {

	private int x, y;
	private Graphics g;
	private Modell ritModell;
	private int getshape;

	public Rityta() {
		this.addMouseListener(new Listener(this));
		this.setVisible(true);
		this.setBackground(Color.WHITE);

	}

	public void paintComponent(Graphics g) {
//case 0
		ritModell.addShape(new Circle(x, y, Color.BLACK, 25, 25));
//case 1		
		ritModell.addShape(new Rectangle(x, y, Color.BLACK, 25, 25));
//case 2
	}

	public void clickAt(int x, int y) {
		this.x = x;
		this.y = y;

		repaint();
	}
}