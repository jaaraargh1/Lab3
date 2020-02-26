package canvas;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class ColourButton extends JButton {

	public ColourButton(Color color) {

		setBackground(color);
		addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				Rityta.setColor(color);
				Colours.setBorderPaintedArray();
			}

		});
	}
}
