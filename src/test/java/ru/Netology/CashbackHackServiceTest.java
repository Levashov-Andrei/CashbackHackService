package ru.Netology;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class CashbackHackServiceTest {
    @Test
    public void shouldReturn99Amount901() {
        CashbackHackService service = new CashbackHackService();
        int amount = 901;
        int actual = service.remain(amount);
        int expected = 9;
        assertEquals(actual, expected);
    }
}
