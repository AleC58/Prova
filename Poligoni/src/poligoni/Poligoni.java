package poligoni;

import java.util.ArrayList;

/**
 *
 * @author alex.cazziolato
 */
public class Poligoni {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		ArrayList<Poligono> a = new ArrayList<>();
		Quadrato q1 = new Quadrato(5.0);
		Quadrato q2 = new Quadrato(2.0);
		Quadrato q3 = new Quadrato(6.0);
		Rettangolo r1 = new Rettangolo(2.0, 3.0);
		Rettangolo r2 = new Rettangolo(3.0, 5.0);
		TriangoloRettangolo tr1 = new TriangoloRettangolo(3.0, 4.0);
		
		a.add(q1);
		a.add(r1);
		a.add(q2);
		a.add(q3);
		a.add(r2);
		a.add(tr1);
		for (Poligono p : a) {
			System.out.println(p + "   AREA: " + p.area() + "   PERIMETRO: " + p.perimetro());
		}
		a.sort();
	}
	
}
