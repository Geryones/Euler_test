package prob19;

/**
 * Created by mai714 on 12.01.2015.
 */
public class LapYear {
    private boolean lap;

    /**
     * funktion um zu bestimmen, ob ein Jahr ein schaltjahr ist oder nicht
     * @param year Jahr welches bestimmt werden soll
     * @return  true or false.. true= schaltjahr
     */
    public boolean lapYear(int year){

        if (year%400==0){
            lap=true;
        }
        else if (year%100==0 && year%4==0){
            lap=false;
        }
        else if(year%4==0){
            lap=true;
        }
        else {
            lap = false;
        }

        return lap;
    }
}
