import java.util.*;

class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

class Contact {
    String name;
    String phoneNumber;

    Contact(String name, String phoneNumber) throws InvalidPhoneNumberException {
        if (!phoneNumber.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Phone number must be exactly 10 digits");
        }
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

class ContactManager {
    List<Contact> contacts = new ArrayList<>();

    // Add contact
    void addContact(Contact newContact) {
        for (Contact c : contacts) {
            if (c.phoneNumber.equals(newContact.phoneNumber)) {
                System.out.println("Duplicate contact not allowed!");
                return;
            }
        }
        contacts.add(newContact);
        System.out.println("Contact added successfully.");
    }

    // Delete contact by phone number
    
      void deleteContact(String phoneNumber){
        Iterator<Contact>itr= contacts.iterator();
        while(itr.hasNext()){
            if(itr.next().phoneNumber.equals(phoneNumber)){
                itr.remove();
                System.out.println("Contact deleted");
                return;
            }
        }
        System.out.println("Contact not found");
      }

    // Search contact
    void searchContact(String keyword) {
        System.out.println("Search Results:");
        for (Contact c : contacts) {
            if (c.name.toLowerCase().contains(keyword.toLowerCase())
                    || c.phoneNumber.contains(keyword)) {
                System.out.println(c.name + " - " + c.phoneNumber);
            }
        }
    }
}

public class ContactOrganizerApp {
    public static void main(String[] args) {
     ContactManager manager = new ContactManager();

        try {
            manager.addContact(new Contact("Amit", "9876543210"));
            manager.addContact(new Contact("Neha", "9876543211"));
            manager.addContact(new Contact("Amit Duplicate", "9876543210")); // duplicate

            manager.searchContact("Amit");
            manager.deleteContact("9876543211");

        } catch (InvalidPhoneNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
