package prob22;


import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by mai714 on 14.01.2015.
 */
public class Name {
    // Grossbuchstaben : (int)'A'-64= stelle im alphabet
    //kleinbuchstaben:   (int)'a'-96=Stelle im alphabet
    final static String the_file = "C:\\Users\\mai714\\IdeaProjects\\euler\\src\\prob22\\p022_names.txt";

    private File names = new File(the_file);
    private ArrayList<String> namesSorted = new ArrayList<String>();


    public ArrayList<String> getListOfNames() {


        Scanner scan = null;
        try {
            scan = new Scanner(names);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            ;
        }
        scan.useDelimiter(",");


        while (scan.hasNext()) {
            namesSorted.add(scan.next().replaceAll("\"", ""));
        }

        Collections.sort(namesSorted);
        return namesSorted;


    }


    public BigInteger getSumOfLetters(ArrayList<String>namesSorted){
        char letter;

        BigInteger sumOfLetters=BigInteger.valueOf(0);
        for (int i=0;i<namesSorted.size();i++){
            int tempSumName = 0;
            for (int a=0;a<namesSorted.get(i).length();a++){
                letter=namesSorted.get(i).charAt(a);
                 tempSumName+=(int)letter-64;

            }
            sumOfLetters=sumOfLetters.add(BigInteger.valueOf(tempSumName*(i+1)));
        }

        return sumOfLetters;
    }

}


