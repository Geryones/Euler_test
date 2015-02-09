package prob8.prob8take2;

/**
 * Created by mai714 on 17.12.2014.
 */
public class Multiplier {

    public Long multi(String raw) {
        Long max = 0L;
        Long temp = 1L;
        Long[] numbers = new Long[1000];

        for (int i = 0; i < 1000; i++) {
            numbers[i] = Long.valueOf(raw.substring(i, i + 1));
        }


        for (int i = 0; i < 987; i++) {
            for (int a = 0; a < 13; a++) {
                temp = temp * numbers[i + a];

                if (temp > max) {
                    max = temp;
                }
            }
            temp = 1L;
        }

        return max;
    }
}
