import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;

public class ActionController implements KeyListener{
	
	Action action=new Action();
	Boolean axion;
	
	public ActionController(Action inventory) {
		this.action = inventory;
	}

	@Override
	public void inputEnded() {}

	@Override
	public void inputStarted() {}

	@Override
	public boolean isAcceptingInput() {return true;}

	@Override
	public void setInput(Input input) {}

	@Override
	public void keyPressed(int key, char c) {
		if(Input.KEY_I==key)
		{
			if(this.action.showi){this.action.showi=false;}
			else {this.action.showi=true;}
		}
	}

	@Override
	public void keyReleased(int arg0, char arg1) {
		// TODO Auto-generated method stub
		
	}

}
