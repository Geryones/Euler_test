package prob1;

/**
 * Created by mai714 on 27.02.2015.
 */
public class Core {
    public static void main(String[] args) {
        int temp=0;
        for (int i =0;i<1000;i++ ){
            if (i%3==0){
                temp+=i;
            }
            else if(i%5==0){
                temp+=i;
            }
        }

        System.out.println(temp);
    }
}
