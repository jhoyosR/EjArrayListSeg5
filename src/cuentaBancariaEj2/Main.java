package cuentaBancariaEj2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        int option;
        double amount;
        double monthlyInterest;

        do {
            System.out.println("Banking Operations Menu");
            System.out.println("1. Deposit into Current Account");
            System.out.println("2. Withdraw from Checking Account");
            System.out.println("3. Deposit into Savings Account");
            System.out.println("4. Withdraw from Savings Account");
            System.out.println("5. Invest in CDT");
            System.out.println("6. Close CDT");
            System.out.println("7. Consult Balance Current Account");
            System.out.println("8. Consult Balance Savings Account");
            System.out.println("9. Consult CDT Balance");
            System.out.println("10. Consult Total Balance");
            System.out.println("0. Close");
            System.out.print("Insert the desired option ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the amount to deposit in Current Account: ");
                    amount = scanner.nextDouble();
                    client.depositCurrentAccount(amount);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw in Current Account: ");
                    amount = scanner.nextDouble();
                    client.withdrawCurrentAccount(amount);
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit in Savings Account: ");
                    amount = scanner.nextDouble();
                    client.depositSavingsAccount(amount);
                    break;
                case 4:
                    System.out.print("Enter the amount to withdraw in Savings Account:: ");
                    amount = scanner.nextDouble();
                    client.withdrawSavingsAccount(amount);
                    break;
                case 5:
                    System.out.print("Enter the amount to invest in CDT: ");
                    amount = scanner.nextDouble();
                    System.out.print("Enter the monthly interest of the CDT (%): ");
                    monthlyInterest = scanner.nextDouble();
                    client.investCDT(amount, monthlyInterest);
                    break;
                case 6:
                    client.closeCDT();
                    break;
                case 7:
                    System.out.println("Balance Current Account $" + client.consultBalanceCurrentAccount());
                    break;
                case 8:
                    System.out.println("Balance Savings Account: $" + client.consultBalanceSavingsAccount());
                    break;
                case 9:
                    System.out.println("CDT balance: $" + client.consultBalanceCDT());
                    break;
                case 10:
                    System.out.println("Total balance: $" + client.consultTotalBalance());
                    break;
                case 0:
                    System.out.println("Closing software");
                    break;
                default:
                    System.out.println("Invalid option, try again");
            }
        } while (option != 0);
    }
}
