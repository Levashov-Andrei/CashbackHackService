package ru.Netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    void shouldReturn100Amount900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
    @Test
    void shouldReturn1Amount999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    void shouldReturn999Amount1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 99;
        assertEquals(actual, expected);
    }
}