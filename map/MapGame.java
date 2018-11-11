package map;

import org.newdawn.slick.*;
import org.newdawn.slick.tiled.TiledMap;


/**
 * @author Johann
 */
public class MapGame extends BasicGame {

	private GameContainer container;
	private TiledMap map;

	public static void main(String[] args) throws SlickException {
		new AppGameContainer(new MapGame(), 1200, 1000, false).start();
	}

	public MapGame() {
		super("illuminé :: MapGame");
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		this.container = container;
		this.map = new TiledMap("image/exemple.tmx");
	}	

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		this.map.render(0, 0);
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
	}

	@Override
	public void keyReleased(int key, char c) {
		if (Input.KEY_ESCAPE == key) {
			this.container.exit();
		}
	}

}