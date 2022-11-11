package ru.netology.sqr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,200,300",
            "1,9801,9999",
            "1,50,100",
            "0,0,99",
            "0,9802,9902"
    })
    public void testSqrCounter(int expected, int left, int right) {
        SQRService service = new SQRService();

        int actual = service.sqrCount(left, right);

        Assertions.assertEquals(expected, actual);
    }
}
