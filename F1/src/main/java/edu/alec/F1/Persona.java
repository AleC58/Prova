package edu.alec.F1;

/**
 *
 * @author alex.cazziolato
 */
public class Persona {
	private long idPersona;
	private String nome;
	private String cognome;

	public Persona() {
	}

	public Persona(long idPersona, String nome, String cognome) {
		this.idPersona = idPersona;
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(long idPersona) {
		this.idPersona = idPersona;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
