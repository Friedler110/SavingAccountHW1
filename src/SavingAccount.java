public class SavingAccount {
    private static double AnnualInterestRate;
    private double SavingBalance;


    public SavingAccount(double balance) {
        this.SavingBalance = balance;
    }

    public void CalculateMonthlyInterest() {
        double monthlyInterest = (AnnualInterestRate / 12) * SavingBalance;
        SavingBalance += monthlyInterest;
    }

    public static void ModifyInterestRate(double newRate) {
        AnnualInterestRate = newRate;
    }

    public double getBalance() {
        return SavingBalance;
    }

    public static void setAnnualInterestRate(double rate) {
        AnnualInterestRate = rate;
    }
}
