package prob17;

/**
 * Created by mai714 on 12.01.2015.
 */
public class Count {
    private String temp;
    private int count;
    public int counter(String zahl){
        temp = zahl.replaceAll("\\s+", "");


        return temp.length();
    }
}
