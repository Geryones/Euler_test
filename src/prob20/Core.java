package prob20;

/**
 * Created by mai714 on 13.01.2015.
 */
public class Core {
    public static void main(String[] args) {
        Factorial fac = new Factorial();

        System.out.println(fac.sum(fac.factorial(100)));
    }
}
