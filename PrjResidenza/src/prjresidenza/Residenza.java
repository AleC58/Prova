package prjresidenza;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Alessandro Cazziolato
 */
public class Residenza {

	private ArrayList<Piano> piani;

	public Residenza() {
		piani = new ArrayList<>();
	}

	public void aggiungiPiano(Piano piano) {
		piani.add(piano);
	}

	public ArrayList<Piano> getPiani() {
		return piani;
	}

	public void setPiani(ArrayList<Piano> piani) {
		this.piani = piani;
	}

	public static Residenza creaResidenza() {
		Residenza residenza = new Residenza();
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			Piano piano = new Piano();
			for (int j = 0; j < 10; j++) {
				Appartamento appartamento = new Appartamento();
				int numStanze = rand.nextInt(5) + 4;
				for (int k = 0; k < numStanze; k++) {
					int randInt = rand.nextInt(TipoStanza.values().length);
					appartamento.aggiungiStanza(new Stanza(TipoStanza.values()[randInt]));
				}
				piano.aggiungiAppartamento(appartamento);
			}
			residenza.aggiungiPiano(piano);
		}
		return residenza;
	}

	public int getNumPiani() {
		return piani.size();
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "{" + "piani=" + piani + '}';
	}

}
