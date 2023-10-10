package Q1.prog285bCl;

public class Salesperson {
    private int id;
    private int code;
    private double sales;
    private double comm;

    private void calc() {
        if (code == 5 || code == 8) {
            if (sales <= 5000) {
                comm = sales * 0.075;
            } else {
                comm = 5000 * 0.075 + (sales - 5000) * 0.085;
            }
        } else if (code == 17) {
            if (sales <= 3500) {
                comm = sales * 0.095;
            } else {
                comm = 3500 * 0.095 + (sales - 3500) * 0.12;
            }
        }
    }

    public Salesperson(int i, int cd, double sl) {
        id = i;
        code = cd;
        sales = sl;
        comm = 0.0;
    }

    public void setComm() {
        calc();
    }

    public int getId() {
        return id;
    }
    public int getCode() {
        return code;
    }
    public double getSales() {
        return sales;
    }
    public double getComm() {
        return comm;
    }

    public String toString() {
        return id + "\t" + code + "\t" + sales + "\t" + comm;
    }
}
