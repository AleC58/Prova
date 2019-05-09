package edu.alec.F1simpleREST.model;

/**
 *
 * @author alex.cazziolato
 */
public class Campionato {
	private int anno;
	private long idCostruttore;
	private long idPilota;

	public Campionato() {
	}

	public Campionato(int anno, long idCostruttore, long idPilota) {
		this.anno = anno;
		this.idCostruttore = idCostruttore;
		this.idPilota = idPilota;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public long getIdCostruttore() {
		return idCostruttore;
	}

	public void setIdCostruttore(long idCostruttore) {
		this.idCostruttore = idCostruttore;
	}

	public long getIdPilota() {
		return idPilota;
	}

	public void setIdPilota(long idPilota) {
		this.idPilota = idPilota;
	}

	@Override
	public String toString() {
		return "Campionato{" + "anno=" + anno + ", idCostruttore=" + idCostruttore + ", idPilota=" + idPilota + '}';
	}
	
	
}
