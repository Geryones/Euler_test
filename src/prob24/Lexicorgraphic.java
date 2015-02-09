package prob24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by mai714 on 15.01.2015.
 */
public class Lexicorgraphic {
    private String combi;
    private ArrayList<String> complete = new ArrayList<String>();

    /**
     * Vertauschen von 2 Stellen
     * @param chars Array mit allen zeichen (0-9)
     * @param one stelle 1 die getauscht wird
     * @param two stelle 2 die getauscht wird
     */
    public void swap(char[] chars, int one, int two) {
        char temp;
        temp = chars[one];
        chars[one] = chars[two];
        chars[two] = temp;

    }

    /**
     * rekursive funktion um alle kombinationen zu haben
     * @param index länge des arrays-1
     * @param zeichen array mit chars drin
     */
    public void permute(int index, char[] zeichen) {
        int temps;
        if (index == 0) {
            for (int b = 0; b < zeichen.length; b++) {
                if (b == 0) {
                    combi = String.valueOf(zeichen[0]);
                } else {
                    combi = combi + zeichen[b];
                }
            }

            complete.add(combi);
        } else {
            for (int i = 0; i <= index; i++) {
                permute(index - 1, zeichen);
                if (index % 2 != 0) {
                    temps = 0;
                } else {
                    temps = i;
                }
                swap(zeichen, temps, index);
            }
        }


    }

    /**
     * Um ein WErt an einem bestimmten index zu drucken
     * @param list
     * @param index
     */
    public void printIndexList(ArrayList<Long> list,int index){
        System.out.println(list.get(index));
    }


    /**
     * Nimmt die Liste mit String und macht eine List mit LONG, die auch sortiert werden kann
     * @param complete
     * @return
     */
    public ArrayList<Long> sortList(ArrayList<String> complete){
        ArrayList<Long> valueList = new ArrayList<Long>();

        for (int i=0;i<complete.size();i++){
            valueList.add(Long.valueOf(complete.get(i)));
        }

        Collections.sort(valueList);
        return valueList;
    }


    public ArrayList<String> getComplete(){
        return complete;
    }
}


