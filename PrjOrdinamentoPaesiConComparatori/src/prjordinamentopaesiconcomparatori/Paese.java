package prjordinamentopaesiconcomparatori;

/**
 *
 * @author Alessandro Cazziolato
 */
class Paese implements Comparable<Paese> {
    String nome;
    int popolazione;
    int superficie;

    public Paese(String nome, int popolazione, int superficie) {
        this.nome = nome;
        this.popolazione = popolazione;
        this.superficie = superficie;
    }

    @Override
    public int compareTo(Paese altro) {
        return this.nome.compareTo(altro.nome);
    }

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "{" + "nome=" + nome + ", popolazione=" + popolazione + ", superficie=" + superficie + '}';
	}
}
