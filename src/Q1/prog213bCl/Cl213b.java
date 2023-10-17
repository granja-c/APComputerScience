package Q1.prog213bCl;

public class Cl213b {
    private int myQ;
    private double myPrice;
    private double myAmt;

    public Cl213b(int q) {
        myQ = q;
        myPrice = 0;
        myAmt = 0;
    }

    public void calc() {
        if (myQ > 0 && myQ < 100) myPrice = 5.95;
        else if (myQ >= 100 && myQ < 200) myPrice = 5.75;
        else if (myQ >= 200 && myQ < 300) myPrice = 5.40;
        else if (myQ >= 300) myPrice = 5.15;
        myAmt = myPrice * myQ;
    }

    public String toString(){
        return String.format("Price = $%.2f\tAmount Due = $%.2f", myPrice, myAmt);
    }
}
