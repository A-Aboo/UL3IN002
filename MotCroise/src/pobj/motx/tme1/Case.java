package pobj.motx.tme1;

public class Case {
	private int ligne ; 
	private int column;
	private char 	valeur;
	public Case(int lig ,int col, char val) {
		this.ligne = lig;
		this.column = col;
		this.valeur = val;
	}
	public int getLig() {return ligne;}
	public int getCol() {return column;}
	public char getChar() {return valeur;}
	public void setChar(char c) {valeur = c;}
	public boolean isVide() {return valeur == ' ';}
	public boolean isPleine() {return valeur == '*';}
	
	
	
}
