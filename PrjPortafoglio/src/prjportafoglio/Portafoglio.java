package prjportafoglio;

import java.util.Arrays;

public class Portafoglio extends PortaMonete {

	//private static double[] TAGLI_DEI_SOLDI = {};
	public Portafoglio() {
		//crea un array dei tagli validi, unendo i tagli delle monete e quelli delle banconote
		double[] tagli = Arrays.copyOf(Soldi.getTAGLI_DELLE_MONETE(), Soldi.getTAGLI_DELLE_MONETE().length + Soldi.getTAGLI_DELLE_BANCONOTE().length);
		System.arraycopy(Soldi.getTAGLI_DELLE_BANCONOTE(), 0, tagli, Soldi.getTAGLI_DELLE_MONETE().length, Soldi.getTAGLI_DELLE_BANCONOTE().length);
		this.setTAGLI_DEI_SOLDI(tagli);
		//System.out.println(Arrays.toString(this.getTAGLI_DEI_SOLDI()));
		Soldi[] pfVuoto = new Soldi[getTAGLI_DEI_SOLDI().length];
		for (int j = 0; j < pfVuoto.length; j++) {
			pfVuoto[j] = new Soldi(tagli[j], 0);
		}
		setSoldi(pfVuoto);
	}

	public Portafoglio(int[] qta) {
		this(); // chiama il costruttore a 0 parametri, creando il portafoglio "vuoto"
		if (qta.length != this.getTAGLI_DEI_SOLDI().length) {
			System.out.println("Si devono dare le quantità per " + this.getTAGLI_DEI_SOLDI().length + " tipi di monetre");
			System.exit(1);
		}
		for (int j = 0; j < this.getSoldi().length; j++) {
			getSoldi()[j].setQta(qta[j]);
		}
	}

	public double banconote() {
		double tot = 0.0;
		for (int j = 0; j < getSoldi().length; j++) {
			//if (getSoldi()[j].getClass().getSimpleName().equals("Banconote")) {
			//if (getSoldi()[j].getTipo().equals(TipoSoldi.BANCONOTE)) {
			if (getSoldi()[j].getTipo() == TipoSoldi.BANCONOTE) {
				tot += getSoldi()[j].getTaglio() * getSoldi()[j].getQta();
			}
		}
		return tot;
	}
}
