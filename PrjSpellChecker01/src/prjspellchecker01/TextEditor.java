package prjspellchecker01;

/**
 *
 * @author Alessandro Cazziolato
 */
public class TextEditor {
	private String text;

	public TextEditor(String text) {
		this.text = text;
	}

	//problema: se voglio cambiare lingua?
	public void checkTextSpelling() {
		System.out.println("Simulo il controllo ortografica del testo: " + text);
	}

}
