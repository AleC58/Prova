package prjspellchecker01;

/**
 *
 * @author Alessandro Cazziolato
 */
public class PrjSpellChecker01 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		String text = "Testo di  esempio";
		TextEditor textEditor = new TextEditor(text);
		textEditor.checkTextSpelling();
	}

}
