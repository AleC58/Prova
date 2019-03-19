package edu.alex.SpringApplicationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * @author alex.cazziolato
 */
@Component
@ConfigurationProperties(prefix = "app") // find "app" values
public class PropApp {
	private String nome;
	private String ver;
	private String descrizione;
	private String dataCreazione;
	private String dataUltimaModifica;

	public PropApp() {
	}

	public PropApp(String nome, String ver, String descrizione, String dataCreazione, String dataUltimaModifica) {
		this.nome = nome;
		this.ver = ver;
		this.descrizione = descrizione;
		this.dataCreazione = dataCreazione;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(String dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public String getDataUltimaModifica() {
		return dataUltimaModifica;
	}

	public void setDataUltimaModifica(String dataUltimaModifica) {
		this.dataUltimaModifica = dataUltimaModifica;
	}

}
