package prjportamonete;

public class PrjPortaMonete {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int[] qtaMonete = {1, 2, 4};
		PortaMonete p = new PortaMonete(qtaMonete);
		System.out.println("P: " + p);
		p.inserisci(0.4);
		System.out.println("P: " + p);
		p.inserisci(2.0);
		System.out.println("P: " + p);
		p.inserisci(0.5, 3);
		System.out.println("P: " + p);
		System.out.println("Valore totale nel portafoglio: " + p.denaro());
		System.out.println("Quantità di monete per tipo: ");
		p.denaroPerTipo();
	}

}
