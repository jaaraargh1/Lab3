package shape;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {

	public Circle(int x, int y, Color currentColor, int width, int height) {
		super(x, y, currentColor, width, height);
	}

	@Override
	public void paintComponent(Graphics g) {
System.out.println("TEST");
		g.setColor(getCurrentColor());
		g.fillOval(getXcord(), getYcord(), 25, 25);
		g.drawOval(getXcord(), getYcord(), 25, 25);

	}


 
}
