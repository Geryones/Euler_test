package prob4;

/**
 * Created by mai714 on 17.12.2014.
 */
public class PalinDrom {

    public void palindrome()


    {
        Integer hit=0;
        String reverse ="p";
        for (int i = 100; i < 1000; i++) {
            for (int a = 100; a < 1000; a++) {
               String number =String.valueOf(  i*a);

                for(int z =number.length()-1;z>=0 ;z--){
                    String single=number.substring(z,z+1);
                    if(reverse.equals("p")){
                        reverse=single;
                    }
                    else
                    reverse =reverse+ single;

                    }



                if(number.equals(reverse)){

                   if(hit<Integer.valueOf(number)){
                       hit=Integer.valueOf(number);
                   }


                }
                reverse="p";


            }
        }
        System.out.println(hit);

    }
}
