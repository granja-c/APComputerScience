package Q2.Prog214bArray;

public class Cl214bA {
    private int en;
    private double ytdpay;
    private double bprate;
    private double shiftcd;
    private double hrs;
    private double gross;
    private double with;
    private double fica;
    private double net;

    public Cl214bA(int e, double y, double b, double s, double h) {
        en = e;
        ytdpay = y;
        bprate = b;
        shiftcd = s;
        hrs = h;
        gross = 0;
        with = 0;
        fica = 0;
        net = 0;
    }

    public void calc(){
        gross = hrs * (bprate * shiftcd);
        if (gross < 100) with = 0;
        else if (gross >= 100 && gross < 150) with = gross * 0.08;
        else if (gross >= 150 && gross < 200) with = gross * 0.12;
        else if (gross >= 200 && gross < 300) with = gross * 0.15;
        else with = gross * 0.175;

        if (ytdpay > 17300) fica = 0;
        else if (ytdpay+gross <= 17300) fica = gross * 0.0605;
        else if (ytdpay < 17300 && ytdpay+gross > 17300) fica = (ytdpay + gross - 17300) * 0.0605;
        net = gross - with - fica;
    }

    public String toString() {
        String str = String.format("Employee number: %d\nHours: %.2f\tRate: %.2f\tShift Factor: %.2f\n" +
                "Gross pay: %.2f\nWithholding: %.2f\nFICA: %.2f\nNet: %.2f\n",
                en, hrs, bprate, shiftcd, gross, with, fica, net);
        return str;
    }

}
