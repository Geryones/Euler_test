package prob21;

import java.util.ArrayList;

/**
 * Created by mai714 on 14.01.2015.
 */
public class AmicableTwo
{


    /**
     * Summe aller Amicable-Zahlen bis und mit max
     * @param max obergrenze für zahlen die durchsucht werden sollen
     * @return summe aller gefundenen amicablen zahlen
     */
    public static int getAmicableList(int max)
    {
        ArrayList<Integer> _amicableList = new ArrayList<Integer>();
        for (int i=0;i<=max;i++)
        {
            if (_amicableList.contains(i))
            {
                System.out.println("zahl "+i+" bereits vorhanden");
            }
            else
            {
                if (isAmicableNum(i))
                {
                    System.out.println("Zahl gefunden : "+i);
                    _amicableList.add(i);
                }
            }
        }

        return getSumOfList(_amicableList);
    }

    /**
     * überprüft eine zahl ob si eine amicable zahl ist
     * @param currentNum zu überprüfende Zahl
     * @return true or false
     */

    private static boolean isAmicableNum(int currentNum)
    {
        ArrayList<Integer> _tempAmicableList = new ArrayList<Integer>();

        int pos_one =getPosOfSumList(_tempAmicableList,currentNum);
       // _tempAmicableList.clear();

        int pos_two = getPosOfSumList(_tempAmicableList,pos_one);
       // _tempAmicableList.clear();

        return currentNum==pos_two && pos_one!=currentNum;
    }

    /**
     * Rechnet die Summe von allen zahlen in einer List aus
     * @param numberList Liste mit Zahlen
     * @return summe der Zahlen
     */
    private static int getSumOfList(ArrayList<Integer> numberList)
    {
        int sum=0;
        for(int num : numberList)
        {
            sum+=num;
        }
        numberList.clear();
        return sum;
    }

    private static int getPosOfSumList(ArrayList<Integer> teilerAmicableList, int currentNum){

        for(int i=1; i<=currentNum/2; i++)
        {
            if (currentNum%i==0) {
                teilerAmicableList.add(i);
              //  System.out.println("Teiler: " + i);
            }
        }

        return getSumOfList(teilerAmicableList);
    }
}

