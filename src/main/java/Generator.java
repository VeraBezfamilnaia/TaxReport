import java.util.Random;

public class Generator {
    private static final int UPPER_BOUND = 5000;
    private static final int INITIAL_VALUE = 1;
    private static Random random = new Random();

    public static int[] generate(int size) {
        int[] ar = new int[size];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(UPPER_BOUND) + INITIAL_VALUE;
        }
        return ar;
    }
}
