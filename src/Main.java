public class Main {
    public static void main(String[] args) {

        AddressBook AddressBook = new AddressBook();

        Contact contact1 = new Contact("Mario", "Rossi", "3331234567", "Gabrielegaita001@gmai.com");
        Contact contact2 = new Contact("Luca", "Rossi", "3331234567", "Gabrielegaita001@gmai.com");
        Contact contact3 = new Contact("Gabriele", "Rossi", "3331234567", "Gabrielegaita001@gmai.com");
        Contact contact4 = new Contact("Marco", "Rossi", "3331234567", "Gabrielegaita001@gmai.com");
        Contact contact5 = new Contact("Francesco", "Rossi", "3331234567", "Gabrielegaita001@gmai.com");
        Contact contact6 = new Contact("Roberto", "Rossi", "3331234567", "Gabrielegaita001@gmai.com");

        // Add contact in Address Book
        AddressBook.addContact(contact1);
        AddressBook.addContact(contact2);
        AddressBook.addContact(contact3);
        AddressBook.addContact(contact4);
        AddressBook.addContact(contact5);
        AddressBook.addContact(contact6);

        //Remove contact
        //AddressBook.removeContact(contact6);

        // Print Address Book
        System.out.println("Address Book List:");
        AddressBook.printAddressBook();

        System.out.println("------------------------------");

        // Search for name in Address Book
        Contact found = AddressBook.findContactByName("Luca");
        if (found != null) {
            System.out.println("Contact found: " + found);
        }else
            System.out.println("Contact not found!");
    }
}

