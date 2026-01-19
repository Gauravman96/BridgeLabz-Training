import java.util.*;

public class UC5_AddMultipleContacts {

    List<Contact> contacts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addMultipleContacts() {
        System.out.print("How many contacts you want to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Contact " + (i + 1));

            System.out.print("First Name: ");
            String fn = sc.nextLine();

            System.out.print("Last Name: ");
            String ln = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("City: ");
            String city = sc.nextLine();

            System.out.print("State: ");
            String state = sc.nextLine();

            System.out.print("Zip: ");
            String zip = sc.nextLine();

            System.out.print("Phone: ");
            String phone = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            contacts.add(new Contact(fn, ln, address, city, state, zip, phone, email));
        }
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
