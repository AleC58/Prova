package f1_dati;

import static f1_dati.Utilities.CONSTRUCTORS_FILE;
import static f1_dati.Utilities.DIR_FILES_CSV;
import static f1_dati.Utilities.RACES_FILE;
import static f1_dati.Utilities.RESULTS_FILE;

/**
 *
 * @author carlo
 */
public class Database {
    protected  Constructors constructors;
    protected Races races;
    protected Results results;
    private static Database single_instance = null;

    private Database() {
        
        constructors = new Constructors(DIR_FILES_CSV + "//" + CONSTRUCTORS_FILE);
        results = new Results(DIR_FILES_CSV + "//" + RESULTS_FILE);
        races = new Races(DIR_FILES_CSV + "//" + RACES_FILE);
    }
    public static Database getInstance() {
        if (single_instance == null) {
            single_instance = new Database();
        }
        return single_instance;
    }    
    
}
