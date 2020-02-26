package canvas;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import shape.Shapex;

public class Colours extends JPanel {
	private static ArrayList<ColourButton> listOfColourButtons = new ArrayList<>();

	public Colours() {

		setLayout(new GridLayout(15, 15, 15, 0));
		add(new JLabel("Färg"));
		ColourButton buttonBlack = new ColourButton(Color.BLACK);
		ColourButton buttonRed = new ColourButton(Color.RED);
		ColourButton buttonBlue = new ColourButton(Color.BLUE);
		ColourButton buttonYellow = new ColourButton(Color.YELLOW);
		ColourButton buttonGreen = new ColourButton(Color.GREEN);
		ColourButton buttonOrange = new ColourButton(Color.ORANGE);
		ColourButton buttonPink = new ColourButton(Color.PINK);
		ColourButton button = new ColourButton(Color.WHITE);
		listOfColourButtons.add(button);
		listOfColourButtons.add(buttonBlack);
		listOfColourButtons.add(buttonRed);
		listOfColourButtons.add(buttonBlue);
		listOfColourButtons.add(buttonYellow);
		listOfColourButtons.add(buttonGreen);
		listOfColourButtons.add(buttonOrange);
		listOfColourButtons.add(buttonPink);
		add(button);
		button.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
		button.setBorderPainted(false);
		buttonBlack.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
		buttonBlack.setBorderPainted(false);
		add(buttonBlack);
		add(buttonRed);
		buttonRed.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
		buttonRed.setBorderPainted(false);
		add(buttonBlue);
		buttonBlue.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
		buttonBlue.setBorderPainted(false);
		add(buttonYellow);
		buttonYellow.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
		buttonYellow.setBorderPainted(false);
		add(buttonGreen);
		buttonGreen.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
		buttonGreen.setBorderPainted(false);
		add(buttonOrange);
		buttonOrange.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
		buttonOrange.setBorderPainted(false);
		add(buttonPink);
		buttonPink.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
		buttonPink.setBorderPainted(false);

	}

	public static void setBorderPaintedArray() {
		for (ColourButton x : listOfColourButtons) {
			Color cbt = x.getBackground();

			if (cbt == Rityta.getCurrentColor())
				x.setBorderPainted(true);
			else {
				x.setBorderPainted(false);
			}

		}

	}
}