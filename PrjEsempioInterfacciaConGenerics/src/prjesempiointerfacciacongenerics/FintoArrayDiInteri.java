package prjesempiointerfacciacongenerics;

/**
 *
 * @author Alessandro Cazziolato
 */
public class FintoArrayDiInteri implements IOrdinabile<Integer> {
	private int num;

	public FintoArrayDiInteri(int num) {
		this.num = num;
	}

	@Override
	public void ordina(Integer incr) {
		System.out.println("Fingo di ordinare: ho solo una variabile intera che vale " + num);
		num+= incr;
		System.out.println("Modifico l'oggetto; ora num vale " + num);
	}

	@Override
	public String toString() {
		return "FintoArrayDiInteri{" + "num=" + num + '}';
	}

}
