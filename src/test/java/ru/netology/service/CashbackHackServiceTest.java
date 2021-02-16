package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    private CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBuyIf1000() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBuyIfUnder1000() {
        int actual = service.remain(500);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBuyIfOver1000() {
        int actual = service.remain(1500);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBuyIf0() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

}