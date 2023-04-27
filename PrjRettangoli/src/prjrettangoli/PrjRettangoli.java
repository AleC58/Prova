package prjrettangoli;

import java.util.Scanner;

/**
 *
 * @author Alessandro Cazziolato
 */
public class PrjRettangoli {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		double x;
		double y;
		Punto p = new Punto();
		Punto q = new Punto(2.0, 4.0);
		System.out.println("p: " + p);
		System.out.println("q: " + q);
		Scanner tastiera = new Scanner(System.in);
		System.out.print("x: ");
		x = tastiera.nextDouble();
		System.out.print("y: ");
		y = tastiera.nextDouble();
		p.setX(x);
		p.setY(y);
		System.out.println("p con nuove coord: " + p);
		System.out.println("i punti 'p' e 'q' sono uguali? " + (p.equals(q) ? "Si" : "No"));
	}

}
