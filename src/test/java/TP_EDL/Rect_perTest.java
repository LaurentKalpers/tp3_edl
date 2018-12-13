package TP_EDL;

import org.junit.Test;

import static org.junit.Assert.*;

public class Rect_perTest {
    @Test
    public void getCoté1() {
        Rect_per rectper = new Rect_per(-10,20);
        assertNotEquals(rectper.getCoté1(),-10);
        assertEquals(rectper.getCoté1(),0);
    }

    @Test
    public void getCoté2() {
        Rect_per rectper = new Rect_per(10,-50);
        assertNotEquals(rectper.getCoté2(),-50);
        assertEquals(rectper.getCoté2(),0);
    }

    @Test
    public void per() {
        int a=10;
        int b=5;
        int vraiper=2*(a+b);
        Rect_per rectper = new Rect_per(a,b);
        assertEquals(rectper.per(),vraiper);
    }
}

