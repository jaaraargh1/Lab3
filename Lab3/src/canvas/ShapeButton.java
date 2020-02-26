package canvas;

import javax.swing.JButton;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class ShapeButton extends JButton {
	private int tempI;

	public ShapeButton(int i) {
		tempI = i;
		addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				Rityta.setCurrentForm(i);
				ShapePanel.setBorderPaintedArray();
			}

		});

	}

	public int getI() {
		return tempI;
	}

}
