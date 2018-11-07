import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetres1 extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private Fenetres1 fen;
	private JPanel pan = new panneau("src/images/123.png");
	private bouton bouton = new bouton("Jouer", "src/images/button.png"); 
	private JPanel container = new JPanel();
	
	public Fenetres1()
	{
		this.setTitle("illuminati"); //titre de la fenetre
		this.setSize(1200, 1000); //taille de la fenetre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		container.setLayout(new BorderLayout());
		container.add(pan, BorderLayout.CENTER);
		container.add(bouton, BorderLayout.SOUTH);
		this.setContentPane(container);
		
		//classe interne qui ecoute le bouton
		bouton.addActionListener(this);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent arg0)
	{
		this.dispose();
		//fen = new Fenetres1("ilu",615,390, JFrame.EXIT_ON_CLOSE,2,"Jouer");
	}

}
