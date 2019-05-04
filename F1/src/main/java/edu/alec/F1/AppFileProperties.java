package edu.alec.F1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex.cazziolato
 */
public class AppFileProperties {
	private String pathBaseFileCSV;
	private String fnPiloti;
	private String fnCostruttori;
	private String fnRisultati;

	
	public AppFileProperties() {
		//String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String resourcePath = "src\\main\\resources\\";
		String appFile = resourcePath + "appFile.properties";
		Properties appProps = new Properties();
		try {
			appProps.load(new FileInputStream(appFile));
		} catch (IOException ex) {
			Logger.getLogger(AppFileProperties.class.getName()).log(Level.SEVERE, null, ex);
			System.out.println("Errore apertura file di proprietà: " + appProps);
			System.exit(1);
		}
		this.pathBaseFileCSV = appProps.getProperty("pathBaseFileCSV");
		this.fnPiloti = appProps.getProperty("fnPiloti");
		this.fnCostruttori = appProps.getProperty("fnCostruttori");
		this.fnRisultati = appProps.getProperty("fnRisultati");
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
