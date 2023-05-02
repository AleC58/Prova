package prjportafoglio;

public class PrjPortafoglio {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		PortaMonete p0 = new PortaMonete();
		System.out.println("P 0,0,0: " + p0);
		p0.inserisci(0.4);
		System.out.println("P 0,0,0: " + p0);
		System.out.println("--------------\n");
		//Monete[] vMonete = {new Monete(0.5555, 1), new Monete(1, 2), new Monete(2, 4)};
		int[] vMonete = {1, 2, 4};
		PortaMonete p = new PortaMonete(vMonete);
		System.out.println("P 1,2,4: " + p);
		p.inserisci(2.0);
		System.out.println("P 1,2,5: " + p);
		p.inserisci(0.5, 3);
		System.out.println("P 4,2,5: " + p);
		System.out.println("Valore totale nel portafoglio: " + p.denaro());
		System.out.println("Quantità di monete per tipo: ");
		p.denaroPerTipo();

		System.out.println("\n\n--------------\nPortafoglio\n");
		Portafoglio pfd = new Portafoglio();
		System.out.println("Pfd default: " + pfd);
		int[] qtaSoldi = {1, 2, 4, 1, 2, 3};
		Portafoglio pf = new Portafoglio(qtaSoldi);
		System.out.println("pf 1, 2, 4, 1, 2, 3: " + pf);
		pf.inserisci(24.3);
		System.out.println("pf 1, 2, 4, 1, 2, 3: " + pf);
		pf.inserisci(0.5, 3);
		pf.inserisci(10, 2);
		pf.inserisci(25.0, 99);
		System.out.println("pf 4, 2, 4, 1, 4, 3: " + pf);
		System.out.println("Valore totale nel portafoglio: " + pf.denaro());
		System.out.println("Valore banconote nel portafoglio: " + pf.banconote());
		System.out.println("Quantità di monete per tipo: ");
		pf.denaroPerTipo();
	}

}
