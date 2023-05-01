package prjportafoglio;

import java.util.Arrays;

public class PortaMonete {
	private Soldi [] soldi;
	public static final double[] TAGLI_MONETE = {0.5, 1.0, 2.0};

	public PortaMonete() {
		soldi = new Monete[TAGLI_MONETE.length];
		for (int j = 0; j < soldi.length; j++) {
			soldi[j] = new Monete(TAGLI_MONETE[j], 0);
		}
	}

	public PortaMonete(int[] qta) {
		this(); // chiama il costruttore a 0 parametri, creando il portamonete "vuoto"
		if (qta.length != soldi.length) {
			System.out.println("Si devono dare le quantità per " + soldi.length + " tipi di monetre");
			System.exit(1);
		}
		for (int j = 0; j < soldi.length; j++) {
			soldi[j].setQta(qta[j]);
		}
	}

	public PortaMonete(Monete[] m) {
		soldi = new Soldi[m.length];
		for (int j = 0; j < soldi.length; j++) {
			soldi[j] = new Monete(m[j].getValore(), m[j].getQta());
		}
	}

	public Soldi[] getSoldi() {
		return soldi;
	}

	public void setSoldi(Soldi[] soldi) {
		this.soldi = soldi;
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
		return this.getClass().getSimpleName() + "{" + "monete=" + Arrays.toString(soldi) + '}';
	}

	public void inserisci(double valore) {
		inserisci(valore, 1);
	}

	public void inserisci(double valore, int qta) {
		for (int j = 0; j < soldi.length; j++) {
			//se il valore degli Monete è valido li inserisco
			if (Double.compare(valore, soldi[j].getValore()) == 0) {
				soldi[j].setQta(soldi[j].getQta() + qta);
			}
		}
	}

	public double denaro() {
		double tot = 0.0;
		for (int j = 0; j < soldi.length; j++) {
			tot += soldi[j].getValore() * soldi[j].getQta();
		}
		return tot;
	}

	public void denaroPerTipo() {
		for (int j = 0; j < soldi.length; j++) {
			System.out.println("monedte da " + soldi[j].getValore() + ": " + soldi[j].getQta());
		}
	}

}
