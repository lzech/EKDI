package ampel;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

public class IsKeyPressed {
	private static volatile boolean spacePressed = false;

	public static boolean isSpacePressed() {
		synchronized (IsKeyPressed.class) {
			return spacePressed;
		}
	}

	public static void main(String[] args) {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {

			@Override
			public boolean dispatchKeyEvent(KeyEvent ke) {
				synchronized (IsKeyPressed.class) {
					switch (ke.getID()) {
					case KeyEvent.KEY_PRESSED:
						if (ke.getKeyCode() == KeyEvent.VK_SPACE) {
							spacePressed = true;
						}
						break;

					case KeyEvent.KEY_RELEASED:
						if (ke.getKeyCode() == KeyEvent.VK_SPACE) {
							spacePressed = false;
						}
						break;
					}
					return false;
				}
			}
		});
	}
}