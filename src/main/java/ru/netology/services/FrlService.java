package ru.netology.services;

public class FrlService {
    public int calculate(int income, int expense, int threshold) {
        int counter = 0;
        int money = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money -= expense;
                money /= 3;
                counter++;
            } else {
                money += income;
                money -= expense;
            }
        }
        return counter;
    }
}