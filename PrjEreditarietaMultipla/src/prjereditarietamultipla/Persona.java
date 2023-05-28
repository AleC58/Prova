package prjereditarietamultipla;

/**
 *
 * @author Alessandro Cazziolato
 */
public class Persona implements ILavoratore, IStudente {

	private String nome;
	private int oreLavoro;
	private int oreStudio;

	public Persona(String nome) {
		this.nome = nome;
		this.oreLavoro = 0;
		this.oreStudio = 0;
	}

	@Override
	public void lavora() {
		System.out.println("Adesso " + nome + " sta lavorando");
		oreLavoro++;
	}

	@Override
	public void studia() {
		System.out.println(nome + " sta studiando");
		oreStudio++;
	}

	public int getOreLavoro() {
		return oreLavoro;
	}

	public int getOreStudio() {
		return oreStudio;
	}

	public String getNome() {
		return nome;
	}
}
