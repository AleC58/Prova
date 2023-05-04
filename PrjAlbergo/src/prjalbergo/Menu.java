package prjalbergo;

import java.util.Scanner;

/**
 *
 * @author Alessandro Cazziolato
 */
class Menu {
	private String titolo;
	protected String[] vociMenu;
	private int scelta;

	Menu(String titolo, String[] vociMenu) {
		this.titolo = titolo;
		this.vociMenu = new String[vociMenu.length + 1];
		this.vociMenu[0] = "0. Esci";
		for(int j = 1; j < this.vociMenu.length; j++) {
			this.vociMenu[j] = j + ". " + vociMenu[j - 1];
		};
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getScelta() {
		visualizza();
		Scanner tastiera = new Scanner(System.in);
		scelta = tastiera.nextInt();
		return scelta;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "{" + "titolo=" + titolo + ", vociMenu=" + vociMenu + '}';
	}

	protected void visualizza() {
		System.out.println("\n\n" + titolo);
		for(int j = 0; j < vociMenu.length; j++) {
			System.out.println(vociMenu[j]);
		};
		System.out.print("\nScelta: ");
	}
}
