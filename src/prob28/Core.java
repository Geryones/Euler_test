package prob28;

import java.util.ArrayList;

/**
 * Created by mai714 on 06.03.2015.
 */
public class Core {
    public static void main(String[] args) {
       ArrayList<Double> powerList = new ArrayList<Double>();

        for (int a =2;a<=100;a++){
            for (int b=2;b<=100;b++){
                Double temp = Math.pow(a,b);

                if (powerList.contains(temp)){

                }
                else {
                    powerList.add(temp);
                }

            }
        }

        System.out.println(powerList.size());

    }
}
