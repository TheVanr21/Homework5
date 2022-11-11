package ru.netology.sqr;

public class SQRService {

    public int sqrCount(int left, int right) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= left && i * i <= right) {
                counter++;
            }
        }
        return counter;
    }
}
