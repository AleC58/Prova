package f1_dati;

import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class Races extends FromFileCSV<Race> {

    public Races(String fileName) {
        super(fileName);
    }

    @Override
    protected void convert(ArrayList<String[]> arr) {
        for (String[] s : arr) {
            Race c = new Race(s);
            this.tab.add(c);
        }
    }

    public ArrayList<Race> getAllRaces(int y) {
        ArrayList<Race> ret = new ArrayList<>();
        for (Race r : tab) {
            if (r.getYear() == y) {
                ret.add(r);
            }
        }
        return ret;
    }
}
