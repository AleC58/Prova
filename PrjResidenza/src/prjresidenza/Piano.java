package prjresidenza;

import java.util.ArrayList;

/**
 *
 * @author Alessandro Cazziolato
 */
public class Piano {
    private ArrayList<Appartamento> appartamenti;

    public Piano() {
        appartamenti = new ArrayList<>();
    }

    public void aggiungiAppartamento(Appartamento appartamento) {
        appartamenti.add(appartamento);
    }

	public ArrayList<Appartamento> getAppartamenti() {
		return appartamenti;
	}

	public void setAppartamenti(ArrayList<Appartamento> appartamenti) {
		this.appartamenti = appartamenti;
	}

	public int getNumAppartamenti() {
		return appartamenti.size();
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "{" + "appartamenti=" + appartamenti + '}';
	}


}
