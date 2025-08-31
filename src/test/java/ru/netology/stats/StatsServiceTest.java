package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class StatsServiceTest {
    @Test
    public int AnswerSales() {
        StatsServiceTest service = new StatsServiceTest();
        int actual = service.AnswerSales();
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertArrayEquals(expected, actual);
        return actual;
    }
}