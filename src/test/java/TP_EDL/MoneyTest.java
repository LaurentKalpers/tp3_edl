package TP_EDL;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyTest {

    /*Money money1 = new Money(200, "EUR");
    Money money2 = new Money(50, "EUR");
    Money money3 = new Money(75, "USD");*/

    @Test
    public void getmAmmount() {
        Money money1 = new Money(200, "EUR");
        Money money2 = new Money(-241, "EUR");

        assertEquals(money1.getmAmmount(),200);
        assertNotEquals(money2.getmAmmount(),-241);
        assertNotEquals(money2.getmAmmount(),50);
    }

    @Test
    public void getmCurrency() {
        Money money1 = new Money(200, "EUR");
        Money money2 = new Money(-241, "EUR");

        assertEquals(money1.getmCurrency(),"EUR");
        assertEquals(money2.getmCurrency(),"EUR");
    }

    @Test
    public void add() {
        Money money1 = new Money(200, "EUR");
        Money money2 = new Money(50, "EUR");
        Money money3 = new Money(75, "USD");
        money1.add(money2);
        assertEquals(money1.getmAmmount(),250);
        money1.add(money3);
        assertNotEquals(money1.getmAmmount(),325);
    }

    @Test
    public void add1() {
        Money money1 = new Money(200, "EUR");
        money1.add(60,"EUR");
        assertEquals(money1.getmAmmount(),260);
        money1.add(60,"USD");
        assertNotEquals(money1.getmAmmount(),320);
        money1.add(-500,"EUR");
        assertEquals(money1.getmAmmount(),0);
    }
}