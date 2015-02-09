package prob5;

/**
 * Created by mai714 on 17.12.2014.
 */
public class Multiple {
    public void multiple(int zahl,int teiler){
        boolean check=false;
        int counter = 1;

        do
        {
            if(zahl%counter != 0)
            {
                counter = 1;
                zahl++;
            }
            if(counter==teiler)
            {
                check = true;
                System.out.println(zahl);
            }

            counter++;
        }
        while(!check);
    }

}
