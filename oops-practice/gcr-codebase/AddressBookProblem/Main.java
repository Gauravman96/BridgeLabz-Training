public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Contact contact1 = new Contact("Gaurav", "Mangal", "gla", "Mathura", "UP", "281406", "96687xxxxx", "gaurav123@gmail.com");
        Contact contact2 = new Contact("Abhay", "pratap", "gla", "Agra", "UP", "281006", "96237xxxxx", "abhay123@gmail.com");
        AddNewContact addContact = new AddNewContact(contact1);

        addContact.addContact();
        addContact.display();

        addContact.editContact("Gaurav", "Mangal", "gla", "Noida", "UP", "210421", "9999xxxxx", "gauravnew@gmail.com");
        addContact.display();
        
        System.out.println("\n--- After Delete (UC4) ---");
        addContact.deleteContact("Gaurav", "Mangal");
        addContact.display();

         // UC5 : Add Multiple Contacts

        System.out.println("\n--- UC5 : Add Multiple Contacts ---");
        UC5_AddMultipleContacts uc5 = new UC5_AddMultipleContacts();
        uc5.addMultipleContacts();

        
        // UC6 : Duplicate Check
        System.out.println("\n--- UC6 : Duplicate Check ---");
        UC6_DuplicateCheck uc6 = new UC6_DuplicateCheck();

        Contact duplicateContact = new Contact(
                "Abhay", "pratap", "gla",
                "Agra", "UP", "281006",
                "96237xxxxx", "abhay123@gmail.com"
        );

        uc6.addContactWithDuplicateCheck( uc5.getContacts(),duplicateContact);
    }
}
