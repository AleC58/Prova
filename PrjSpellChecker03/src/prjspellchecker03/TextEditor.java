package prjspellchecker03;

/**
 *
 * @author Alessandro Cazziolato
 */
public class TextEditor {

	private String text;
	private ISpellChecker spellChecker; //la variabile spellChecker è la Dependency

	//usando il pattern IoC (Inversion of Control)
	//la classe diventa indipendente dal servizio da cui dipende
	//(il correttore ortografico): questo viene creato all'esterno
	//e passato al costruttore.
	//Nell'esempio l'IoC è implementato tramite la tecnica della
	//Dependency Injection (DI)
	public TextEditor(String text, ISpellChecker spellChecker) {
		this.text = text;
		//DI: l'oggetto ha solo il riferimento al servizio
		//(l'oggetto da cui dipende)
		//la variabile spellChecker è la Dependency
		//l'Injection è l'inizializzazione della variabile.
		//In questo caso, poiché l'inizializzazione viene fatta
		//nel costruttore, si parla di Constructor Injection
		this.spellChecker = spellChecker;
	}

	//... rimane ancora il problema della creazione/gestione
	//del ciclo di vita degli oggetti che forniscono i servizi
	//-> prima di creare un TextEditor bisgna aver creato
	//un ISpellChecker, che viene poi passato al costruttore
	//-> per semplificare questi aspetti si usa un framework
	//(ad esempio Spring/Spring Boot) che si prende in carico
	//la gestione delle dipendenze (e non solo)
	//semplificando la scrittura del codice

	public void checkTextSpelling() {
		spellChecker.checkSpelling(text);
	}

}
