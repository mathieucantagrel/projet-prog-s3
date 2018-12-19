import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Action {
	
	boolean showi;
	boolean panel;
	
	private Image inventory;
	private Image item;
	
	public void init() throws SlickException {
		this.showi=false;
		this.inventory = new Image("resources/blocks/inventory.png");
		this.item = new Image("resources/characters/miniatures/skeleton.png").getScaledCopy((float) 0.04);
	}
	
	public void render(GameContainer container, Graphics g) {
		if(showi){
			g.drawImage(inventory, container.getWidth()/3+75, container.getHeight()/3);
			g.drawImage(item,container.getWidth()/3+75, container.getHeight()/3);
			
		}
	}
	
	public void update(GameContainer container){

	}

	public void setShowi(boolean b) {
		this.showi=b;
	}

}
