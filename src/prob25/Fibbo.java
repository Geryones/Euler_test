package prob25;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by mai714 on 19.01.2015.
 */
public class Fibbo {


    public  void fib(int length) {
        BigInteger fibbo, temp;
        ArrayList<BigInteger> fibboList = new ArrayList<BigInteger>();
        fibboList.add(BigInteger.valueOf(1));
        fibboList.add(BigInteger.valueOf(1));
        fibbo= BigInteger.valueOf(0);
        int count =2;

        while(fibbo.toString().length()<length){
            fibbo=fibboList.get(1).add(fibboList.get(0));
            temp=fibboList.get(1);
            fibboList.add(0,temp);
            fibboList.add(1,fibbo);
            count++;
        }

        System.out.println("String hat "+length+" überschritten, Element "+count);

    }
}
