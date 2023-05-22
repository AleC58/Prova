package prjiocsemplice2;

/**
 *
 * @author Alessandro Cazziolato
 */
public class AltroServizio implements IServizio {

	@Override
	public void operazione() {
		System.out.println("Esecuzione operazione di un nuovo servizio aggiunto successivamente");
	}

}
