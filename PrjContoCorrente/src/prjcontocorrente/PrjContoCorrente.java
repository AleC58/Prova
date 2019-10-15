package prjcontocorrente;

/**
 *
 * @author ALEX.CAZZIOLATO
 * 
 * Una banca ha più clienti;
 * ogni cliente ha al massimo 1 conto corrente;
 * ogni conto corrente ha 0 o più operazioni;
 * ogni operazione è relativa a 1 conto corrente
 */
public class PrjContoCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Operazione op11 = new Operazione("2019-10-10", "C1, op E1", 100, true); //Conto 1, op 1 in Entrata 
		Operazione op12 = new Operazione("2019-10-12", "C1, op E2", 100, true); //Conto 1, op 2 in Entrata
		Operazione op21 = new Operazione("2019-10-11", "C2, op E1", 200, true);
		Operazione op13 = new Operazione("2019-10-12", "C1, op U3", 50, false);
		Operazione op22 = new Operazione("2019-10-15", "C2, op U2", 190, false);
		Operazione op14 = new Operazione("2019-10-15", "C1, op U4", 600, false);
		
		Conto conto1 = new Conto();
		Conto conto2 = new Conto();
		
		conto1.addOperazione(op11);
		conto1.addOperazione(op12);
		conto2.addOperazione(op21);
		conto1.addOperazione(op13);
		conto2.addOperazione(op22);
		conto1.addOperazione(op14);
		
		System.out.println(conto1);
		System.out.println(conto2);
		System.out.println("Saldo conto1:" + conto1.saldo());
    }
    
}
