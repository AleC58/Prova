package prjspellchecker03;

/**
 *
 * @author Alessandro Cazziolato
 */
public class PrjSpellChecker03 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		String text = "Testo di  esempio";
		ISpellChecker italianSpellChecker = new ItalianSpellChecker();
		TextEditor textEditor = new TextEditor(text, italianSpellChecker);
		textEditor.checkTextSpelling();

		text = "Example text";
		ISpellChecker englishSpellChecker = new EnglishSpellChecker();
		textEditor = new TextEditor(text, englishSpellChecker);
		textEditor.checkTextSpelling();

		text = "Exemple de texte";
		ISpellChecker frenchSpellChecker = new FrenchSpellChecker();
		textEditor = new TextEditor(text, frenchSpellChecker);
		textEditor.checkTextSpelling();
	}

}
