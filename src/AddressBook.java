import java.util.ArrayList;

public class AddressBook {
    public static ArrayList<Contact> contactList;

    public AddressBook() {
        contactList = new ArrayList<>();
    }

    // Methods to add, remove, search contacts
    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public void removeContact(Contact contact) {
        contactList.remove(contact);
    }

    public static Contact findContactByName(String searchName) {
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(searchName)) {
                return contact;
            }
        }
        return null; // Contact not found
    }

    // print Address Book
    public void printAddressBook() {
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }


}

