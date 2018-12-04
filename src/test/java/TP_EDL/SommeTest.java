package TP_EDL;

import org.junit.Test;

import static org.junit.Assert.*;

public class SommeTest {

    @Test
    public void addition()
    {
        int a=12;
        int b=5;
        Somme somme = new Somme(a,b);
        int vraisomme = a+b;
        /*if (somme.addition() == 17){
            System.out.println("bon");
        }
        else{
            System.out.println("mauvais");
        }*/

        assertEquals(somme.addition(),vraisomme);
    }
}