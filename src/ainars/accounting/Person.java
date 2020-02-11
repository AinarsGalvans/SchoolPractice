package ainars.accounting;

import java.util.UUID;

public class Person {
    private String firstName;
    private String lastName;

    //Crate person
    public Person(String firstname, String lastName) {
        this.firstName=firstname;
        this.lastName=lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    UUID getUserId() {
        return userId;
    }

    private UUID userId = UUID.randomUUID();
}
