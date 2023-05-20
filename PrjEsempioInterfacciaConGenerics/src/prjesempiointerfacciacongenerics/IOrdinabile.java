package prjesempiointerfacciacongenerics;
// progetto con Maven
/**
 *
 * @author Alessandro Cazziolato
 */
public interface IOrdinabile<T> {
	static <U> void stampa(U messaggio) {
		System.out.println("Metodo stampa dall'interfaccia IOrdinabile: " + messaggio);
	}

	void ordina(T param);
}
