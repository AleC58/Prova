package com.mycompany.prjesempiointerfaccia;

/**
 *
 * @author Alessandro Cazziolato
 */
public class FintoArrayDiPersone implements Ordinabile {
	private String nome;

	public FintoArrayDiPersone(String nome) {
		this.nome = nome;
	}

	@Override
	public void ordina() {
		System.out.println("Fingo di ordinare: ho solo una variabile oggetto Persona, con attributo che vale " + nome);
	}

}
