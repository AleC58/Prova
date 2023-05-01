package prjportafoglio;

public class Monete extends Soldi {

	private final TipoSoldi tipo;

	public Monete(double valore, int qta) {
		super(valore, qta);
		tipo = TipoSoldi.MONETE;
	}

	public TipoSoldi getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "{" + "tipo=" + tipo + " valore=" + this.getValore() + " qta=" + this.getQta() + '}';
	}

}
