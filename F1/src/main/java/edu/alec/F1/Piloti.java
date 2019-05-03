package edu.alec.F1;

import com.opencsv.bean.CsvToBeanBuilder;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alex.cazziolato
 */
public class Piloti {
	private String fileCSVfullname;
	private List<Pilota> piloti;

	public Piloti() {
		this.fileCSVfullname = "piloti.csv";
		
	}

	public Piloti(String pathFileCSV) {
		this.fileCSVfullname = pathFileCSV;
		try {
			piloti = new CsvToBeanBuilder(new FileReader(pathFileCSV)).withType(Pilota.class).build().parse();
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Piloti.class.getName()).log(Level.SEVERE, null, ex);
			System.out.println("File " + pathFileCSV + " non trovato");
			System.exit(1);
		}
	}

	@Override
	public String toString() {
		return "Piloti{" + "pathFileCSV=" + fileCSVfullname + ", piloti=" + piloti + '}';
	}
	
}
