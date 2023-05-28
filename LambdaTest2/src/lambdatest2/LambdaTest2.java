package lambdatest2;

public class LambdaTest2 {

	public static void main(String[] args) {
		//tramite test riesco ad accedere ai metodi non statici
		// della classe stessa (es. coolMethod)
		LambdaTest2 test = new LambdaTest2();
		String myString = "bla bla bla";
		//implemento il metodo get dell'interfaccia funzionale
		//Getter (il corpo è "return myString")
		Getter getter = () -> myString;
		//System.out.println("getter: " + getter);
		//System.out.println("getter.get(): " + getter.get());
		Getter getterFunzAnonima = new Getter() {
			@Override
			public String get() {
				return myString;
			}
		};
		//coolMethod non è static, e non può essere
		//referenziato direttamente
		//coolMethod restituisce il valore del metodo get
		//applicato al parametro getter.
		//Il metodo get è stato implementato con l'espressione
		//lambda, e restituisce il valore di myString("bla bla bla").
		//Alla fine, viene stampato "blabla bla"
		System.out.println(test.coolMethod(getter));
		/*se la riga seguente è commentata, myString è
		"effectively final" (non viene modificata)
		Una variabile locale referenziata da un'espressione
		lambda deve essere final o effectively final:
		quando si usa un’espressione lambda, il codice
		dell’espressione può essere eseguito in un altro thread.
		Se la variabile locale referenziata dall’espressione
		lambda non fosse final o effectively final, potrebbe
		essere modificata da un altro thread mentre l’espressione
		lambda viene eseguita, causando comportamenti imprevedibili
		e potenzialmente errati.*/
		//myString = "maramao";
	}

	public String coolMethod(Getter g) {
		return g.get();
	}
}

//Getter è un'interfaccia funzionale perché
//implementa un solo metodo astratto
@FunctionalInterface
interface Getter {

	String get();
}
