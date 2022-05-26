import java.util.concurrent.atomic.LongAdder;

public class Main {
    private static final int SHOP1_SALES_COUNT = 5;
    private static final int SHOP2_SALES_COUNT = 6;
    private static final int SHOP3_SALES_COUNT = 7;
    private static final int SLEEP_TIME = 5000;

    public static void main(String[] args) throws InterruptedException {
        int[] shop1Sales = Generator.generate(SHOP1_SALES_COUNT);
        int[] shop2Sales = Generator.generate(SHOP2_SALES_COUNT);
        int[] shop3Sales = Generator.generate(SHOP3_SALES_COUNT);

        LongAdder summator = new LongAdder();

        new MyThread(shop1Sales, summator).start();
        new MyThread(shop2Sales, summator).start();
        new MyThread(shop3Sales, summator).start();

        Thread.sleep(SLEEP_TIME);
        System.out.println(summator.sum());
    }
}
