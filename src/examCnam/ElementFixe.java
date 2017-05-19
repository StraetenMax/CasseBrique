package examCnam;

public class ElementFixe extends ElementGraphique{
	//propriétés
	private int x;
	private int y;
	
	//constructeurs vide et initialisé
	public ElementFixe(){
		super();
		x= 0;
		y= 0;
	}
	public ElementFixe(String nom, int hauteur, int largeur, int x, int y){
		super(nom, hauteur, largeur);
		this.x=x;
		this.y=y;
	}
	
	//accesseurs et mutateurs
	
	

}
