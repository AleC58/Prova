package prjportafoglio;

import java.util.Arrays;

public class PortaMonete {

	private Soldi[] soldi;
	private double[] TAGLI_DEI_SOLDI;

	public PortaMonete() {
		TAGLI_DEI_SOLDI = Soldi.getTAGLI_DELLE_MONETE();
		soldi = new Monete[TAGLI_DEI_SOLDI.length];
		for (int j = 0; j < soldi.length; j++) {
			soldi[j] = new Monete(TAGLI_DEI_SOLDI[j], 0);
		}
	}

	public PortaMonete(int[] qta) {
		this(); // chiama il costruttore a 0 parametri, creando il portamonete "vuoto"
		TAGLI_DEI_SOLDI = Soldi.getTAGLI_DELLE_MONETE();
		if (qta.length != soldi.length) {
			System.out.println("Si devono dare le quantità per " + soldi.length + " tipi di monetre");
			System.exit(1);
		}
		for (int j = 0; j < soldi.length; j++) {
			soldi[j].setQta(qta[j]);
		}
	}

	public PortaMonete(Monete[] m) {
		TAGLI_DEI_SOLDI = Soldi.getTAGLI_DELLE_MONETE();
		soldi = new Soldi[m.length];
		for (int j = 0; j < soldi.length; j++) {
			soldi[j] = new Monete(m[j].getTaglio(), m[j].getQta());
		}
	}

	public Soldi[] getSoldi() {
		return soldi;
	}

	public void setSoldi(Soldi[] soldi) {
		this.soldi = soldi;
	}

	public double[] getTAGLI_DEI_SOLDI() {
		return TAGLI_DEI_SOLDI;
	}

	public void setTAGLI_DEI_SOLDI(double[] TAGLI_DEI_SOLDI) {
		this.TAGLI_DEI_SOLDI = TAGLI_DEI_SOLDI;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final PortaMonete other = (PortaMonete) obj;
		if (!Arrays.deepEquals(this.soldi, other.soldi)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "{" + Arrays.toString(soldi) + '}';
	}

	public void inserisci(double taglio) {
		inserisci(taglio, 1);
	}

	public void inserisci(double taglio, int qta) {
		boolean inserito = false;
		for (int j = 0; (j < soldi.length) && !inserito; j++) {
			//se il taglio degli Monete è valido li inserisco
			if (Double.compare(taglio, soldi[j].getTaglio()) == 0) {
				soldi[j].setQta(soldi[j].getQta() + qta);
				inserito = true;
			}
		}
	}

	public double denaro() {
		double tot = 0.0;
		for (int j = 0; j < soldi.length; j++) {
			tot += soldi[j].getTaglio() * soldi[j].getQta();
		}
		return tot;
	}

	public void denaroPerTipo() {
		for (int j = 0; j < soldi.length; j++) {
			System.out.println(soldi[j].getTipo() + " da " + soldi[j].getTaglio() + ": " + soldi[j].getQta());
		}
	}
}
