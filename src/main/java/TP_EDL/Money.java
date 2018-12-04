package TP_EDL;

public class Money {
    private int mAmmount;
    private String mCurrency;

    public Money(int mAmmount, String mCurrency) {
        if(mAmmount>=0) {
            this.mAmmount = mAmmount;
        }
        this.mCurrency = mCurrency;
    }

    public int getmAmmount() {
        return mAmmount;
    }

    public String getmCurrency() {
        return mCurrency;
    }

    public void add(Money m){
        if(m.getmCurrency().equals(mCurrency)){
            mAmmount = m.getmAmmount()+mAmmount;
        }
        else{
            System.out.println("pas la meme currency");
        }
    }

    public void add(int nammount, String currency){
        if(mCurrency.equals(currency)) {
            if(mAmmount+nammount<0){
                mAmmount=0;
            }
            else{
                mAmmount = mAmmount+nammount;
            }
        }
        else{
            System.out.println("pas la meme currency");
        }
    }
}
