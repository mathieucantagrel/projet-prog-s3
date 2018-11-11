package map;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Game;
import org.newdawn.slick.Image;



/**
 * @author Johann
 *
 */
public class MenuGame extends BasicGameState {
	Image playNow;
	Image exitGame;
	
	public static void main(String[] args) throws SlickException {
		new AppGameContainer((Game) new MenuGame(), 1200, 1000, false).start();
	}
	@Override
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		playNow = new Image("image/jouer.png");
		exitGame = new Image("image/quitter.png");

	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		g.drawString("Welcome la classe!", 100,50);
		playNow.draw(500, 400);
		exitGame.draw(300, 600);

	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
		int posX = Mouse.getX();
		int posY = Mouse.getY();
		//bouton start
		if((posX>100 && posX<311) && (posY>209 && posY<260)){
			if(Mouse.isButtonDown(0)){
				game.enterState(1);
			}
		}
		//bouton quitter
		if((posX>100 &&posX<311)&& (posY>109 && posY<160)){
			if(Mouse.isButtonDown(0)) {
				System.exit(0);
			}
		}

	}

	@Override
	public int getID() {
		return 0;
	}	

}
