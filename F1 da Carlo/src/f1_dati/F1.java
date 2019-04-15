/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f1_dati;

import static f1_dati.Utilities.downloadFiles;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author carlo
 */
public class F1 {

    public static final String FILES_CSV = "resources\\dati_csv";
    public static final String BASE_USR = "http://ergast.com/mrd/db/#csv";

    public static void main(String[] args) throws Exception {
//           downloadFiles();
        System.out.println(Arrays.toString(Database.getInstance().races.getAllRaces(2018).toArray()));
        System.out.println("numero G: "+Database.getInstance().races.getAllRaces(2018).size());
//        System.out.println(Database.getInstance().races);
//            Database.getInstance();

		System.out.println("Corse vinte da Hamilton: " +
				Arrays.toString(
						Utilities.filterData(Database.getInstance().results.tab,
						   (x -> x.getDriverId() == 1)  ).toArray() ));

    }
}
