import java.util.Arrays;
import java.util.concurrent.atomic.LongAdder;

public class MyThread extends Thread {
    private final TaxReport report = new TaxReport();
    private final LongAdder summator;
    private final int[] sales;

    public MyThread(int[] sales, LongAdder summator) {
        this.sales = sales;
        this.summator = summator;
    }

    @Override
    public void run() {
        System.out.println("Продажи текущего магазина: " + Arrays.toString(sales));
        report.addSalesToReport(sales, summator);
    }
}
