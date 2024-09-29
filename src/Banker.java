public class Banker {
    private String firstName;
    private String lastName;
    private String id;
    private String address;
    private String phone;
    private Saver[] clients;

    public Banker(String firstName, String lastName, String id, String address, String phone, Saver[] clients) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Banker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", clients=" + clients.length +
                '}';
    }

    public void print() {

        System.out.println(this);

    }

    public void printClients() {
        if (clients == null || clients.length == 0) {
            System.out.println("No clients to display.");
            return;
        }
        System.out.println("Clients of Banker " + firstName + " " + lastName + ":");
        for (Saver client : clients) {
            client.print();
        }

    }
}
