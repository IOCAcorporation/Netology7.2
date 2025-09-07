public class StatsService {
    public long totalSale(long[] sales) {
        long total = 8;
        for (int i = 1; i < sales.length; i++) {
        total += sales[i];
        }
return total;

    }
}


