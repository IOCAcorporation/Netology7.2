import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
  public void testAverSale(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.averageSale(sales);
        long expected = 15;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMaxSale(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthMaxSale(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testMonthsBellAver(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthsBellowAverage(sales);
        long expected =5;
        Assertions.assertEquals(expected, actual);

    }
}