package prjcomparableetcomparator;

import java.util.Comparator;

/**
 *
 * @author Alessandro Cazziolato
 */
public class PoligonoCmpNumLatiNome implements Comparator<Poligono> {
	//con i generics non serve il casting
	@Override
	public int compare(Poligono o1, Poligono o2) {
		if (o1.getNumLati() != o2.getNumLati()) {
			return o1.getNumLati() - o2.getNumLati();
		} else {
			return o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
		}
	}

}
