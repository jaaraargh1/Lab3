package canvas;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import shape.*;
import java.awt.Paint;
import shape.*;
import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.Graphics;
import shape.*;

public class Modell extends JPanel {
	private ArrayList<Shapex> shapes = new ArrayList<>();

	public Modell() {
		shapes = new ArrayList<Shapex>();
	}

	public ArrayList<Shapex> getShapes() {
		return this.shapes;
	}

	public void addShape(Shapex shape) {
		shapes.add(shape);
		repaint();
	}

	public void paint(Graphics g) {
		for (Shapex s : shapes) {
			s.paintComponent(g);
		}

	}



	public void reset() {
		this.shapes.clear();
	}

}
