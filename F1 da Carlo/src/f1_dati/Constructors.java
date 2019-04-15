package f1_dati;

import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class Constructors extends FromFileCSV<Constructor> {

  public Constructors (String fileName) {
      super(fileName);
  }

    @Override
    protected void convert(ArrayList<String[]> arr) {
        for (String[] s: arr) {
            Constructor c = new Constructor(s);
            this.tab.add(c);
        }
    }
  
    
}
