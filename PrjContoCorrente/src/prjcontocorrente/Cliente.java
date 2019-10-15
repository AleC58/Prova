package prjcontocorrente;

/**
 *
 * @author ALEX.CAZZIOLATO
 */
public class Cliente {
    static int contCodCliente = 0;
    
    private int codCliente;
    private String nome;
    private String cognome;
    private Conto conto;

    public Cliente(String nome, String cognome) {
        this(nome, cognome, null);
    }

    public Cliente(String nome, String cognome, Conto conto) {
        this.codCliente = contCodCliente++;
        this.nome = nome;
        this.cognome = cognome;
        this.conto = conto;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Conto getConto() {
        return conto;
    }

    public void setConto(Conto conto) {
        this.conto = conto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.codCliente != other.codCliente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codCliente=" + codCliente + ", nome=" + nome + ", cognome=" + cognome + ", conto=" + conto + '}';
    }
  
}
