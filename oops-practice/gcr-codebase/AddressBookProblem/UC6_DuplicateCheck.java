import java.util.*;

public class UC6_DuplicateCheck {

    public void addContactWithDuplicateCheck(List<Contact> contacts, Contact newContact) {

        for (Contact c : contacts) {
            if (c.firstName.equalsIgnoreCase(newContact.firstName)
                    && c.lastName.equalsIgnoreCase(newContact.lastName)) {

                System.out.println("Duplicate contact found. Not added!");
                return;
            }
        }

        contacts.add(newContact);
        System.out.println("Contact added successfully.");
    }
}
