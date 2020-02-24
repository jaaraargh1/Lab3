package shape;

import java.io.Serializable;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public abstract class Shape extends JComponent implements Serializable {
	private int x;
	private int y;
	private Color currentColor;
	private int width;
	private int height;

	public Shape(int x, int y, Color currentColor, int width, int height) {
		this.x = x;
		this.y = y;
		this.currentColor = currentColor;
		this.height = height;
		this.width = width;
	}


	public int getXcord() {
		return x;
	}

	public void setXcord(int x) {
		this.x = x;
	}

	public int getYcord() {
		return y;
	}

	public void setYcord(int y) {
		this.y = y;
	}

	public Color getCurrentColor() {
		return currentColor;
	}

	public void setCurrentColor(Color currentColor) {
		this.currentColor = currentColor;
	}


	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
