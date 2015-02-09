package prob19;

/**
 * Created by mai714 on 12.01.2015.
 */
public class WeekDay {
    private String[] day={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    private int[] datum = new int[3];

    private int[] month ={31,28,31,30,31,30,31,31,30,31,30,31};
    private int tot_lap=0;
    LapYear lapyear = new LapYear();
    private long tot_day=0;

    /**
     * Funktion um den Wochentag eines Datums zu bestimmen
     * @param date Datum im Format dd.mm.yyyy, d.m.yyyy geht auch
     * @return String mit dem Wochentag
     */
    public String day(String date){



        String[] raw=date.split("\\.");




      for(int i=0;i<raw.length;i++){
          datum[i]=Integer.valueOf(raw[i]);
      }
      /*  for (int i :datum){
            System.out.println("inhalt von datum []"+i);
        }*/

        datum[2]-=1900;

        tot_day=datum[2]*365;
       // System.out.println("Anzahl Tage: "+tot_day);

        if (datum[1]<3){
            tot_day+=datum[0];

            if (datum[1]==2){
                tot_day+=31;
            }
           // System.out.println("Anzahl tage nach ersten if: "+tot_day);
        }

        else{
            for (int i=0;i<datum[1]-1;i++){
               // System.out.println("monate: "+datum[1]);

                tot_day+=month[i];

            }
            tot_day+=datum[0];
        }
        //System.out.println("Anzahl tage nach zweitem if: "+tot_day);
        for(int i= 1900;i<=(1900+datum[2]);i++){
            if (lapyear.lapYear(i)){
                tot_lap++;

            }
        }
      //  System.out.println("Anzahl Schaltjahre: "+tot_lap);

        if (lapyear.lapYear(datum[2]+1900)&&datum[1]<=2){
            tot_lap-=1;

        }

        tot_day+=tot_lap;
        //System.out.println(tot_day);




        int index= (int) (tot_day%7);

       return day[index];
    }

}
