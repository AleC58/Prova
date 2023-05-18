package prjcomparableetcomparator;

import java.util.Comparator;

/**
 *
 * @author Alessandro Cazziolato
 */
class PoligonoCmpNumLati implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Poligono p1 = (Poligono) o1;
		Poligono p2 = (Poligono) o2;
		return Integer.compare(p1.getNumLati(), p2.getNumLati());
	}

}
