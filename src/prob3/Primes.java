package prob3;

import java.util.ArrayList;

/**
 * Created by mai714 on 08.12.2014.
 */
public class Primes {
    private long count;
    public ArrayList<Long> primes = new ArrayList();
    int counter = 0;
    private long max = 2000000L;
    private boolean isPrime;
    int i=0;

    public void prim() {


        for (count = 1; count < max / 2; count++) {
            if (count % 2 == 1) {
                isPrime = true;
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

       primes.remove(0);



    }




    public void divide(Long zahl,int counter){



        if(primes.get(counter)>(zahl/2)){
            System.out.println(zahl);

        }
        else {
            if (zahl%primes.get(counter) == 0) {

                zahl=zahl/primes.get(counter);
                System.out.println(primes.get(counter));
                divide(zahl, counter);

            } else {

                counter++;
                divide(zahl,counter);
            }
        }

    }
}
