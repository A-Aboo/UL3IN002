package pobj.motx.tme1;

import java.util.ArrayList;
import java.util.List;

public class Emplacement {
	private List<Case> lcase;
	public Emplacement() {
		lcase = new ArrayList<Case>();
	}
	public void add(Case e) {
		lcase.add(e);
	}
	public int size() {
		return lcase.size();
	}
	public Case getCase(int i) {
		return lcase.get(i);
	}
	public String toString() {
		String ret = "";
		for(Case c : lcase) {
			ret += c.getChar();
		}
		return ret;
	}
}
