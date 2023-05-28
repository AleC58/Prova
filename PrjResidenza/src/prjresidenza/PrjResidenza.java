package prjresidenza;

import java.util.ArrayList;

/**
 *
 * @author Alessandro Cazziolato
 */
public class PrjResidenza {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Residenza residenza = Residenza.creaResidenza();
		System.out.println(residenza);
		//output formattato
		ArrayList<Piano> piani = residenza.getPiani();
		for (int ixPiani = 0; ixPiani < piani.size(); ixPiani++) {
			ArrayList<Appartamento> app = piani.get(ixPiani).getAppartamenti();
			System.out.println("\n\n* Piano n. " + ixPiani + " -----------------");
			for (int ixApp = 0; ixApp < app.size(); ixApp++) {
				ArrayList<Stanza> stanze = app.get(ixApp).getStanze();
				System.out.println("\nAppartamento n. " + ixApp + " (con " + stanze.size() + " stanze)");
				//System.out.println(stanze);
				for (int ixStanza = 0; ixStanza < stanze.size(); ixStanza++) {
					System.out.print(" " + stanze.get(ixStanza).getTipo());
				}
			}
		}
	}
}
