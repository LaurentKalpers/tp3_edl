package TP_EDL;

import org.junit.Test;

import static org.junit.Assert.*;

public class Rect_perTest {

    @Test
    public void per() {
        int a=10;
        int b=5;
        int vraiper=2*(a+b);
        Rect_per rectper = new Rect_per(a,b);
        assertEquals(rectper.per(),vraiper);
    }
}