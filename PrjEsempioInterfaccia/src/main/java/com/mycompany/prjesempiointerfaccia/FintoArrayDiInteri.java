package com.mycompany.prjesempiointerfaccia;

/**
 *
 * @author Alessandro Cazziolato
 */
public class FintoArrayDiInteri implements Ordinabile {
	private int num;

	public FintoArrayDiInteri(int num) {
		this.num = num;
	}

	@Override
	public void ordina() {
		System.out.println("Fingo di ordinare: ho solo una variabile intera che vale " + num);
		num+= 5;
		System.out.println("Modifico l'oggetto; ora num vale " + num);
	}

	@Override
	public String toString() {
		return "FintoArrayDiInteri{" + "num=" + num + '}';
	}

}
