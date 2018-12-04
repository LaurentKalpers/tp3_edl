package TP_EDL;

public class Rect_aire {
    int coté1;
    int coté2;

    public Rect_aire(int coté1, int coté2) {
        this.coté1 = coté1;
        this.coté2 = coté2;
    }

    public int aire(){
        return coté1*coté2;
    }
}
