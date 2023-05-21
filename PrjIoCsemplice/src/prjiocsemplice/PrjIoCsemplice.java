package prjiocsemplice;

/**
 *
 * @author Alessandro Cazziolato
 */
public class PrjIoCsemplice {
//semplice esempio del pattern Inversion of Control

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		IServizio servizio = new Servizio();
		Cliente cliente = new Cliente(servizio);
		cliente.eseguiOperazione();
	}

}
