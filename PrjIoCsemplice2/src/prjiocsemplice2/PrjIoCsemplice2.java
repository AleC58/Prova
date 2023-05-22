package prjiocsemplice2;

/**
 *
 * @author Alessandro Cazziolato
 */
public class PrjIoCsemplice2 {
//semplice esempio del pattern Inversion of Control

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		IServizio servizio = new Servizio();
		Cliente cliente = new Cliente(servizio);
		cliente.eseguiOperazione();

		/*grazie a IoC ho potuto aggiungere un altro servizio
		senza dover modificare il Cliente poichè il Cliente
		dipende dall'interfaccia, che mi garantisce che
		anche i nuovi servizi offriranno gli "stessi" metodi,
		ovvero metodi con la stessa firma (e ovviamente con
		implementazioni diverse*/
		IServizio altroServizio = new AltroServizio();
		cliente = new Cliente(altroServizio);
		cliente.eseguiOperazione();
	}

}
