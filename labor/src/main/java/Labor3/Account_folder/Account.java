package Labor3.Account_folder;

import java.util.Date;

public class Account {
    // - jel a diagramban private láthatóság, + jel a diagramban public láthatóság
    private int id;
    private double balance;
    private Date dateCreated;
    public static double Rate = 5;

    // public Account(int id, double balance, double Rate, Date dateCreated) {
    //     this.id = id;
    //     this.balance = balance;
    //     this.Rate = Rate;
    //     this.dateCreated = dateCreated;
    // }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double Rate) {
        this.Rate = Rate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
