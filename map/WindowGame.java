package map;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

/**
 * @author Johann
 *
 */
public class WindowGame extends BasicGame {
	
	private GameContainer container;
	
	public static void main(String[] args) throws SlickException {
	    new AppGameContainer(new WindowGame(), 800, 600, false).start();
	}
	
	public WindowGame() {
		super("illuminati :: Windowgame");
	}
	@Override
	public void init(GameContainer container) throws SlickException{
		this.container = container;
	}
	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
	}
	
	@Override
	public void update(GameContainer container, int delta) throws SlickException {
	}
	
	@Override
	public void keyReleased(int key, char c) {
		if (Input.KEY_ESCAPE == key) {
			container.exit();
    	}
	}
	
}
