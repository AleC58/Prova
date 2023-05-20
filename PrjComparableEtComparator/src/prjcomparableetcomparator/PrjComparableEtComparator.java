package prjcomparableetcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Alessandro Cazziolato
 */
public class PrjComparableEtComparator {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int[] vet = {6, 9, 3, 2, 1, 8, 5};
		Arrays.sort(vet); //int è già a posto con Comparable
		System.out.println("Vettore ordinato:");
		System.out.println(Arrays.toString(vet));
		System.out.println("\n\n");
		//Poligono pp = new Poligono();
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
			System.out.println(pol + "  area: " + pol.area() + "  preimetro: " + pol.perimetro());
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
		Cerchio c2 = new Cerchio(9);
		Cerchio c3 = new Cerchio(3);

		a.add(c3);
		a.add(q1);
		a.add(c2);
		a.add(r1);
		a.add(q2);
		a.add(q3);
		a.add(r2);
		a.add(c1);
		a.add(tr1);
		for (Poligono pol : a) {
			System.out.println(pol + "  area: " + pol.area() + "  preimetro: " + pol.perimetro());
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

		//ma i veri vantaggi delle interfacce si capiscono da qua:
		System.out.println("\n\nArray ordinato per nome poligono:");
		Arrays.sort(p);
		for (Poligono pol : p) {
			System.out.println(pol + "  area: " + pol.area() + "  preimetro: " + pol.perimetro());
		}
		//ordinamento "naturale": usa compareTo -> per nome
		Collections.sort(a);
		System.out.println("\n\nArrayList ordinato per nome poligono:");
		for (Poligono pol : a) {
			System.out.println(pol + "  area: " + pol.area() + "  preimetro: " + pol.perimetro());
		}

		//con i comparatori
		PoligonoCmpArea cmpArea = new PoligonoCmpArea();
		Collections.sort(a, cmpArea);
		System.out.println("\n\nArrayList ordinato per area:");
		for (Poligono pol : a) {
			System.out.println(pol + "  area: " + pol.area() + "  preimetro: " + pol.perimetro());
		}

		PoligonoCmpNumLati cmpNumLati = new PoligonoCmpNumLati();
		Collections.sort(a, cmpNumLati);
		System.out.println("\n\nArrayList ordinato per numero lati:");
		for (Poligono pol : a) {
			System.out.println(pol + "  area: " + pol.area() + "  preimetro: " + pol.perimetro());
		}

		PoligonoCmpNumLatiNome cmpNumLatiNome = new PoligonoCmpNumLatiNome();
		Collections.sort(a, cmpNumLatiNome);
		System.out.println("\n\nArrayList ordinato per numero lati e nome:");
		for (Poligono pol : a) {
			System.out.println(pol + "  area: " + pol.area() + "  preimetro: " + pol.perimetro());
		}

	}
}
