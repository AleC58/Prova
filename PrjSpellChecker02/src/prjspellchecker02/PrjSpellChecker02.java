package prjspellchecker02;

/**
 *
 * @author Alessandro Cazziolato
 */
public class PrjSpellChecker02 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		String text = "Testo di  esempio";
		TextEditor textEditor = new TextEditor(text, "Italian");
		textEditor.checkTextSpelling();

		text = "Example text";
		textEditor = new TextEditor(text, "English");
		textEditor.checkTextSpelling();
	}

}
