package day22_revision_oop;

public class BankingApplicationRunner {

    public static void main(String[] args) {

        BankingApplication savingAccount = new SavingAccount(1000);

        // When we need a variable whose data type is a interface, we should use
        // constructor of its child class

        savingAccount.deposit(350);
        savingAccount.withdraw(100);
        savingAccount.withdraw(2000);
        System.out.println("savingAccount.getBalance()  = " + savingAccount.getBalance());

        BankingApplication checkingAccount = new CheckingAccount(5000);
        checkingAccount.deposit(300);
        checkingAccount.withdraw(500);
        System.out.println("checkingAccount.getBalance() = " + checkingAccount.getBalance());

    }
}
