package prjiocsemplice;

/**
 *
 * @author Alessandro Cazziolato
 */
public class Cliente {
/*  Cliente non dipende direttamente dall’implementazione
	di IServizio, ma solo dall’interfaccia.
	Questo permette di cambiare l’implementazione di
	IServizio senza dover modificare la classe Cliente. */
	private IServizio servizio; //dipendenza

	public Cliente(IServizio servizio) {//Constructor injection
		this.servizio = servizio; //iniezione della dipendenza
	}

	public void eseguiOperazione() {
		servizio.operazione();
	}

}
