package prjpoligonigrafici;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author alex.cazziolato
 */
public class PrjPoligoniGrafici {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		//non posso creare oggetti Poligono, è abstract!
		//Poligono pp = new Poligono();
		//posso creare un Array, che contiene oggetti
		//"concreti" derivati da Poligono
		Poligono[] p = new Poligono[6];
		p[0] = new Quadrato(5.0);
		p[1] = new Rettangolo(2.0, 3.0);
		p[2] = new TriangoloRettangolo(3.0, 4.0);
		p[3] = new Cerchio(3.0);
		p[4] = new Quadrato(2.0);
		p[5] = new Cerchio(1.0);
		for (int j = 0; j < p.length; j++) {
			System.out.println(p[j].getClass().getSimpleName() + "   AREA: " + p[j].area() + "   PERIMETRO: " + p[j].perimetro());
		}
		System.out.println("\n\n");
		for (Poligono pol : p) {
			System.out.println(pol + "   AREA: " + pol.area() + "   PERIMETRO: " + pol.perimetro());
		}
		System.out.println("\n\n");

		ArrayList<Poligono> a = new ArrayList<>();
		Quadrato q1 = new Quadrato(5.0);
		Quadrato q2 = new Quadrato(2.0);
		Quadrato q3 = new Quadrato(6.0);
		Rettangolo r1 = new Rettangolo(2.0, 3.0);
		Rettangolo r2 = new Rettangolo(3.0, 5.0);
		TriangoloRettangolo tr1 = new TriangoloRettangolo(3.0, 4.0);
		Cerchio c1 = new Cerchio(1);
		Cerchio c2 = new Cerchio(4);

		a.add(q1);
		a.add(c2);
		a.add(r1);
		a.add(q2);
		a.add(q3);
		a.add(r2);
		a.add(c1);
		a.add(tr1);
		for (Poligono pol : a) {
			System.out.println(pol + "   AREA: " + pol.area() + "   PERIMETRO: " + pol.perimetro());
		}
		System.out.println("\n\nCalcola l'area dei soli rettangoli:");
		double totAreaRett = 0;
		for (Poligono pol : a) {
			if (pol.getClass().getSimpleName().equals("Rettangolo")) {
				System.out.println(pol.getClass().getSimpleName() + "   AREA: " + pol.area());
				totAreaRett += pol.area();
			}
		}
		System.out.println("Area totale dei rettangoli: " + totAreaRett);

		q1.disegna();
		c1.disegna();
		tr1.zoom();

		//ma i veri vantaggi delle interfacce si capiscono da qua:
		System.out.println("\n\nArray ordinato per nome poligono:");
		Arrays.sort(p); //metodo sort della classe Arrays
		for (Poligono pol : p) {
			System.out.println(pol + "   AREA: " + pol.area() + "   PERIMETRO: " + pol.perimetro());
		}
		Collections.sort(a); //metodo sort della classe Collections
		System.out.println("\n\nArrayList ordinato per nome poligono:");
		for (Poligono pol : a) {
			System.out.println(pol + "   area: " + pol.area() + "   perimetro: " + pol.perimetro());
		}
	}
}
