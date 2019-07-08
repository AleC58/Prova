package sommanat01;

import java.util.Scanner;

public class SommaNat01 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.print("n = ");
		int n = tastiera.nextInt();
		int tot = sommaNat(n);
		System.out.println("somma naturali: " + tot);
	}

	private static int sommaNat(int n) {
		int tot = 0;
		for (int j = 0; j <= n; j++) {
			tot += j;
		}
		return tot;
	}
	
}
