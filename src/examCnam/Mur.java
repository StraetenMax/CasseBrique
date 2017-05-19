package examCnam;

public class Mur extends ElementFixe{
	//propriétés
	private String couleur;
	
	//constructeurs vide et initialisé
	public Mur(){
		super();
		couleur = "";
	}
	public Mur(String nom, int hauteur, int largeur, int x, int y, String couleur){
		super(nom, hauteur, largeur, x, y);
		this.couleur =couleur;
	}
	
	//accesseurs et mutateurs
	
}
