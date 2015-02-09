package prob7;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by mai714 on 17.12.2014.
 */
public class Core {

    public static void main(String[] args) {
        primes(10001);

    }

    public static void primes(int index){

        ArrayList<Long> prime = new ArrayList();
        prime.add(2L);
        boolean check;
        int count=0;


        for(int thenumber =0;count<index+1;thenumber++){
            check=true;

            if(thenumber%2==0){
                thenumber++;
            }
            for(int i=3;i<thenumber/2;i++){
                if (thenumber%i==0){
                    check=false;
                    break;

                }
            }
            if (check){
                prime.add(Long.valueOf(thenumber));
                count++;
            }


        }

        System.out.println(prime.get(index));


    }
}
