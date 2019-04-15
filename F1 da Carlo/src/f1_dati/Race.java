package f1_dati;

/**
 *
 * @author carlo
 */
import static f1_dati.Utilities.DateToString;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Race  {

    public static final int RACE_ID = 0;
    public static final int YEAR = 1;
    public static final int ROUND = 2;
    public static final int CIRCUIT_ID = 3;
    public static final int NAME = 4;
    public static final int R_DATE = 5;
    public static final int R_TIME = 6;
    public static final int R_URL = 7;

    protected int raceId;
    protected int year;
    protected int round;
    protected int circuitId;
    protected String name;
    protected Date date;
    protected String ora;
    protected String url;


    public  Race(String a[]) {
        this.raceId = Integer.parseInt(a[RACE_ID].trim());
        this.year = Integer.parseInt(a[YEAR].trim());
        this.round = Integer.parseInt(a[ROUND].trim());
        this.circuitId = Integer.parseInt(a[CIRCUIT_ID].trim());
        this.name = a[NAME];

        this.ora = a[R_TIME];
        this.url = a[R_URL];
//        System.out.println(Arrays.toString(a));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            this.date = sdf.parse(a[R_DATE].replace('\"', ' ').trim());
        } catch(ParseException pe){
            System.out.println(a[R_DATE]);
            System.out.println(pe.getMessage());
            this.date = null;
        }

    }

    public int getRaceId() {
        return raceId;
    }

    public int getYear() {
        return year;
    }

    public int getRound() {
        return round;
    }

    public int getCircuitId() {
        return circuitId;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String getOra() {
        return ora;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.raceId;
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
        final Race other = (Race) obj;
        if (this.raceId != other.raceId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Race{" + "raceId=" + raceId + ", year=" + year + ", round=" + round + ", circuitId=" + circuitId + ", name=" + name + ", "
                + "   date=" + DateToString(date) + ", ora=" + ora + ", url=" + url + '}';
    }


}
