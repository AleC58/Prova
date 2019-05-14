package edu.alec.F1simpleREST.model;

import java.util.ArrayList;

/**
 *
 * @author alex.cazziolato
 */
public class CampionatiDAO {
	private static CampionatiDAO istanza = null;
	private ArrayList<Campionato> campionati;
	//String pathSorgenteDati= ...

	public static CampionatiDAO getInstance() {
		if (istanza == null) {
			istanza = new CampionatiDAO();
		}
		return istanza;
	}
	
	private CampionatiDAO() {
		campionati = new ArrayList();
		popolaCampionati();
	}

	public ArrayList<Campionato> getAll() {
		return campionati;
	}

	public ArrayList<Campionato> get(long anno) {
		ArrayList<Campionato> campionato = new ArrayList<>();
		for (Campionato c : campionati) {
			if (c.getAnno() == anno) {
				campionato.add(c);
			}
		}
		return campionato;
	}

	@Override
	public String toString() {
		return "CampionatiDAO{" + "campionati=" + campionati + '}';
	}

	private void popolaCampionati() {
		//dati 2018  e 19         anno, idCostruttore, idPilota
		Campionato c1 = new Campionato(2018, 3, 1);
		Campionato c2 = new Campionato(2018, 3, 2);
		Campionato c3 = new Campionato(2018, 1, 3);
		Campionato c4 = new Campionato(2018, 1, 4);
		Campionato c5 = new Campionato(2018, 4, 5);
		Campionato c6 = new Campionato(2018, 4, 6);
		Campionato c7 = new Campionato(2018, 5, 7);
		Campionato c8 = new Campionato(2018, 5, 8);
		Campionato c9 = new Campionato(2018, 2, 9);
		Campionato c10 = new Campionato(2018, 2, 10);
		Campionato c11 = new Campionato(2019, 3, 1);
		Campionato c12 = new Campionato(2019, 3, 2);
		Campionato c13 = new Campionato(2019, 1, 3);
		Campionato c14 = new Campionato(2019, 1, 13);
		Campionato c15 = new Campionato(2019, 4, 6);
		Campionato c16 = new Campionato(2019, 4, 14);
		Campionato c17 = new Campionato(2019, 5, 5);
		Campionato c18 = new Campionato(2019, 5, 7);
		Campionato c19 = new Campionato(2019, 2, 9);
		Campionato c20 = new Campionato(2019, 2, 10);
		campionati.add(c1);
		campionati.add(c2);
		campionati.add(c3);
		campionati.add(c4);
		campionati.add(c5);
		campionati.add(c6);
		campionati.add(c7);
		campionati.add(c8);
		campionati.add(c9);
		campionati.add(c10);
		campionati.add(c11);
		campionati.add(c12);
		campionati.add(c13);
		campionati.add(c14);
		campionati.add(c15);
		campionati.add(c16);
		campionati.add(c17);
		campionati.add(c18);
		campionati.add(c19);
		campionati.add(c20);
	}

}
