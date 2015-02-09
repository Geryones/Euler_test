package prob13;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by mai714 on 08.01.2015.
 */
public class Sum{
    BigInteger theSum=BigInteger.valueOf(0);

    ArrayList<BigInteger> liste= new ArrayList<BigInteger>();




    public ArrayList<BigInteger> scan(String zahl){
        for (int i =0;i<100;i++){
            liste.add(new BigInteger(zahl.substring(i*51,(i*51)+50)));
        }

        return liste;
    }

    public BigInteger sum(ArrayList<BigInteger> liste){
        for (int i=0;i<liste.size();i++){
            theSum=theSum.add(liste.get(i));
        }

        return theSum;
    }



}

