package prob8;

/**
 * Created by mai714 on 17.12.2014.
 */
public class Multiplier {

    public int maxValue(String[][] file){

        int max=0;
        int temp=1;
        for(int i=0;i<20;i++){
            for(int a=0;a<37;a++){
                for(int z=0;z<14;z++){
                    temp=temp*Integer.valueOf(file[i][a+z]);


                }
                if (temp>max){
                    max=temp;
                }
                temp=1;
            }
        }




        return max;
    }
}

