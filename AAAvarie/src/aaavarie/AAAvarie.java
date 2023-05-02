package aaavarie;

import java.util.Arrays;

public class AAAvarie {

	public static void main(String[] args) {
		double[] vet = {1.0, 9.1, 11.3, 4.2, 9.1, -3.9};
		System.out.println("ix di 1.0 (0): " + ixElem(1.0, vet));
		System.out.println("ix di 11.3 (2): " + ixElem(11.3, vet));
		System.out.println("ix di -3.9 (5): " + ixElem(-3.9, vet));
		System.out.println("ix di 9.1 (1): " + ixElem(9.1, vet)); // da l'indice del primo trovato

		System.out.println("trova 1.0 (true): " + isPresente(1.0, vet));
		System.out.println("trova 11.3 (true): " + isPresente(11.3, vet));
		System.out.println("trova -3.9 (true): " + isPresente(-3.9, vet));
		System.out.println("trova 4.0 (false): " + isPresente(-3.9, vet));
		System.out.println("ix elem maggiore (2): " + ixElemMax(vet));
		System.out.println((1.0 / 17.0) == (1.0 / 17.0));

		int[][] mat = new int[4][2];
		int[][] matVariabile = new int[3][]; // 3 "righe", tutte a lunghezza variabile
		int[][] literalMat = {
			{1, 2, 3}, //prima "riga"
			{4, 5, 6}, //seconda "riga"
			{7, 8, 9, 10} //terza "riga". NB:  le righe possono avere un n. differente di elem.
		};
		System.out.println("literalMat[2][3]= " + literalMat[2][3]);
		System.out.println("\nliteralMat=\n" + (literalMat)); //richiama implicitamente il toString
		System.out.println("\nliteralMat=\n" + (literalMat).toString()); //stampa l'indr.
		System.out.println("\nliteralMat=\n" + Arrays.toString(literalMat)); //stampa l'indr. dei vettori componenti
		System.out.println("\nliteralMat=\n" + Arrays.deepToString(literalMat));
	}

	public static int ixElem(double elem, double[] vet) {
		boolean trovato = false;
		int ix;
		for (ix = 0; (ix < vet.length) && !trovato; ix++) {
			if (Double.compare(elem, vet[ix]) == 0) {
				trovato = true;
			}
		}
		return ix - 1;
	}

	public static int ixElemMax(double[] vet) {
		int ixMax = 0;
		double max = vet[ixMax];
		for (int ix = 0; (ix < vet.length); ix++) {
			if (Double.compare(max, vet[ix]) < 0) {
				max = vet[ix];
				ixMax = ix;
			}
		}
		return ixMax;
	}

	public static boolean isPresente(double x, double[] vet) {
		for (int j = 0; j < vet.length; j++) {
			if (Double.compare(x, vet[j]) == 0) {
				return true;
			}
		}
		return false;
	}

}
