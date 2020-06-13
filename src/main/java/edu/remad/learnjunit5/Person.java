package edu.remad.learnjunit5;

/**
 * This class is a entity for a person.
 * @author Remy Meier
 */
public class Person {

    /**
     * Standard constructor
     */
    public Person() {}

    /**
     * Creates new instance of Person with first- and last- name.
     * @param firstName The human's first name.
     * @param lastName The human's last name.
     */
    public Person(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private String firstName;
    private String lastName;
}
