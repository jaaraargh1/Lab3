package canvas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Canvas extends JFrame {
	private Buttons clearButtons;

	public Canvas() {
		super("Välkommen till ritprogrammet!");

		setLayout(new BorderLayout());

		Rityta rityta = new Rityta();
		JPanel eastPanel = new JPanel();
		JPanel northPanel = new JPanel();
		JPanel westPanel = new JPanel();
		Buttons clearButtons = new Buttons(rityta);
		Colours colourButtons = new Colours();
		ShapePanel shapeButtons = new ShapePanel();
		clearButtons.setSize(80, 90);
		northPanel.add(shapeButtons);
		westPanel.add(clearButtons, BorderLayout.WEST);
		getContentPane().add(rityta);
		/// temp holder
		this.add(colourButtons, BorderLayout.EAST);
		this.add(northPanel, BorderLayout.NORTH);
		this.add(rityta, BorderLayout.CENTER);
		this.add(westPanel, BorderLayout.SOUTH);

		this.setLocationRelativeTo(null);


		this.setSize(800, 600);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		revalidate();

	}
}
