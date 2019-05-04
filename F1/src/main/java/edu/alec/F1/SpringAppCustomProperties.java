package edu.alec.F1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 *
 * @author alex.cazziolato
 */
@Configuration
public class SpringAppCustomProperties {
	@Value("${pathBaseFileCSV}")
	private String pathBaseFileCSV;
	@Value("${fnPiloti}")
	private String fnPiloti;
	@Value("${fnCostruttori}")
	private String fnCostruttori;
	@Value("${fnRisultati}")
	private String fnRisultati;

	public SpringAppCustomProperties() {
	}

	public String getPathBaseFileCSV() {
		return pathBaseFileCSV;
	}

	public void setPathBaseFileCSV(String pathBaseFileCSV) {
		this.pathBaseFileCSV = pathBaseFileCSV;
	}

	public String getFnPiloti() {
		return fnPiloti;
	}

	public void setFnPiloti(String fnPiloti) {
		this.fnPiloti = fnPiloti;
	}

	public String getFnCostruttori() {
		return fnCostruttori;
	}

	public void setFnCostruttori(String fnCostruttori) {
		this.fnCostruttori = fnCostruttori;
	}

	public String getFnRisultati() {
		return fnRisultati;
	}

	public void setFnRisultati(String fnRisultati) {
		this.fnRisultati = fnRisultati;
	}

	
}
