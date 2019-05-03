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
	String pathBase;
	String fnPiloti;
	String fnCostruttori;
	String fnRisultati;

	public AppFileProperties() {
		String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String appFile = rootPath + "appFile.properties";
		Properties appProps = new Properties();
		try {
			appProps.load(new FileInputStream(appFile));
		} catch (IOException ex) {
			Logger.getLogger(AppFileProperties.class.getName()).log(Level.SEVERE, null, ex);
			System.out.println("Errore apertura file di proprietà: " + appProps);
			System.exit(1);
		}
		pathBase = appProps.getProperty("pathBase");

	}

}
