package f1_dati;

import static f1_dati.Race.CIRCUIT_ID;
import static f1_dati.Race.NAME;
import static f1_dati.Race.RACE_ID;
import static f1_dati.Race.ROUND;
import static f1_dati.Race.R_DATE;
import static f1_dati.Race.R_TIME;
import static f1_dati.Race.R_URL;
import static f1_dati.Race.YEAR;
import static f1_dati.Utilities.strToInt;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author carlo
 */
public class Result {

    public static final int RESULT_ID = 0;
    public static final int RACE_ID = 1;
    public static final int DRIVER_ID = 2;
    public static final int CONSTRUCTOR_ID = 3;
    public static final int NUMBER = 4;
    public static final int GRID = 5;
    public static final int POSITION = 6;
    public static final int POSITION_TEXT = 7;
    public static final int POSITION_ORDER = 8;
    public static final int POINTS = 9;
    public static final int LAPS = 10;
    public static final int R_TIME = 11;
    public static final int MILLISEC = 12;
    public static final int FATEST_LAP = 13;
    public static final int RANK = 14;
    public static final int FATESTEST_LAP_TIME = 15;
    public static final int FATESTEST_LAP_SPEED = 16;
    public static final int STATUS_ID = 17;

    protected int resultId;
    protected int raceId;
    protected int driverId;
    protected int constructorId;
    protected int number;
    protected int grid;
    protected int position;
    protected int positionOrder;
    protected int points;
    protected int laps;


    public  Result(String a[]) {
        this.resultId = strToInt(a[RESULT_ID]);
        this.raceId = strToInt(a[RACE_ID]);
        this.driverId = strToInt(a[DRIVER_ID]);
        this.constructorId = strToInt(a[CONSTRUCTOR_ID]);
        this.number = strToInt(a[NUMBER]);
        this.grid = strToInt(a[GRID]);
        this.position = strToInt(a[POSITION]);
        this.positionOrder = strToInt(a[POSITION_ORDER]);
        this.points = strToInt(a[POINTS]);
        this.laps = Integer.parseInt(a[LAPS].trim());
    }

    public int getResultId() {
        return resultId;
    }

    public int getRaceId() {
        return raceId;
    }

    public int getDriverId() {
        return driverId;
    }

    public int getConstructorId() {
        return constructorId;
    }

    public int getNumber() {
        return number;
    }

    public int getGrid() {
        return grid;
    }

    public int getPosition() {
        return position;
    }

    public int getPositionOrder() {
        return positionOrder;
    }

    public int getLaps() {
        return laps;
    }

    @Override
    public String toString() {
        return "Result{" + "raceId=" + raceId + ", driverId=" + driverId + ", constructorId=" + constructorId + ", number=" + number + ", position=" + position + ", points=" + points + '}';
    }

    



}
