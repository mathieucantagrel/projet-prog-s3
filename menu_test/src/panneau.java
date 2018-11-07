import java.awt.Graphics;
import javax.swing.JPanel; 
import javax.swing.ImageIcon;

public class panneau extends JPanel{
	private static final long serialVersionUID = 1L;
	private ImageIcon img;
	public panneau(String fileName)
	{
		super();
		this.img = new ImageIcon(fileName);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(img.getImage(), 0, 0, this);
	}

}
