package prob20;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by mai714 on 13.01.2015.
 */
public class Factorial {
    private BigInteger fac;
    private int sum;
    private String stringzahl;
    private ArrayList<String> digits = new ArrayList<String>();


    public BigInteger factorial(int max){
        fac= BigInteger.valueOf(max);

        for (int i =max;i>0;i--){
            fac=fac.multiply(BigInteger.valueOf(i));
        }

        return fac;
    }



    public int sum(BigInteger fac){
        stringzahl=fac.toString();
        System.out.println(stringzahl);

        for (int i = 0;i<stringzahl.length();i++){
            digits.add(stringzahl.substring(i,i+1));
            sum=sum+Integer.parseInt(digits.get(i));

        }

        return sum;
    }
}
