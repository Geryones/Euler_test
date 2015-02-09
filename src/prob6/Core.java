package prob6;

/**
 * Created by mai714 on 17.12.2014.
 */
public class Core {
    public static void main(String[] args) {
        System.out.println(sumsq(100)-sqsum(100));

    }


    public static int sqsum(int max){
        int sum=0;

        for(int i =1;i<max+1;i++){
            sum+=(i*i);
        }

        return sum;
    }

    public static int sumsq(int max){
        int sumsq=0;
        int sum=0;
        for(int i =1;i<max+1;i++){
            sum+=i;
        }
        sumsq=sum*sum;

        return sumsq;
    }
}

