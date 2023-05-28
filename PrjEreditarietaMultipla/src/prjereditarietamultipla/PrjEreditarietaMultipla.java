package prjereditarietamultipla;

/**
 *
 * @author Alessandro Cazziolato
 */

public class PrjEreditarietaMultipla {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Persona persona = new Persona("Mario");
		persona.lavora();
		persona.studia();
		persona.lavora();
		persona.studia();
		persona.studia();

		int stipendio = ServizioLavoratori.calcolaStipendio(persona);
		System.out.println("Lo stipendio di " + persona.getNome() + " è: " + stipendio);

		boolean esameSuperato = ServizioStudenti.superaEsame(persona);
		if (esameSuperato) {
			System.out.println(persona.getNome() + " ha superato l'esame");
		} else {
			System.out.println(persona.getNome() + " non ha superato l'esame (con " + persona.getOreStudio() + " ore di studio)");
		}

	}
}
