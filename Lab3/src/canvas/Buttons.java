package canvas;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends JPanel {

	public Buttons(Rityta rityta) {

		this.setLayout(new BorderLayout());

		final JButton rensa = new JButton("Rensa");

		this.add(rensa, BorderLayout.WEST);
		rensa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				
				rityta.clear();
			}	

		});
	}
}