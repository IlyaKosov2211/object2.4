package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldMethodCheckOfNumbers() {
        SQRService sqrService = new SQRService();
        int expected = 5;
        int lowerLimit = 200;
        int upperLimit = 300;
        int actual = sqrService.methodCheckOfNumbers(lowerLimit, upperLimit);
        assertEquals(expected, actual);
    }
    @Test
    public void shouldMethodCheckOfNumbersForExtremeValues(){
        SQRService sqrService = new SQRService();
        int expected = 0;
        int lowerLimit = 10;
        int upperLimit = 99;
        int actual =sqrService.methodCheckOfNumbers(lowerLimit, upperLimit);
        assertEquals(expected, actual);
    }
    @Test
    public void shouldMethodCheckOfNumbersForValueErrors(){
        SQRService sqrService=new SQRService();
        int expected = 0;
        int lowerLimit = 0;
        int upperLimit = 9;
        int actual = sqrService.methodCheckOfNumbers(lowerLimit,upperLimit);
        assertEquals(expected,actual);
    }

}