package edu.alec.F1simpleREST.model;

import java.util.ArrayList;

/**
 *
 * @author alex.cazziolato
 */
public class PilotiDAO {
	private static PilotiDAO istanza = null;
	private ArrayList<Pilota> piloti;

	public static PilotiDAO getInstance() {
		if (istanza == null) {
			istanza = new PilotiDAO();
		}
		return istanza;
	}

	private PilotiDAO() {
		piloti = new ArrayList();
		popolaPiloti();
	}

	private void popolaPiloti() {
		//dati 2018
		Pilota p1 = new Pilota(1, "Hamilton", "Lewis", "Regno Unito", "1985-01-07");
		Pilota p2 = new Pilota(2, "Bottas", "Valtteri", "Finlandia", "1989-09-28");
		Pilota p3 = new Pilota(3, "Vettel", "Sebastian", "Germania", "1987-07-03");
		Pilota p4 = new Pilota(4, "Raikkonen", "Kimi", "Finlandia", "1979-10-17");
		Pilota p5 = new Pilota(5, "Ricciardo", "Daniel", "Australia", "19");
		Pilota p6 = new Pilota(6, "Verstappen", "Max", "Olanda", "1997-09-30");
		Pilota p7 = new Pilota(7, "Hulkenberg", "Nicolas", "Germania", "1987-08-19");
		Pilota p8 = new Pilota(8, "Sainz jr", "Carlos", "Spagna", "1994-09-01");
		Pilota p9 = new Pilota(9, "Grosjean", "Romain", "Francia", "1986-04-17");
		Pilota p10 = new Pilota(10, "Magnussen", "Kevin", "Danimarca", "1992-10-05");
		Pilota p11 = new Pilota(11, "Alonso", "Fernando", "Spagna", "1981-07-29");
		Pilota p12 = new Pilota(12, "Vandoome", "Stoffel", "Belgio", "1992-03-26");
		piloti.add(p1);
		piloti.add(p2);
		piloti.add(p3);
		piloti.add(p4);
		piloti.add(p5);
		piloti.add(p6);
		piloti.add(p7);
		piloti.add(p8);
		piloti.add(p9);
		piloti.add(p10);
		piloti.add(p11);
		piloti.add(p12);
	}

}
