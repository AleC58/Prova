package prjesempiointerfacciacongenerics;

/**
 *
 * @author Alessandro Cazziolato
 */
public class PrjEsempioInterfacciaConGenerics {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		FintoArrayDiInteri fai = new FintoArrayDiInteri(10);
		FintoArrayDiStringhe fas = new FintoArrayDiStringhe("A");
		FintoArrayDiPersone fap = new FintoArrayDiPersone("Alex");

		//chiamata diretta al metodo ordina
        fai.ordina(5);
		System.out.println("Conferma: " + fai);
        fas.ordina(10);
		System.out.println("Conferma: " + fas);
        fap.ordina("Cognome");
		System.out.println("Conferma: " + fap);

		//chiamata al metodo generico che richiama ordina su classi diverse
		ordinaGenerico(fas, 10);
		ordinaGenerico(fap, "Cognome");

		IOrdinabile.stampa(1);
		IOrdinabile.stampa("MSG");
		IOrdinabile.stampa(3.1415);
		IOrdinabile.stampa(fai);
	}

	//metodo generico per lavorare su classi diverse che implementano l'interfaccio
	//Rende più flessibile il codice, in quanto può essere usato con qualsiasi
	//oggetto che implementa l'interfaccia, e quindi anche con nuove classi di
	//oggetti, senza dover modificare il codice
	public static <T> void ordinaGenerico(IOrdinabile<T> oggetto, T param) {
		oggetto.ordina(param);
	}
}
