package prjcomparableetcomparator;

import java.util.Comparator;

/**
 *
 * @author Alessandro Cazziolato
 */
public class PoligonoCmpArea implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Poligono p1 = (Poligono)o1;
		Poligono p2 = (Poligono)o2;
		return Double.compare(p1.area(), p2.area());
	}

}
