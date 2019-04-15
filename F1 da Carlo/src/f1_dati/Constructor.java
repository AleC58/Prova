package f1_dati;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class Constructor {

    public static final int CONSTRUCTOR_ID = 0;
    public static final int CONSTRUCTOR_REF = 1;
    public static final int NAME = 2;
    public static final int NATIONALITY = 3;
    public static final int URL = 4;

    protected int constructorId;
    protected String constructorRef;
    protected String name;
    protected String nationality;
    protected String url;

    public Constructor(String a[]) {
        this.constructorId = Integer.parseInt(a[CONSTRUCTOR_ID].trim());
        this.constructorRef = a[CONSTRUCTOR_REF];
        this.name = a[NAME];
        this.nationality = a[NATIONALITY];
        this.url = a[URL];
    }

    public int getConstructorId() {
        return constructorId;
    }

    public String getConstructorRef() {
        return constructorRef;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.constructorId;
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
        final Constructor other = (Constructor) obj;
        if (this.constructorId != other.constructorId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Constructor{" + "constructorId=" + constructorId + ", constructorRef=" + constructorRef + ", name=" + name + ", nationality=" + nationality + ", url=" + url + '}';
    }

}
