package edu.alex.SpringApplicationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * @author alex.cazziolato
 */
@Component
@ConfigurationProperties() //no prefix, find root level values.
public class PropGlobali {
	// NB: i nomi DEVONO coincidere con quelli delle proprietà!
	// per la "kebab notation" si procede così:
	// data-creazione  ->  dataCreazione
	private String nome;
	private String cognome;

	public PropGlobali() {
	}

	public PropGlobali(String nome, String cognome, String appNome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

}
