package prob9;

/**
 * Created by mai714 on 22.12.2014.
 */
public class Triplet {
    private int zahl1, zahl2, zahl3,erg;



    public void summe(){
        for(int i =0;i<500;i++){
            for(int a=i;a<500;a++){
                for(int z=a;z<500;z++){
                    zahl1=i;
                    zahl2=a;
                    zahl3=z;
                    if(zahl1+zahl2+zahl3==1000&& zahl1<zahl2&&zahl2<zahl3){
                        if ((zahl1*zahl1)+(zahl2*zahl2)==(zahl3*zahl3)){
                            System.out.println("hmmmm");
                            System.out.println(zahl1);
                            System.out.println(zahl2);
                            System.out.println(zahl3);
                            erg=zahl1*zahl2*zahl3;
                            System.out.println("product: "+erg);

                        }

                    }
                }

            }
        }


    }


}
