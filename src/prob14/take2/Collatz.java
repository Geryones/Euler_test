package prob14.take2;

/**
 * Created by mai714 on 08.01.2015.
 */
public class Collatz {
    private int count = 2,  max = 1, temp = 0, chain = 0;
    private long collatz;
    public void collatz(int maximum) {

       // System.out.println("1. do while gestartet");
        do {
            collatz = count;
           // System.out.println("2. do while gestartet");
            do {
                if (collatz % 2 == 0) {
                    temp++;
                    collatz = collatz / 2;
                } else if (collatz != 1) {
                    temp++;
                    collatz = (collatz * 3) + 1;
                }
                if (collatz == 1) {
                    temp++;
                    if (temp>chain){
                        chain=temp;
                        //System.out.println("1 erreicht, kette: "+chain);

                        max=count;
                        //System.out.println("max: "+max);
                    }
                    temp=0;

                }
            } while (collatz != 1);
           // System.out.println("2. dw beendet");
            count++;
            //System.out.println("count erhöht auf :"+count);
        } while (count <= maximum);

        System.out.println("längste kette: " + chain);
        System.out.println("zahl:  " + max);
    }


}
