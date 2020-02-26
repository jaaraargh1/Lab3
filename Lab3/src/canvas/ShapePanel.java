package canvas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShapePanel extends JPanel {
	private static ArrayList<ShapeButton> shapeButtons = new ArrayList<>();

	public ShapePanel()

	{

		setLayout(new FlowLayout(0, 4, 0));
		add(new JLabel("Form"));
		ShapeButton buttonRect = new ShapeButton(1);

		ShapeButton buttonTri = new ShapeButton(3);
		ShapeButton buttonCircle = new ShapeButton(2);
		shapeButtons.add(buttonCircle);
		shapeButtons.add(buttonTri);
		shapeButtons.add(buttonRect);

		add(buttonRect);
		buttonRect.setText("Rect");
		buttonRect.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		buttonRect.setBorderPainted(false);
		add(buttonCircle);
		buttonCircle.setText("Circle");
		buttonCircle.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		buttonCircle.setBorderPainted(false);

		add(buttonTri);
		buttonTri.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		buttonTri.setBorderPainted(false);

		buttonTri.setText("Tri");

	}

	public static void setBorderPaintedArray() {

		for (ShapeButton x : shapeButtons) {
			int temp = x.getI();
			System.out.println(x.getI());
			if (temp == Rityta.getCurrentShape()) {
				x.setBorderPainted(true);
			} else {
				x.setBorderPainted(false);
			}
		}
	}

}