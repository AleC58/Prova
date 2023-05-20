package prjesempiointerfacciacongenerics;

/**
 *
 * @author Alessandro Cazziolato
 */
public class FintoArrayDiStringhe implements IOrdinabile<Integer> {
	private String s;

	public FintoArrayDiStringhe(String s) {
		this.s = s;
	}

	@Override
	public void ordina(Integer i) {
		System.out.println("Fingo di ordinare: ho solo una variabile Stringa che vale " + s);
		s+= i;
		System.out.println("Modifico l'oggetto; ora num vale " + s);
	}

	@Override
	public String toString() {
		return "FintoArrayDiStringhe{" + "s=" + s + '}';
	}

}
