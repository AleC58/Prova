package edu.alec.F1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author alex.cazziolato
 */
@Component
public class SpringAppCustomProperties {
	@Value("${pathBase}")
	String pathBase;
	@Value("${fnPiloti}")
	String fnPiloti;
	@Value("${fnCostruttori}")
	String fnCostruttori;
	@Value("${fnRisultati}")
	String fnRisultati;

}
