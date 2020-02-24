package canvas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class Buttons extends JFrame {

	public Buttons(final Modell ritModell) {
		this.setLayout(new BorderLayout());
		final JButton rensa = new JButton("Rensa");
		this.add(rensa, BorderLayout.WEST);
	

	

		rensa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		//		ritModell.reset();
			}

		});
	}
}