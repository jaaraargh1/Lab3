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
	private ArrayList<Shape> shapes;

	public Modell() {
		shapes = new ArrayList<Shape>();
	}

	public ArrayList<Shape> getShapes() {
		return this.shapes;
	}

	public void addShape(Shape shape) {
		this.shapes.add(shape);

	}

	//public void createShape(int x, int y, Color currentColor, int width, int height) {

//	}

	public ArrayList<Shape> getListOfAllShapes() {
		return this.shapes;
	}

	public void reset(Object ritModell) {
		repaint();

	}

}
