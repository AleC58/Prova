package prjportafoglio;

public class Portafoglio extends PortaMonete {
	private static final double[] TAGLI_DEI_SOLDI = {0.5, 1.0, 2.0, 5.0, 10.0, 20.0};

	public Portafoglio() {
		Soldi[] pfVuoto = new Soldi[TAGLI_DEI_SOLDI.length];
		pfVuoto = new Soldi[TAGLI_DEI_SOLDI.length];
		for (int j = 0; j < pfVuoto.length; j++) {
			if(TAGLI_DEI_SOLDI[j] <= 2) { // fino a 2 Euro sono monete, oltre 2 sono banconote
				pfVuoto[j] = new Monete(TAGLI_DEI_SOLDI[j], 0);
			} else {
				pfVuoto[j] = new Banconote(TAGLI_DEI_SOLDI[j], 0);
			}
		}
		setSoldi(pfVuoto);
	}

	public Portafoglio(int[] qta) {
		if (qta.length != TAGLI_DEI_SOLDI.length) {
			System.out.println("Si devono dare le quantità per " + TAGLI_DEI_SOLDI.length + " tipi di monetre");
			System.exit(1);
		}
		Soldi[] pf = new Soldi[TAGLI_DEI_SOLDI.length];
		pf = new Soldi[TAGLI_DEI_SOLDI.length];
		for (int j = 0; j < pf.length; j++) {
			if(TAGLI_DEI_SOLDI[j] <= 2) { // fino a 2 Euro sono monete, oltre 2 sono banconote
				pf[j] = new Monete(TAGLI_DEI_SOLDI[j], qta[j]);
			} else {
				pf[j] = new Banconote(TAGLI_DEI_SOLDI[j], qta[j]);
			}
		}
		setSoldi(pf);
	}

	public double banconote() {
		double tot = 0.0;
		for (int j = 0; j < getSoldi().length; j++) {
			//if (getSoldi()[j].getClass().getSimpleName().equals("Banconote")) {
			//if (getSoldi()[j].getTipo().equals(TipoSoldi.BANCONOTE)) {
			if (getSoldi()[j].getTipo() == TipoSoldi.BANCONOTE) {
				tot += getSoldi()[j].getValore() * getSoldi()[j].getQta();
			}
		}
		return tot;
	}
}
