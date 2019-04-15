package f1_dati;

import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class Results extends FromFileCSV<Result>{

  public Results (String fileName) {
      super(fileName);
  } 
    @Override
    protected void convert(ArrayList<String[]> arr) {
        for (String[] s: arr) {
            Result c = new Result(s);
            this.tab.add(c);
        }
    }
}
