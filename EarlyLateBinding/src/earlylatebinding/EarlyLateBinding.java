package earlylatebinding;

/**
 *
 * @author Alessandro Cazziolato
 */
public class EarlyLateBinding {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Veicolo a = new Auto();
		a.start();
		a.stop();
		Veicolo vv = new Veicolo();
		vv.start();
		vv.stop();
	}

}

class Veicolo {

	void start() {
		System.out.println("Veicolo parte");
	}

	static void stop() {
		System.out.println("Veicolo si ferma");
	}
}

class Auto extends Veicolo {

	@Override
	void start() {
		System.out.println("Auto parte");
	}

	static void stop() {
		System.out.println("Auto si ferma");
	}
}
