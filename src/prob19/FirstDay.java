package prob19;

/**
 * Created by mai714 on 13.01.2015.
 */
public class FirstDay {
    private String date;
    private int count ;
   WeekDay day ;


    /**
     * KLeine Funktion um alle ersten des Monats während eines Jahrtausends zu generiern 1.1.1901-31.12.2000
     * @return Anzahl Sonntage die auf den ersten eines Monats fallen
     */
    public int monatBeginn(){

        count=0;
        for (int i =1901;i<2001;i++){
            for (int a =1;a<13;a++){
                day = new WeekDay();
                String date = 1+"."+Integer.valueOf(a)+"."+Integer.valueOf(i);
                /**
                 * Hier steckt irgendwo ein Problem, es nimmt Datum, dass nicht Sunday ist, und vergisst die Daten die Sunday sind
                 * z.B.: wird hier der 1.5.1904 nicht als Sonntag erkannt. Wenn ich aber das Datum manuell durchlaufen lasse,
                 * ist es ein Sonntag
                 *
                 * Gleiches Problem bei 1905
                 * 1.2.1905 erkennt er als Sunday, was falsch ist, Wenn ich das Datum Manuell eingebe stimmt die Ausgabe
                 * 1.1.1905 ist ein Sonntag, wird aber nicht erkannt.. auch hier, manuell eingegeben ist es kein problem
                 *
                 * Ich habe auch den String Date kopiert und manuel durchlaufen lassen um sicherzustellen dass es kein Format-
                 * problem ist... das selbe resultat
                 */
                if (day.day(date).equals("Saturday")){
                    //System.out.println(date);
                    count++;
                   // System.out.println(count);

                }
            }
        }

        return count;
    }
}
