package prjcontocorrente;

import java.util.ArrayList;

/**
 *
 * @author ALEX.CAZZIOLATO
 */
public class Conto {
    private static int contCodConto = 0;
    
    private int numConto;
    private ArrayList<Operazione> operazione;

    public Conto() {
        this.numConto = contCodConto++;
        this.operazione = new ArrayList<>();
    }

    public int getNumConto() {
        return numConto;
    }

    public void setNumConto(int numConto) {
        this.numConto = numConto;
    }

    public ArrayList<Operazione> getOperazione() {
        return operazione;
    }

    public void setOperazione(ArrayList<Operazione> operazione) {
        this.operazione = operazione;
    }

    @Override
    public String toString() {
        return "Conto{" + "numConto=" + numConto + ", operazione=" + operazione + '}';
    }
    
}
