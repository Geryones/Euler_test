package prob17;

/**
 * Created by mai714 on 09.01.2015.
 */
public class Number {
    private String number;
    private String[] little = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen",
            "fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    private String[] zehner={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety",};

    private String hundred= "hundred";
    private String thousend= "thousend";
    private String and = "and";
    private int zehn, eins,hundert;



    public String numberString(int zahl){
        if(zahl<20){
           // System.out.println("i was here 2");
            number=little[zahl];
        }
        else if (zahl==1000){
            //System.out.println("i was here");
            number=little[1]+" "+thousend;

        }
        else if(zahl%10==0&&zahl<100){

            number=zehner[(zahl/10)-2];


        }
        else if (zahl%100==0&&zahl<1000){
            number=little[zahl/100]+" "+hundred;

        }
        else if (zahl<100){
            eins=zahl%10;
            zehn=zahl-eins;
            number=zehner[(zehn/10)-2]+" "+little[eins];

        }
       else if (zahl%100<20){
            eins=zahl%100;

            hundert=(zahl-eins)/100;

            number=little[hundert]+" "+hundred+" "+and+" "+little[eins];

        }
        else if (zahl%10==0){
            zehn=(zahl%100)/10;
            hundert=(zahl-zehn)/100;
            number=little[hundert]+" "+hundred+" "+and+" "+zehner[zehn-2];
        }
        else
        {
            eins=zahl%10;
            zehn=((zahl-eins)%100)/10;
            hundert=(zahl-eins-(zehn*10))/100;
            number=little[hundert]+" "+hundred+" "+and+" "+zehner[zehn-2]+little[eins];
        }


        return number;
    }

}
