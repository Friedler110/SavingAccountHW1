//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static void PrintBalance(SavingAccount saver1, SavingAccount saver2)
    {
        System.out.println("Current Balances:");
        System.out.println("Saver1: " + saver1.getBalance());
        System.out.println("Saver2: " + saver2.getBalance());

    }
    public static void main(String[] args) {
        SavingAccount account1 = new SavingAccount(5000);
        SavingAccount account2 = new SavingAccount(6000);

        PrintBalance(account1, account2);

        SavingAccount.ModifyInterestRate(0.06);
        account1.CalculateMonthlyInterest();
        account2.CalculateMonthlyInterest();
        PrintBalance(account1, account2);

        SavingAccount.ModifyInterestRate(0.1);
        account1.CalculateMonthlyInterest();
        account2.CalculateMonthlyInterest();
        PrintBalance(account1, account2);

        Saver saver = new Saver("oren","friedler","1234","mazor","0535",new SavingAccount[]{ account1,account2 });

        saver.print();

        Banker banker= new Banker("oren12","friedler21","11234","mazor","05355",new Saver[]{ saver});

        banker.print();

        banker.printClients();
        saver.printAccountsBalance();
    }
}