package prjcontocorrente;

import java.math.BigDecimal;

/**
 *
 * @author ALEX.CAZZIOLATO
 */
public class Operazione {
    private static int contCodOp = 0;

    public static int getContCodOp() {
        return contCodOp;
    }

    public static void setContCodOp(int aContCodOp) {
        contCodOp = aContCodOp;
    }
    
    //int numConto; //n. di conto sul quale è effettuata l'op.
    private int numOp;
    private String data; //data dell'op. nella forma "AAAA-MM-GG"
    private String descrizione;
    private BigDecimal importo;
    private boolean entrata; //TRUE=entrata;  FALSE=uscita

    public Operazione(String data, String descrizione, BigDecimal importo, boolean entrata) {
        this.numOp = contCodOp++;
        this.data = data;
        this.descrizione = descrizione;
        this.importo = importo;
        this.entrata = entrata;
    }

    public boolean isEntrata() {
        return entrata;
    }

    public void setEntrata(boolean entrata) {
        this.entrata = entrata;
    }

    public int getNumOp() {
        return numOp;
    }

    public void setNumOp(int numOp) {
        this.numOp = numOp;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public BigDecimal getImporto() {
        return importo;
    }

    public void setImporto(BigDecimal importo) {
        this.importo = importo;
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
        final Operazione other = (Operazione) obj;
        if (this.numOp != other.numOp) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Operazione{" + "numOp=" + numOp + ", data=" + data + ", descrizione=" + descrizione + ", importo=" + importo + ", entrata=" + entrata + '}';
    }
    
}
