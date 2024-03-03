package cuentaBancariaEj2;

public class Client {
    private double balanceCurrentAccount;
    private double balanceSavingsAccount;
    private double balanceCDT;

    // Constructor
    public Client() {
        balanceCurrentAccount = 0;
        balanceSavingsAccount = 0;
        balanceCDT = 0;
    }

    public void depositCurrentAccount(double amount) {
        balanceCurrentAccount += amount;
    }

    public void withdrawCurrentAccount(double amount) {
        balanceCurrentAccount -= amount;
    }

    public void depositSavingsAccount(double amount) {
        balanceSavingsAccount += amount;
    }

    public void withdrawSavingsAccount(double amount) {
        balanceSavingsAccount -= amount;
    }

    public void investCDT(double amount, double monthlyInterest) {
        balanceCDT += amount;
        double interests = balanceCDT * (monthlyInterest / 100);
        balanceCurrentAccount += interests;
    }

    public void closeCDT() {
        balanceCurrentAccount += balanceCDT;
        balanceCDT = 0;
    }

    public double consultBalanceCurrentAccount() {
        return balanceCurrentAccount;
    }

    public double consultBalanceSavingsAccount() {
        return balanceSavingsAccount;
    }

    public double consultBalanceCDT() {
        return balanceCDT;
    }

    public double consultTotalBalance() {
        return balanceCurrentAccount + balanceSavingsAccount + balanceCDT;
    }
}
