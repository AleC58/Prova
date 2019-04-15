package f1_dati;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 *
 * @author carlo
 */
public class Utilities {

    public static final String DIR_FILES_CSV = "resources/dati_csv";
    public static final String BASE_USR = "http://ergast.com/mrd/db/#csv";
    public static final String local_archive = "resources/dati_csv/f1db_csv.zip";
    public static final String remote_archive = "http://ergast.com/downloads/f1db_csv.zip";
    public static final String CONSTRUCTORS_FILE = "constructors.csv";
    public static final String RACES_FILE = "races.csv";    
    public static final String RESULTS_FILE = "results.csv";    
    
    
    public static void downloadRemoteZip(String remote_archive, String local_archive_dir) {
        URL url = null;

        try {
            url = new URL(remote_archive);
            File d = new File(local_archive_dir);
            if (!d.exists()) {
                d.mkdir();
            }
            System.out.println("Inizio Downloaded ...");
//            System.out.println(Paths.get(local_archive));
            try {
                BufferedInputStream in = new BufferedInputStream(url.openStream());
                FileOutputStream fileOutputStream = new FileOutputStream(local_archive);
                byte dataBuffer[] = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                    fileOutputStream.write(dataBuffer, 0, bytesRead);
                }
                fileOutputStream.close();
            } catch (IOException e) {
                // handle exception
            }

            System.out.println("Downloaded remote zip file.");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void unzip(String zip_file_path, String dest_dir) {
        File origin = new File(zip_file_path);
        if (!origin.exists()) {
            System.out.println("Il file " + zip_file_path + " non esiste.");
            return;
        }
        File dir = new File(dest_dir);
        // create output directory if it doesn't exist
        if (!dir.exists()) {
            dir.mkdirs();
        }
        FileInputStream fis;
        //buffer for read and write data to file
        byte[] buffer = new byte[1024];
        try {
            fis = new FileInputStream(zip_file_path);
            ZipInputStream zis = new ZipInputStream(fis);
            ZipEntry ze = zis.getNextEntry();
            while (ze != null) {
                String fileName = ze.getName();
                File newFile = new File(dest_dir + File.separator + fileName);
                System.out.println("Unzipping to " + newFile.getAbsolutePath());
                //create directories for sub directories in zip
                new File(newFile.getParent()).mkdirs();
                FileOutputStream fos = new FileOutputStream(newFile);
                int len;
                while ((len = zis.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }
                fos.close();
                //close this ZipEntry
                zis.closeEntry();
                ze = zis.getNextEntry();
            }
            //close last ZipEntry
            zis.closeEntry();
            zis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void downloadFiles() {
//        downloadRemoteZip(remote_archive, DIR_FILES_CSV);

        unzip(local_archive, DIR_FILES_CSV);

    }

    
    public static  ArrayList<String[]> readFromCSV(String csvFilename) {

        Scanner csvReader = null;
        String[] row = null;
        ArrayList<String[]> ret = new ArrayList<>();

        try {
            csvReader = new Scanner(new FileReader(csvFilename));
            while (csvReader.hasNextLine()) {
                row = csvReader.nextLine().split(",");
                ret.add(row);

            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.exit(1);
        } finally {
            if (csvReader != null) {
                csvReader.close();
            }
        }
        return ret;
    }   
    
    public static String DateToString(Date d) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        return simpleDateFormat.format(d);
    }

    public static int strToInt(String s) {
        int ret =0;
        try {
           ret = Integer.parseInt(s.trim()); 
        } catch (NumberFormatException e) {
            
        }
        return ret;
    }  
	
	public static <T> ArrayList<T> filterData(ArrayList<T> arr, Predicate<T> p){
		ArrayList<T> ret = new ArrayList<>();
		for (T x: arr){
			if (p.test(x)) ret.add(x);
		}
		return ret;
	}
}
