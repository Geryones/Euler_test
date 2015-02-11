package prob26;

import java.math.BigDecimal;

/**
 * Created by mai714 on 09.02.2015.
 */
public class Reciprocal {

    public int[] findCycle(int max){
        int sequenceLength=0;
        int[] result = new int[2];

        for (int i = max; i > 1; i--) {
            if (sequenceLength >= i) {
                break;
            }

            int[] foundRemainders = new int[i];
            int value = 1;
            int position = 0;

            while (foundRemainders[value] == 0 && value != 0) {
                foundRemainders[value] = position;
                value *= 10;
                value =value%i;
                position++;
            }

            if (position - foundRemainders[value] > sequenceLength) {
                sequenceLength = position - foundRemainders[value];
               result[0]=sequenceLength;
                result[1]=position;
            }
        }

        return result ;

    }

}
