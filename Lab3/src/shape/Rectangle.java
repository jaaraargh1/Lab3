package shape;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {

	public Rectangle(int x, int y, Color currentColor, int width, int height) {
		super(x,y, currentColor,width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paintComponent(Graphics g) {
		
		g.setColor(getCurrentColor());
		g.fillRect(getXcord(), getYcord(), 25, 25);
		g.drawRect(getXcord(), getYcord(), 25, 25);

	}
	


}
