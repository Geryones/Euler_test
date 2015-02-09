package prob15;

import java.math.BigInteger;

/**
 * Created by mai714 on 09.01.2015.
 */
public class Lattice {
    private BigInteger weg,temp,temp2;

    public BigInteger weg(int kante){
        temp= BigInteger.valueOf(1);
        temp2=BigInteger.valueOf(1);

        for (int i=1;i<=2*kante;i++){
            temp=temp.multiply(BigInteger.valueOf(i));
        }
        for (int i=1;i<=kante;i++){
            temp2=temp2.multiply(BigInteger.valueOf(i));
        }


        weg=temp.divide(temp2.multiply(temp2));

        return weg;
    }
}
