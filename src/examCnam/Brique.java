package examCnam;

public class Brique extends ElementFixe {
	//propriétés
	private int niveau;
	private boolean aAfficher;

	//constructeurs vide et initialisé
	public Brique(){
		super();
		niveau =0;
		aAfficher = true;
	}
	public Brique(String nom, int hauteur, int largeur, int x, int y,int niveau, boolean aAfficher){
		super(nom, hauteur, largeur, x, y);
		this.niveau = niveau;
		this.aAfficher = aAfficher;
	}
}
