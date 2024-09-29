public class Saver {
    private String firstName;
    private String lastName;
    private String id;
    private String address;
    private String phone;
    private SavingAccount[] accounts;

    public Saver(String firstName, String lastName, String id, String address, String phone, SavingAccount[] accounts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.accounts = accounts;
    }

    private double getTotalBalance() {
        double sum =0;

        for (SavingAccount account : accounts) {
            sum += account.getBalance();
        }

        return sum;
    }

    @Override
    public String toString() {
        return "Saver{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", TotalBalance=" + getTotalBalance() +
                '}';
    }

    public void print(){

        System.out.println(this);

    }
    public void printAccountsBalance() {
        System.out.println("Balances of:  " + firstName + " " + lastName + ":");
        for (SavingAccount accounts : accounts) {
            System.out.println(accounts.getBalance());
        }

    }
}
