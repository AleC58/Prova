package edu.alec.F1simpleREST.model;

/**
 *
 * @author alex.cazziolato
 */

public class Costruttore {
	private long idCostruttore;
	private String nomeCostruttore;
	private String nazioneCostruttore;
	private int puntiCostruttore;

	public Costruttore() {
	}

	public Costruttore(long idCostruttore, String nomeCostruttore, String nazioneCostruttore, int puntiCostruttore) {
		this.idCostruttore = idCostruttore;
		this.nomeCostruttore = nomeCostruttore;
		this.nazioneCostruttore = nazioneCostruttore;
		this.puntiCostruttore = puntiCostruttore;
	}

	public int getPuntiCostruttore() {
		return puntiCostruttore;
	}

	public void setPuntiCostruttore(int puntiCostruttore) {
		this.puntiCostruttore = puntiCostruttore;
	}

	public long getIdCostruttore() {
		return idCostruttore;
	}

	public void setIdCostruttore(long idCostruttore) {
		this.idCostruttore = idCostruttore;
	}

	public String getNomeCostruttore() {
		return nomeCostruttore;
	}

	public void setNomeCostruttore(String nomeCostruttore) {
		this.nomeCostruttore = nomeCostruttore;
	}

	public String getNazioneCostruttore() {
		return nazioneCostruttore;
	}

	public void setNazioneCostruttore(String nazioneCostruttore) {
		this.nazioneCostruttore = nazioneCostruttore;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 41 * hash + (int) (this.idCostruttore ^ (this.idCostruttore >>> 32));
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Costruttore other = (Costruttore) obj;
		if (this.idCostruttore != other.idCostruttore) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Costruttore{" + "idCostruttore=" + idCostruttore + ", nomeCostruttore=" + nomeCostruttore + ", nazioneCostruttore=" + nazioneCostruttore + ", puntiCostruttore=" + puntiCostruttore + '}';
	}
	
}
