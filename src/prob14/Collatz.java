package prob14;

/**
 * Created by mai714 on 08.01.2015.
 */
public class Collatz {
    private int collatz, count=0, maximum=0,temp=0;


    public int collatz(long zahl){

        if(zahl%2==0){
            count++;
            collatz(zahl/2);

        }
        else if (zahl!=1&&zahl%2!=0){
            count++;
            collatz((zahl*3)+1);

        }
        if(zahl==1){
            count++;

            if(count>maximum)
                maximum=count;
            count=0;
        }

        return maximum;
    }

    public void kette(int max){
        for (long i=2;i<=max;i++){

                System.out.println(collatz(i));



        }


    }



}
