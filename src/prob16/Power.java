package prob16;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by mai714 on 09.01.2015.
 */
public class Power {
    private int sum=0;
    private String stringzahl;
    private ArrayList<String> digits = new ArrayList<String>();
    private BigInteger zahl=BigInteger.valueOf(1);

    public int digitSum(double power){

        for (int i=1;i<=power;i++){
            zahl=zahl.multiply(BigInteger.valueOf(2));
        }


        stringzahl=zahl.toString();
        System.out.println(stringzahl);


        for (int i = 0;i<stringzahl.length();i++){
            digits.add(stringzahl.substring(i,i+1));
            sum=sum+Integer.parseInt(digits.get(i));

        }


        return sum;
    }


}
