package edu.alec.F1simpleREST.model;

import java.util.ArrayList;

/**
 *
 * @author alex.cazziolato
 */
public class CostruttoriDAO {
	private static CostruttoriDAO istanza = null;
	private ArrayList<Costruttore> costruttori;
	//String pathSorgenteDati= ...

	public static CostruttoriDAO getInstance() {
		if (istanza == null) {
			istanza = new CostruttoriDAO();
		}
		return istanza;
	}
	
	private CostruttoriDAO() {
		costruttori = new ArrayList();
		popolaCostruttori();
	}

	public ArrayList<Costruttore> get() {
		return costruttori;
	}

	public ArrayList<Costruttore> get(long idCostruttore) {
		return costruttori;
	}

	public ArrayList<Costruttore> get(String nomeCostruttore) {
		return costruttori;
	}

//	public void set(ArrayList<Costruttore> costruttori) {
//		this.costruttori = costruttori;
//	}

	@Override
	public String toString() {
		return "Costruttori{" + "costruttori=" + costruttori + '}';
	}
	
	private void popolaCostruttori() {
		//dati 2018
		Costruttore c1 = new Costruttore(1, "Ferrari", "Italia", 571);
		Costruttore c2 = new Costruttore(2, "Haas-Ferrari", "USA", 93);
		Costruttore c3 = new Costruttore(3, "Mercedes", "Germania", 655);
		Costruttore c4 = new Costruttore(4, "Red Bull", "Austria", 419);
		Costruttore c5 = new Costruttore(5, "Renault", "Francia", 122);
		costruttori.add(c1);
		costruttori.add(c2);
		costruttori.add(c3);
		costruttori.add(c4);
		costruttori.add(c5);
	}

}
