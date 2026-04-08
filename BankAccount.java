import java.util.Scanner;

class BankAccount {
    int balance = 0;

    void deposit(int amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(int amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.print("Enter initial balance: ");
        acc.balance = sc.nextInt();

        System.out.println("1.Deposit  2.Withdraw  3.Show Balance");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter amount to deposit: ");
                int d = sc.nextInt();
                acc.deposit(d);
                break;

            case 2:
                System.out.print("Enter amount to withdraw: ");
                int w = sc.nextInt();
                acc.withdraw(w);
                break;

            case 3:
                acc.showBalance();
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}