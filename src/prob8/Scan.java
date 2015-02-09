package prob8;




/**
 * Created by mai714 on 17.12.2014.
 */
public class Scan {

    public String[][] scanner(String raw){
        String[][] strings = new String[20][50];
        for(int i=0;i<20;i++){
            String temp= raw.substring(i*50,(i*50)+50);

            for(int a=0;a<50;a++){
                if(a!=49)
                strings[i][a]=temp.substring(a,a+1);
                else

                    strings[i][a]=temp.substring(a);
            }
        }



        return strings;
    }

}
