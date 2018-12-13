package TP_EDL;

public class Rect_per {
    int coté1;
    int coté2;

    public int getCoté1() {
        return coté1;
    }

    public int getCoté2() {
        return coté2;
    }

    public Rect_per(int coté1, int coté2) {
        if(coté1 < 0){coté1 = 0; }
        if(coté2 < 0){coté2 = 0; }
        this.coté1 = coté1;
        this.coté2 = coté2;

    }

    public int per(){
        return (coté1+coté2)*2;
    }
}

