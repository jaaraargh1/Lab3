package canvas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Canvas extends JFrame {

	public Canvas() {
		super("Välkommen till ritprogrammet!");

		setLayout(new BorderLayout());
		Rityta rityta = new Rityta();
		JPanel eastPanel = new JPanel();
		JPanel northPanel = new JPanel();
		JPanel southPanel = new JPanel();

		getContentPane().add(rityta);

		eastPanel.setLayout(new GridLayout(15, 15, 15, 0));
		eastPanel.add(new JLabel("Färg"));
		JButton buttonBlack = new JButton();
		JButton buttonRed = new JButton();
		JButton buttonBlue = new JButton();
		JButton buttonYellow = new JButton();
		JButton buttonGreen = new JButton();
		JButton buttonOrange = new JButton();
		JButton buttonPink = new JButton();
		JButton button = new JButton();
		button.setBackground(Color.WHITE);
		buttonBlack.setBackground(Color.BLACK);
		buttonBlue.setBackground(Color.BLUE);
		buttonRed.setBackground(Color.RED);
		buttonYellow.setBackground(Color.YELLOW);
		buttonGreen.setBackground(Color.GREEN);
		buttonOrange.setBackground(Color.ORANGE);
		buttonPink.setBackground(Color.PINK);
		eastPanel.add(button);
		eastPanel.add(buttonBlack);
		eastPanel.add(buttonRed);
		eastPanel.add(buttonBlue);
		eastPanel.add(buttonYellow);
		eastPanel.add(buttonGreen);
		eastPanel.add(buttonOrange);
		eastPanel.add(buttonPink);

		southPanel.setLayout(new FlowLayout());

		this.add(northPanel, BorderLayout.NORTH);
		this.add(rityta, BorderLayout.CENTER);
		this.add(eastPanel, BorderLayout.EAST);
		this.add(southPanel, BorderLayout.SOUTH);

		southPanel.add(new JButton("Rensa"));

		this.setLocationRelativeTo(null);

		eastPanel.add(new JLabel("Form"));

		this.setSize(800, 600);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		revalidate();

	}
}
