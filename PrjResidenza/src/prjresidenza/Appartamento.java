package prjresidenza;

import java.util.ArrayList;

/**
 *
 * @author Alessandro Cazziolato
 */
public class Appartamento {
    private ArrayList<Stanza> stanze;

    public Appartamento() {
        stanze = new ArrayList<>();
    }

    public void aggiungiStanza(Stanza stanza) {
        stanze.add(stanza);
    }

	public ArrayList<Stanza> getStanze() {
		return stanze;
	}

	public void setStanze(ArrayList<Stanza> stanze) {
		this.stanze = stanze;
	}

	public int getNumStanze() {
		return stanze.size();
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "{" + "stanze=" + stanze + '}';
	}

}
