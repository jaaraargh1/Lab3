package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Triangle extends Shape {
private 	Integer[] xArr;
private 	Integer[] yArr;


	public Triangle(int x, int y, Color currentColor, int width, int height) {
		super(x, y, currentColor, width, height);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public void paintComponent(Graphics g) {
		System.out.println("asdf");
		g.setColor(getCurrentColor());


	}

}
