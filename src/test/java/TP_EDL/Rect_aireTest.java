package TP_EDL;

import org.junit.Test;

import static org.junit.Assert.*;

public class Rect_aireTest {

    @Test
    public void aire() {
        int a = 10;
        int b = 5;
        int vrai_aire = a*b;
        Rect_aire airerect = new Rect_aire(a,b);
        assertEquals(airerect.aire(),vrai_aire);
    }
}