package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrlServiceTest {
    @Test
    public void TasteCalculate1() {
        FrlService service = new FrlService();
        int actual = service.calculate(10_000, 3000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void TasteCalculate2() {
        FrlService service = new FrlService();
        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected,actual);
    }

}