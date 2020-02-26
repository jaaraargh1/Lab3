package listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import canvas.*;

public class Listener implements MouseListener {

	private Rityta rityta;

	public Listener(Rityta rityta) {
		this.rityta = rityta;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		rityta.clickAt(e.getX(), e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}