package prob3;

/**
 * Created by mai714 on 08.12.2014.
 */
public class Core {
    public static void main(String[] args) {
        Long zahl = 600851475143L;

        Primes primes= new Primes();
        primes.prim();

        primes.divide(zahl,0);
        System.out.println(primes.primes.get(10001));
    }
}
