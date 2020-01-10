package authormanagement;

import java.util.Date;

public class Author {
    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private boolean distinguished;

    public Author(int id, String firstName, String lastName, String dateOfBirth, boolean distinguished) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.distinguished = distinguished;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isDistinguished() {
        return distinguished;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDistinguished(boolean distinguished) {
        this.distinguished = distinguished;
    }
}
