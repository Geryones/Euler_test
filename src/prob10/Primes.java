package prob10;

import java.util.ArrayList;

/**
 * Created by mai714 on 22.12.2014.
 */
public class Primes {
    private long count;
    public ArrayList<Long> primes = new ArrayList();
    int counter = 0;
    private long max = 10L;
    private boolean isPrime;
    int i=0;
    Long summ=0L;


    /**
     * Funktion um Primzahlen auszurechnen, mit max, gibt man die höchste Zahl an
     * @return ArrayList mit Typ Long, Liste aller Primzahlen bis zum Max, 1 wird nicht gezählt, 2 ist erste Primzahl
     */
    public ArrayList<Long> prim() {


        for (count = 1; count < max ; count++) {
            if (count % 2 == 1) {
                isPrime = true;
                //count/2 daher, da der grösste Teiler einer Zahl zwingend grösser als 2 sein muss.
                for (long i = 2; i < (count / 2) + 0.5; i++) {
                    if (count % 2 == 0)
                        break;
                    if (count % i == 0) {
                        isPrime = false;
                        break;
                    }


                }
                if (isPrime == true)
                    primes.add(count);
            }

        }
        // es nimmt 1 als erste primzahl und akzeptiert 2 nicht, da es eine gerade zahl ist
        // position 0 ist daher 1, welches ich mit 2 ersetze
       primes.set(0,2L);



        return primes;
    }

    /**
     * Funktion um Summe der Primzahlen zu berechnen
     * @param primes ArrayList mit Typ Long welche alle Primzahlen enthält
     * @return  gibt die Summe der Primzahlen als Long zurück
     */
    public long sum(ArrayList<Long> primes){
       Long temp;

        for(int i =0;i<primes.size();i++){
            temp=primes.get(i);
            summ+=temp;
        }


        return summ;
    }
}
