package prob27;

import java.math.BigInteger;

/**
 * Created by mai714 on 05.03.2015.
 */
public class Core {

    public static void main(String[] args) {

        long sum = 0l;

        for (double i=2;i<=501;i++){
            long temp = (long) (4*(((i*2)-1)*((i*2)-1))-(6*((i*2)-2)));

            sum+=temp;
        }

        sum++;
        System.out.println(sum);
    }
}
