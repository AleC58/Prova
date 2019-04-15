package f1_dati;

import static f1_dati.Utilities.readFromCSV;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public abstract class FromFileCSV<E> {
    protected ArrayList<E> tab;
    protected String pathName;
    
    public FromFileCSV(String pathName){
        this.pathName = pathName;
        tab = new ArrayList<>();
        ArrayList<String[]> arr = readFromCSV(pathName);
        convert(arr);
    }
    
    protected abstract void convert (ArrayList<String[]> arr);



    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" + "tab=" + Arrays.toString(tab.toArray()) + '}';
    }
   

}