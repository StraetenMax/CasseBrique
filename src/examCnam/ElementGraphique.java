package examCnam;

public class ElementGraphique {
	//propriétés
	private String nom;
	private int hauteur, largeur;

	//constructeurs vide et initialisé
	public ElementGraphique(){
		nom ="";
		hauteur =0;
		largeur = 0;
	}
	public ElementGraphique(String nom, int hauteur, int largeur){
		this.nom = nom;
		this.hauteur = hauteur;
		this.largeur = largeur;
	}
	//accesseurs et mutateurs
	public String getNom(){
		return nom;
	}
	public int getHauteur(){
		return hauteur;
	}
	public int getLargeur(){
		return largeur;
	}
	public void setNom(String nom){
		this.nom =nom;
	} 
	public void setHauteur(int hauteur){
		this.hauteur= hauteur;
	}
	public void setLargeur(int largeur){
		this.largeur= largeur;
	}
	
	//méthodes
	public String afficher(){
		String str = "Element affiché";
		return str;
	}
	public String masquer(){
		String str1 = "Element masqué";
		return str1;
	}
	public String description(){
		String str2 = "Element graphique nommé : "+this.getNom()+" qui a "+this.getHauteur()+" pixels de haut et "+this.getLargeur()+" pixels de large";
		return str2;
	}
}
