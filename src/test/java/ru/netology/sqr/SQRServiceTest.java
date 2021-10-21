package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldMethod() {
        SQRService sqrService= new SQRService();
        int expected = 3;
        int lowerLimit =200;
        int upperLimit = 300;
        int actual = sqrService.method(lowerLimit, upperLimit);
        assertEquals(expected, actual);

        }

}