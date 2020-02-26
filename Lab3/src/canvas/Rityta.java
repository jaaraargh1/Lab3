package canvas;

import javax.swing.JPanel;
import listener.Listener;
import java.awt.Color;
import java.awt.Graphics;

import shape.*;

public class Rityta extends JPanel {

	private int x, y;
	private Modell ritModell;
	private static Color currentColor;
	private static int currentShape;

	public Rityta() {
		ritModell = new Modell();
		this.addMouseListener(new Listener(this));

		this.setVisible(true);
		this.setBackground(Color.WHITE);

	}

	public void paintComponent(Graphics g) {
		g.setColor(getBackground());
		g.fillRect(0, 0, getSize().width, getSize().height);

		ritModell.paint(g);

	}

	public void clear() {
		ritModell.reset();
		repaint();
	}

	public void clickAt(int x, int y) {
		switch (currentShape) {
		case 1:
			ritModell.addShape(new Rectangle(x, y, getCurrentColor(), 25, 25));
			break;
		case 2:
			ritModell.addShape(new CircleX(x, y, getCurrentColor(), 25, 25));
			break;
		case 3:
			ritModell.addShape(new Triangle(x, y, getCurrentColor(), 30, 30));
			break;
		}
		repaint();
	}

	public Modell getModel() {
		return this.ritModell;
	}

	public static void setColor(Color color) {
		setCurrentColor(color);
	}

	

	public static void setCurrentForm(int i) {
		currentShape = i;
	}

	public static int getCurrentShape() {
		return currentShape;
	}

	public static Color getCurrentColor() {
		return currentColor;
	}

	public static void setCurrentColor(Color currentColor) {
		Rityta.currentColor = currentColor;
	}

}