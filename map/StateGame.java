package map;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.AppGameContainer;


public class StateGame extends StateBasedGame {

	public static void main(String[] args) throws SlickException {
		new AppGameContainer(new StateGame(), 1200, 1000, false).start();
	}

	public StateGame() {
		super(" les illuminati!");
	}

	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		addState(new MenuGame());
	}

}