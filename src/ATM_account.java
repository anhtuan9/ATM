import java.util.Date;

public class ATM_account {
    private int id;
    private double balance;
    private double annualinterestRate;
    private Date dateCreated;

    public ATM_account() {
        this.id = 0;
        this.balance = 0;
        this.annualinterestRate = 0;
        this.dateCreated = null;
    }

    public ATM_account(int id, double balance, double annualinterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualinterestRate = annualinterestRate;
        this.dateCreated = new Date();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getAnnualinterestRate() {
        return annualinterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public void withdraw(double money) {
        this.balance = this.balance - money;
    }

    public void deposit(double money) {
        this.balance = this.balance + money;
    }
}
