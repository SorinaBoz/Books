package ro.digitalnation.Books.Repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
@Entity
@Table(name = "users")
public class User {
    @Id
    private String CNP;

    private String lastName;
    private String firstName;
    private String phoneNumber;
    private String email;
    private Date libraryCardValidity;
    private final Integer loanLimit = 10;
    private Integer numberOfLoans;

    protected User(){}

    public User(String CNP, String lastName, String firstName, String phoneNumber, String email, Date libraryCardValidity, Integer numberOfLoans) {
        this.CNP = CNP;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.libraryCardValidity = libraryCardValidity;
        this.numberOfLoans = numberOfLoans;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getLibraryCardValidity() {
        return libraryCardValidity;
    }

    public void setLibraryCardValidity(Date libraryCardValidity) {
        this.libraryCardValidity = libraryCardValidity;
    }

    public Integer getLoanLimit() {
        return loanLimit;
    }

    public Integer getNumberOfLoans() {
        return numberOfLoans;
    }

    public void setNumberOfLoans(Integer numberOfLoans) {
        this.numberOfLoans = numberOfLoans;
    }
}
