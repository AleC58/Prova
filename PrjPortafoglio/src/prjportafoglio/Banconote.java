package prjportafoglio;

public class Banconote extends Soldi {

	private final TipoSoldi tipo;

	public Banconote(double valore, int qta) {
		super(valore, qta);
		tipo = TipoSoldi.BANCONOTE;
	}

	public TipoSoldi getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "{" + "tipo=" + tipo + " valore=" + this.getValore() + " qta=" + this.getQta() + '}';
	}

}
