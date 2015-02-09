package prob24;

/**
 * Created by mai714 on 15.01.2015.
 */
public class Core {
    public static void main(String[] args) {
        char[] chars = {'0','1','2','3','4','5','6','7','8','9'};
        Lexicorgraphic lexi = new Lexicorgraphic();
        lexi.permute(9,chars);

        lexi.printIndexList(lexi.sortList(lexi.getComplete()),999999);


    }
}
