public class Contact {
    // Attributes
    String name;
    String surname;
    String phoneNumber;
    String email;

    // Costructor
    public Contact(String name, String surname, String phoneNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Setter and Getter
    public String getName() {
        return name;
    }

    // Method toString
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
