package pobj.motx.tme1;

public class Grille {
	private Case[][] ca;
	public Grille(int hauteur , int largeur) {
		ca = new Case[hauteur][largeur];
		for (int i =0 ; i < hauteur ; i++) {
			for (int j = 0 ; j < largeur ; j++) {
				ca[i][j] = new Case(i  , j , ' ');
			}
		}
	}
	public Case getCase(int lig , int col) {
		return ca[lig][col];
	}
	public String toString() {
		return GrilleLoader.serialize(this ,false );
	}
	public int nbLig() {return ca.length;}
	public int nbCol() {return ca[0].length;}
	
	public Grille copy() {
		Grille gr = new Grille(this.nbLig(), this.nbCol());
		for (int i = 0; i < this.nbLig() ; i++) {
			for (int j = 0 ;  j < this.nbCol() ; j++) {
				gr.ca[i][j] = new Case( 
						ca[i][j].getLig(),
						ca[i][j].getCol(),
						ca[i][j].getChar()  );
				
			}
		}
		
		return gr;
	}
	
}
