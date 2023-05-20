package prjesempiointerfacciacongenerics;

/**
 *
 * @author Alessandro Cazziolato
 */
public class FintoArrayDiPersone implements IOrdinabile<String> {
	private String nome;

	public FintoArrayDiPersone(String nome) {
		this.nome = nome;
	}

	@Override
	public void ordina(String c) {
		System.out.println("Fingo di ordinare: ho solo una variabile oggetto Persona, con attributo che vale " + nome);
		nome= nome + " " + c;
		System.out.println("Modifico l'oggetto; ora nome vale " + nome);
	}

	@Override
	public String toString() {
		return "FintoArrayDiPersone{" + "nome=" + nome + '}';
	}

}
