package prjereditarietamultipla;

/**
 *
 * @author Alessandro Cazziolato
 */
public class ServizioLavoratori {

	public static int calcolaStipendio(Persona persona) {
		int stipendio = persona.getOreLavoro() * 10;
		return stipendio;
	}
}
