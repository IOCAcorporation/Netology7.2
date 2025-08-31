public class StatsService {
    public long totalSale(long[] sales) {
        long total = 0;
        for (int i = 0; i < sales.length; i++) {
        total += sales[i];
        }
return total;

    }
}


