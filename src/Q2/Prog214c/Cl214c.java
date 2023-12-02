package Q2.Prog214c;

public class Cl214c {
    private String grade;
    private double gallons;
    private String wash;
    private String type;
    private double ppg;
    private double gasprice;
    private double washprice;
    private double total;
    public Cl214c(String gr, double gal, String w) {
        grade = gr;
        gallons = gal;
        wash = w;
        ppg = 0;
        gasprice = 0;
        washprice = 0;
        total = 0;
    }
    public void calc() {
        if (grade.equals("R")) {
            type = "Regular Unleaded";
            ppg = 1.359;
        } else if (grade.equals("P")) {
            type = "Premium";
            ppg = 1.479;
        } else {
            type = "High Octane";
            ppg = 1.429;
        }
        if (wash.equals("Y")) {
            if (gallons < 20 && gallons > 10) {
                washprice = 2 - ((int)gallons - 10) * 0.1;
            } else if (gallons < 20){
                washprice = 2;
            }
        }
        gasprice = ppg * gallons;
        total = gasprice + washprice;
    }
    public String toString() {
        String str = String.format("COMPSCI PETROLEUM COMPANY\n---------------------------------------\n" +
                        "%s\t%.1f gallons @ $%.3f\nGasoline\t\t\t\t\t%.2f\nWash %s\t\t\t\t\t\t%.2f\nTotal Due\t\t\t\t\t%.2f\n" +
                        "---------------------------------------\n",
                type, gallons, ppg, gasprice, wash, washprice, total);
        return str;
    }
}
