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
		//dati 2018                   anno, idCostruttore, idPilota
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
	}

}