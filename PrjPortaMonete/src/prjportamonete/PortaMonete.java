package prjportamonete;

import java.util.Arrays;

public class PortaMonete {
	private Moneta [] monete;

	public PortaMonete() {
		this.monete = new Moneta[3];
		this.monete[0] = new Moneta(0.5, 0);
		this.monete[1] = new Moneta(1.0, 0);
		this.monete[2] = new Moneta(2.0, 0);
	}

	public PortaMonete(int[] qta) {
		this(); // richiama il costruttore a zero parametri
		if (qta.length != monete.length) {
			System.out.println("Si devono dare le quantità per " + monete.length + " tipi di monetre");
			System.exit(1);
		}
		monete[0].setQta(qta[0]);
		monete[1].setQta(qta[1]);
		monete[2].setQta(qta[2]);
	}

	public PortaMonete(Moneta[] monete) {
		this.monete = monete;
	}

	public Moneta[] getMonete() {
		return monete;
	}

	public void setMonete(Moneta[] monete) {
		this.monete = monete;
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
		if (!Arrays.deepEquals(this.monete, other.monete)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PortaMonete{" + "monete=" + Arrays.toString(monete) + '}';
	}

	public void inserisci(double valore) {
		inserisci(valore, 1);
	}

	public void inserisci(double valore, int qta) {
		for (int j = 0; j < monete.length; j++) {
			//se il valore delle monete è valido le inserisco
			if (Double.compare(valore, monete[j].getValore()) == 0) {
				monete[j].setQta(monete[j].getQta() + qta);
			}
		}
	}

	public double denaro() {
		double tot = 0.0;
		for (int j = 0; j < monete.length; j++) {
			tot += monete[j].getValore() * monete[j].getQta();
		}
		return tot;
	}

	public void denaroPerTipo() {
		for (int j = 0; j < monete.length; j++) {
			System.out.println("monedte da " + monete[j].getValore() + ": " + monete[j].getQta());
		}
	}

}
