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
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	
	//méthodes
	public String afficher(){
		String str = "Element fixe affiché";
		return str;
	}
	public String description(){
		String str1 = super.description()+" qui est en position X "+this.getX()+" et position Y "+this.getY();
		return str1;
	}
	

}
