package TP_EDL;

public class Rect_aire {
    int coté1;
    int coté2;

    public Rect_aire(int coté1, int coté2) {
        if(coté1 < 0 ){
            coté1 = 0;
        }
        if(coté2 < 0 ){
            coté2 = 0;
        }

        this.coté1 = coté1;
        this.coté2 = coté2;
    }

    public int aire(){
        return coté1*coté2;
    }
}
