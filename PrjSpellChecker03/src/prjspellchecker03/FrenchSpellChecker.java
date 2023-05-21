package prjspellchecker03;

/**
 *
 * @author Alessandro Cazziolato
 */
public class FrenchSpellChecker implements ISpellChecker {

	@Override
	public void checkSpelling(String text) {
		System.out.println("Simulo il controllo ortografico su testo francese: " + text);
	}

}
