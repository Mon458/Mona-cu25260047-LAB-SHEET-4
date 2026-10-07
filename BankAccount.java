class BankAccount {
    String accountNumber;
    double balance;
    static String bankName = "ABC Bank";

    void deposit() {
        double amount = 5000;
        balance = balance + amount;

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank: " + bankName);
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount();

        String accNo = "123456789";
        double initialBalance = 10000;

        a.accountNumber = accNo;
        a.balance = initialBalance;

        a.deposit();
    }
}
