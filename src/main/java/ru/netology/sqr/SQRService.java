package ru.netology.sqr;

public class SQRService {

    public int methodCheckOfNumbers(int lowerLimit, int upperLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int numberOfSquare = i * i;
            if (numberOfSquare >= lowerLimit && numberOfSquare <= upperLimit) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
