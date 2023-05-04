package cerchi;

/**
 *
 * @author alex.cazziolato
 */
public class EsCerchi {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Cerchio c1 = new Cerchio();
		System.out.println("c1: " + c1);

		Cerchio c2 = new Cerchio(2.5, "Rosso");
		System.out.println("c2: " + c2);

		System.out.println("Raggio di c2: " + c2.getRadius());
		System.out.println(c1.calcolaArea() + " " + c2.calcolaArea());
	}

}
