package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    private CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBuyIf1000(){
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldBuyIfUnder1000(){
        int actual = service.remain(500);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldBuyIfOver1000(){
        int actual = service.remain(1500);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldBuyIf0(){
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }
}