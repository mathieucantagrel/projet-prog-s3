import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class Player {
		  
	private float x = 500, y =500;
	private int direction = 3;
	private boolean moving = false;
	private Animation[] mooving = new Animation[8];
	private Animation[] attackk = new Animation[8];
	private Animation[] sword= new Animation[8];
	private boolean onStairL = false;
	private boolean onStairR = false;
	private Map map;
	int run;
	private boolean attack;
	
	public Player(Map map) {
	    this.map = map;
	}
	
	public void init() throws SlickException {
		SpriteSheet spritewalk = new SpriteSheet("resources/characters/player/Hero_Walk.png", 64, 64);
		SpriteSheet spriteattack = new SpriteSheet("resources/characters/player/playermvt.png", 64, 64);
		SpriteSheet spritesword = new SpriteSheet("resources/weapons/long_sword/WEAPON_longsword.png", 192, 192);
		this.mooving[0] = loadAnimation(spritewalk, 0, 1, 0);
	    this.mooving[1] = loadAnimation(spritewalk, 0, 1, 1);
	    this.mooving[2] = loadAnimation(spritewalk, 0, 1, 2);
	    this.mooving[3] = loadAnimation(spritewalk, 0, 1, 3);
	    this.mooving[4] = loadAnimation(spritewalk, 1, 9, 0);
	    this.mooving[5] = loadAnimation(spritewalk, 1, 9, 1);
	    this.mooving[6] = loadAnimation(spritewalk, 1, 9, 2);
	    this.mooving[7] = loadAnimation(spritewalk, 1, 9, 3);
		this.attackk[0] = loadAnimation(spriteattack, 0, 1, 0);
	    this.attackk[1] = loadAnimation(spriteattack, 0, 1, 1);
	    this.attackk[2] = loadAnimation(spriteattack, 0, 1, 2);
	    this.attackk[3] = loadAnimation(spriteattack, 0, 1, 3);
	    this.attackk[4] = loadAnimation(spriteattack, 1, 6, 0);
	    this.attackk[5] = loadAnimation(spriteattack, 1, 6, 1);
	    this.attackk[6] = loadAnimation(spriteattack, 1, 6, 2);
	    this.attackk[7] = loadAnimation(spriteattack, 1, 6, 3);
	    this.sword[0] = loadAnimation(spritesword, 0, 1, 0);
	    this.sword[1] = loadAnimation(spritesword, 0, 1, 1);
	    this.sword[2] = loadAnimation(spritesword, 0, 1, 2);
	    this.sword[3] = loadAnimation(spritesword, 0, 1, 3);
	    this.sword[4] = loadAnimation(spritesword, 1, 6, 0);
	    this.sword[5] = loadAnimation(spritesword, 1, 6, 1);
	    this.sword[6] = loadAnimation(spritesword, 1, 6, 2);
	    this.sword[7] = loadAnimation(spritesword, 1, 6, 3);
	}

	private Animation loadAnimation(SpriteSheet spriteSheet, int startX, int endX, int y) {
		Animation animation = new Animation();
		for (int x = startX; x < endX; x++) {
			animation.addFrame(spriteSheet.getSprite(x, y),70);
		}
		return animation;
	}
	
	private void attackAnimation(Graphics g){
		if(attack) {
	    	g.drawAnimation(attackk[direction+4], x-32, y-60);
		   	g.drawAnimation(sword[direction+4], x-97, y-125);
	    }
	}
	
	public void render(Graphics g) throws SlickException {
	    g.setColor(new Color(0, 0, 0, .5f));
	    g.fillOval(x - 16, y - 8, 32, 16);
	    attackAnimation(g);
	    if(!attack) {g.drawAnimation(mooving[direction + (moving ? 4 : 0)], x-32, y-60);}
	}
	

	public void update(int delta) {
		if (this.moving) {
			float futurX = getFuturX(delta);
		    float futurY = getFuturY(delta);
		    boolean collision = this.map.isCollision(futurX, futurY);
		    if (collision) {
		    	this.moving = false;
		    } else {
		    	this.x = futurX;
		    	this.y = futurY;
		    }
		}
		
	}

	private float getFuturX(int delta) {
		float futurX = this.x;
		switch (this.direction) {
		case 1: futurX = this.x - .1f * delta * run; break;
		case 3: futurX = this.x + .1f * delta * run; break;
		}
		return futurX;
	}

	private float getFuturY(int delta) {
		float futurY = this.y;
			switch (this.direction) {
			case 0: futurY = this.y - .1f * delta * run; break;
			case 2: futurY = this.y + .1f * delta * run; break;
			case 1: if (this.onStairR) {
				futurY = this.y + .1f * delta * run;
			}
			if (this.onStairL) {
				futurY = this.y - .1f * delta * run;
			}
			break;
			case 3: if (this.onStairR) {
				futurY = this.y - .1f * delta * run;
				}
				if (this.onStairL) {
					futurY = this.y + .1f * delta * run;
			 	}break;
			}
		return futurY;
	}
	
	public float getX() { return x; }
	public void setX(float x) { this.x = x; }
	public float getY() { return y; }
	public void setY(float y) { this.y = y; }
	public int getDirection() { return direction; }
	public void setDirection(int direction) { this.direction = direction; }
	public boolean isMoving() { return moving; }
	public void setMoving(boolean moving) { this.moving = moving; }
	public void setAttack(boolean attack) { this.attack = attack; }
	public boolean isOnStairL() { return onStairL; }
	public void setOnStairL(boolean onStairL) { this.onStairL = onStairL; }
	public boolean isOnStairR() { return onStairR; }
	public void setOnStairR(boolean onStairR) { this.onStairR = onStairR; }
}
