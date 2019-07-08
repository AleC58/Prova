package sommanat;

import java.util.Scanner;

/**
 *
 * @author alex.cazziolato
 */
public class SommaNat {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.print("n = ");
		int n = tastiera.nextInt();
		int somma = sommaNat(n);
		System.out.println("somma naturali=" + somma);
	}

	private static int sommaNat(int n) {
		int tot = n * (n + 1) /2;
		return tot;
	}
	
}
