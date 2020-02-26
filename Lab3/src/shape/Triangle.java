package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Triangle extends Shapex {


	public Triangle(int x, int y, Color currentColor, int width, int height) {
		super(x, y, currentColor, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(getCurrentColor());

		int[] xP = { getXcord() - (getHeight() / 2), getXcord() + (getHeight() / 2), getXcord()};

		int[] yP = { getYcord() + (getHeight() / 2), getYcord() + (getHeight() / 2), getYcord() - (getHeight() / 2)};
		g.fillPolygon(xP, yP, 3);
	}

}
