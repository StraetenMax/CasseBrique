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
	
	//accesseur et mutateur
	public String getCouleur(){
		return couleur;
	}
	public void setCouleur(String couleur){
		this.couleur = couleur;
	}
	
	//méthodes
	public boolean plusHautQue(Mur mr){
		boolean str;
		if(mr.getHauteur()<this.getHauteur()){
			str = true;
		}else{
			str = false;
		}
		return str;
	}
	public String description(){
		String str1 =super.description()+" qui est de couleur "+this.getCouleur();
		return str1;
	}
	
}
