package listener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Listener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Vi klickade i komponenten! på " +
				e.getX() + "," + e.getY());
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