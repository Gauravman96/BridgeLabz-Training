import java.util.*;
public class AddNewContact{
    private Contact contact;
    public AddNewContact(Contact contact) {
        this.contact = contact;
    }

    List<Contact> contacts = new ArrayList<>();

    public void addContact() {
        contacts.add(contact);
    }   

    void editContact(String firstName, String lastName, String address, String city, String state, String zip, String newPhoneNumber, String newEmail) {
        for(Contact c : contacts) {
            if(c.firstName.equals(firstName) && c.lastName.equals(lastName)) {
                c.city = city;
                c.phoneNumber = newPhoneNumber;
                c.email = newEmail;
            }
        }
    }

    // UC4: Delete contact by first name and last name
    void deleteContact(String firstName, String lastName) {
    Iterator<Contact> iterator = contacts.iterator();

    while (iterator.hasNext()) {
        Contact c = iterator.next();
        if (c.firstName.equals(firstName) && c.lastName.equals(lastName)) {
            iterator.remove();
            System.out.println("Contact deleted successfully.");
            return;
        }
    }
    System.out.println("Contact not found.");
}

    void display() {
        for(Contact c : contacts) {
            System.out.println("Name: " + c.firstName + " " + c.lastName);
            System.out.println("Address: " + c.address + ", " + c.city + ", " + c.state + ", " + c.zip);
            System.out.println("Phone: " + c.phoneNumber);
            System.out.println("Email: " + c.email);
        }
    }
}