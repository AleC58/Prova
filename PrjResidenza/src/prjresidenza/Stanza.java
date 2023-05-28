package prjresidenza;

/**
 *
 * @author Alessandro Cazziolato
 */
public class Stanza {

	private TipoStanza tipo;

	public Stanza(TipoStanza tipo) {
		this.tipo = tipo;
	}

	public TipoStanza getTipo() {
		return tipo;
	}

	public void setTipo(TipoStanza tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "{" + "tipo=" + tipo + '}';
	}

}
