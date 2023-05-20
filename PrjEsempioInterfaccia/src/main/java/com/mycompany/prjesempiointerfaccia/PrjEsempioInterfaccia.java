package com.mycompany.prjesempiointerfaccia;

/**
 *
 * @author Alessandro Cazziolato
 */
public class PrjEsempioInterfaccia {

    public static void main(String[] args) {
		FintoArrayDiInteri fai = new FintoArrayDiInteri(10);
		FintoArrayDiStringhe fas = new FintoArrayDiStringhe("A");
		FintoArrayDiPersone fap = new FintoArrayDiPersone("Alex");
        fai.ordina();
		System.out.println("Conferma: " + fai);
        fas.ordina();
        fap.ordina();
		System.out.println("... ma le cose si complicano se dovessi passare parametri di tipo diverso ai tre oggetti");
    }
}
