package prjspellchecker02;

/**
 *
 * @author Alessandro Cazziolato
 */
public class EnglishSpellChecker implements ISpellChecker {

	@Override
	public void checkSpelling(String text) {
		System.out.println("Simulo il controllo ortografico su testo inglese: " + text);
	}

}
