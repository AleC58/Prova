package com.mycompany.prjesempiointerfaccia;

/**
 *
 * @author Alessandro Cazziolato
 */
public class FintoArrayDiStringhe implements Ordinabile {
	private String s;

	public FintoArrayDiStringhe(String s) {
		this.s = s;
	}

	@Override
	public void ordina() {
		System.out.println("Fingo di ordinare: ho solo una variabile Stringa che vale " + s);
	}

}
