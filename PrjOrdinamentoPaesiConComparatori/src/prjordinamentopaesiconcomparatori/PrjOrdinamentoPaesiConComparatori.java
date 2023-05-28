package prjordinamentopaesiconcomparatori;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Alessandro Cazziolato
 */
public class PrjOrdinamentoPaesiConComparatori {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
        ArrayList<Paese> paesi = new ArrayList<>();
        paesi.add(new Paese("Francia", 67_000_000, 643_801));
        paesi.add(new Paese("Italia", 60_000_000, 301_338));
        paesi.add(new Paese("Germania", 83_000_000, 357_582));

        System.out.println("Paesi non ordinati:");
		for (int j = 0; j < paesi.size(); j++) {
			System.out.println(paesi.get(j));
		}

        // Ordinamento naturale (per nome del paese)
        Collections.sort(paesi);
        System.out.println("\n\nOrdinamento naturale (per nome):");
		for (int j = 0; j < paesi.size(); j++) {
			System.out.println(paesi.get(j));
		}

        // Ordinamento per popolazione, con classe anonima
        Collections.sort(paesi, new Comparator<Paese>() {
            @Override
            public int compare(Paese p1, Paese p2) {
                return p1.popolazione - p2.popolazione;
            }
        });
        System.out.println("\n\nOrdinamento per popolazione:");
		for (int j = 0; j < paesi.size(); j++) {
			System.out.println(paesi.get(j));
		}

        // Ordinamento per superficie, con lambda expression
        Collections.sort(paesi, (Paese p1, Paese p2) -> p1.superficie - p2.superficie);
        System.out.println("\n\nOrdinamento per superficie:");
		for (int j = 0; j < paesi.size(); j++) {
			System.out.println(paesi.get(j));
		}
    }
}