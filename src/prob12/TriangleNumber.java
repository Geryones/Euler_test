package prob12;

/**
 * Created by mai714 on 06.01.2015.
 */
public class TriangleNumber {
    private int numb=0;
    private int anz=0;
    private int tria=0;

    public int number(int num){

        for (int i=0;i<=num;i++){
            numb+=i;
        }

        return numb;
    }
    public void triangle(){
        int count=0;
        do{
            count++;
            tria+=count;

        }while (divi(tria)<500);
        System.out.println(tria);



    }
    public int divi(int tria){

        int divide=1;
        int anz=0;
        do {
            if (tria%divide==0){
                anz++;


            }
            divide++;

        }while (divide<tria);
       return anz;
    }



}
