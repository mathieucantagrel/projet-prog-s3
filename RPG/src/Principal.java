import javax.swing.JFrame;

public class Principal {

	public static Scene scene;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Création de la fenetre
		JFrame fenetre = new JFrame("jeu");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(1200,1000);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
		
		//Instanciation de l'objet scene
		scene = new Scene();
		fenetre.setContentPane(scene);
		fenetre.setVisible(true);
		
	}

}
