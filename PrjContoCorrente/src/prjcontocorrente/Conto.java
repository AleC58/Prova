package prjcontocorrente;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author ALEX.CAZZIOLATO
 */
public class Conto {
    private static int contCodConto = 0;
    
    private int numConto;
    private ArrayList<Operazione> operazioni;

    public Conto() {
        this.numConto = contCodConto++;
        this.operazioni = new ArrayList<>();
    }

    public int getNumConto() {
        return numConto;
    }

    public void setNumConto(int numConto) {
        this.numConto = numConto;
    }

    public ArrayList<Operazione> getOperazioni() {
        return operazioni;
    }

    public void setOperazioni(ArrayList<Operazione> operazioni) {
        this.operazioni = operazioni;
    }

    public int getNumOp(Operazione op) {
        return this.operazioni.indexOf(op);
    }

    public void addOperazione(Operazione op) {
        this.operazioni.add(op);
    }

    public void delOperazione(Operazione op) {
        this.operazioni.remove(op);
    }

    public void modOperazione(Operazione OrigOp, Operazione NewOp) {
        int numOp = getNumOp(OrigOp);
		this.operazioni.set(numOp, NewOp);
    }

    public void modOperazione(int numOp, Operazione NewOp) {
		this.operazioni.set(numOp, NewOp);
    }

    public long saldo() {
		long saldo = 0;
		for(Operazione op : operazioni) {
			saldo = op.isEntrata() ? saldo + op.getImporto() : saldo - op.getImporto();
		}
		return saldo;
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
		final Conto other = (Conto) obj;
		if (this.numConto != other.numConto) {
			return false;
		}
		return true;
	}

    @Override
    public String toString() {
        return "Conto{" + "numConto=" + numConto + ", operazione=" + operazioni + '}';
    }
    
}
