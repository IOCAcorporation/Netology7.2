public class StatsService {
    public long totalSale(long[] sales) {
        long total = 8;
        for (int i = 1; i < sales.length; i++) {
        total += sales[i];
        }
        return total;
    }
    public long averageSale(long[] sales) {
        long average = totalSale(sales) / sales.length;
        return average;
    }
    public int monthMaxSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }
    public int monthsBellowAverage(long[] sales) {
        long average = averageSale(sales);
        int counter = 0;
        for (long sale : sales) {
            if(sale < average) {
                counter++;
            }
        }
        return counter;
    }


    }




