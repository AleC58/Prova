package edu.alec.F1;

import com.opencsv.bean.CsvBindByPosition;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author alex.cazziolato
 */
public class Pilota {
	@CsvBindByPosition(position = 5)
	private String cognomePilota;
	@CsvBindByPosition(position = 4)
	private String nomePilota;
	@CsvBindByPosition(position = 7)
	private String nazionalita;
	@CsvBindByPosition(position = 6)
	private LocalDate dataNascita;

	public Pilota() {
	}

	public Pilota(String cognomePilota, String nomePilota, String nazionalita, LocalDate dataNascita) {
		this.cognomePilota = cognomePilota;
		this.nomePilota = nomePilota;
		this.nazionalita = nazionalita;
		this.dataNascita = dataNascita;
	}

	public Pilota(String cognomePilota, String nomePilota, String nazionalita, String dataNascita) {
		this.cognomePilota = cognomePilota;
		this.nomePilota = nomePilota;
		this.nazionalita = nazionalita;
		DateTimeFormatter fmtr = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		this.dataNascita = LocalDate.parse(dataNascita, fmtr);
	}

	public String getCognomePilota() {
		return cognomePilota;
	}

	public void setCognomePilota(String cognomePilota) {
		this.cognomePilota = cognomePilota;
	}
	
	public String getNomePilota() {
		return nomePilota;
	}

	public void setNomePilota(String nomePilota) {
		this.nomePilota = nomePilota;
	}

	public String getNazionalita() {
		return nazionalita;
	}

	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	@Override
	public int hashCode() {
		int hash = 7;
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
		final Pilota other = (Pilota) obj;
		if (!Objects.equals(this.cognomePilota, other.cognomePilota)) {
			return false;
		}
		if (!Objects.equals(this.nomePilota, other.nomePilota)) {
			return false;
		}
		if (!Objects.equals(this.dataNascita, other.dataNascita)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Pilota{" + "cognomePilota=" + cognomePilota + ", nomePilota=" + nomePilota + ", nazionalita=" + nazionalita + ", dataNascita=" + dataNascita + '}';
	}

}
