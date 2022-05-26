import java.util.concurrent.atomic.LongAdder;

public class TaxReport {
    public void addSalesToReport(int[] sales, LongAdder summator) {
        for (int sale : sales) {
            summator.add(sale);
        }
    }
}
