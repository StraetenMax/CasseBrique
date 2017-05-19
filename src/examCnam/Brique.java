package examCnam;

public class Brique extends ElementFixe {
	//propriétés
	private int niveau;
	private boolean aAfficher;

	//constructeurs vide et initialisé
	public Brique(){
		super();
		niveau =0;
		this.getAAfficher();
	}
	public Brique(String nom, int hauteur, int largeur, int x, int y,int niveau){
		super(nom, hauteur, largeur, x, y);
		this.niveau = niveau;
		this.getAAfficher();
	}
	
	//accesseurs et mutateurs
	public int getNiveau(){
		return niveau;
	}
	public void setNiveau(int niveau){
		this.niveau = niveau;
	}
	public boolean getAAfficher(){
		return aAfficher;
	}
	public void setAAfficher(boolean aAfficher){
		if(this.getNiveau() == 0){
			aAfficher = false;
		}else{
			aAfficher = true;
		}
	}
			//méthodes
	
}
