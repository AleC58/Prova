package prjspellchecker02;

/**
 *
 * @author Alessandro Cazziolato
 */
public class TextEditor {

	private String text;
	private ISpellChecker spellChecker;

	//problema: la classe dipende da un servizio esterno
	// (il correttore ortografico), che viene creato
	//nel costruttore (-> ha una dipendenza)
	//se voglio aggiungere altre lingue devo modificare il codice
	//-> voglio rendere la classe TextEditor indipendente
	//dal servizio "correttore ort."
	//una soluzione a questo problema è modificare questo
	//progetto usando il pattern IoC (Inversion of Control)
	public TextEditor(String text, String language) {
		this.text = text;
		//creo un’istanza di una specifica
		//implementazione di SpellChecker
		//-> il codice dipende dal servizio (Classe) esterno
		//-> c'è un forte accoppiamento tra le due classi
		if (language.equals("English")) {
			this.spellChecker = new EnglishSpellChecker();
		} else if (language.equals("Italian")) {
			this.spellChecker = new ItalianSpellChecker();
		}
	}

	public void checkTextSpelling() {
		spellChecker.checkSpelling(text);
	}

}
