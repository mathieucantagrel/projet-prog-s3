import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Scene extends JPanel {
	
	private ImageIcon icoFond;
	private Image imgFond1;
	
	private ImageIcon icoPerso;
	private Image imgPerso1;
	
	/*private ImageIcon icoMario;
	private Image imgMario;*/
	 
	private int xFond1;
	
	
	//**** CONSTRUCTEUR ****//
	public Scene() {
		
		super();
		
		this.xFond1 = -50;
		
		icoFond = new ImageIcon("src/Images/image.png");
		this.imgFond1 = this.icoFond.getImage();
		
		icoPerso = new ImageIcon("src/Images/perso.png");
		this.imgPerso1 = this.icoPerso.getImage();
		
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
		
		g2.drawImage(this.imgFond1, this.xFond1, 0, null);
		g2.drawImage(this.imgPerso1, 80, 50, null);
	}

}
