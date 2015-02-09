package prob17;

import java.util.Scanner;

/**
 * Created by mai714 on 09.01.2015.
 */
public class Core {
    public static void main(String[] args) {

        Number number = new Number();
        Count count= new Count();
        int counter=0;

        for (int i =1;i<=1000;i++){
           counter=counter+ count.counter(number.numberString(i));

        }

        System.out.println(counter);




    }
}
