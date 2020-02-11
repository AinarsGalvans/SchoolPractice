import java.util.UUID;

public class Person {
    public String firstName;
    public String lastName;
    public Person(String firstname, String lastName) {
        this.firstName=firstname;
        this.lastName=lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public UUID getUserId() {
        return userId;
    }

    public UUID userId = UUID.randomUUID();
}
