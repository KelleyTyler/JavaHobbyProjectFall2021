package test00c;

import javafx.event.ActionEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public interface GameWinInt {
	public void kEvent(KeyEvent e);
	public void mEvent(MouseEvent e);
	public void aEvent(ActionEvent e);
	//public void tTick(Actionevent)
	public boolean isQuit();
	public int swapPanes();
	public int getPaneX();
	public int getPaneY();
	
}
