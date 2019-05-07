package edu.alec.F1simpleREST.model;

import java.util.ArrayList;

/**
 *
 * @author alex.cazziolato
 */
public class Costruttori {
	private ArrayList<Costruttore> costruttori;

	public Costruttori() {
		costruttori = new ArrayList();
		//dati 2018
		Costruttore c1 = new Costruttore(1, "Ferrari", "Italia", 571);
		Costruttore c2 = new Costruttore(1, "Haas-Ferrari", "USA", 93);
		Costruttore c3 = new Costruttore(1, "Mercedes", "Germania", 655);
		Costruttore c4 = new Costruttore(1, "Red Bull", "Austria", 419);
		Costruttore c5 = new Costruttore(1, "Renault", "Francia", 122);
		costruttori.add(c1);
		costruttori.add(c2);
		costruttori.add(c3);
		costruttori.add(c4);
		costruttori.add(c5);
	}

	public ArrayList<Costruttore> getCostruttori() {
		return costruttori;
	}

	public void setCostruttori(ArrayList<Costruttore> costruttori) {
		this.costruttori = costruttori;
	}

	@Override
	public String toString() {
		return "Costruttori{" + "costruttori=" + costruttori + '}';
	}

}
