package ro.digitalnation.Books.Repository;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@SecondaryTable(name = "handbooks")
public class Handbook extends Book {
    private String grade;
    private String field;

    protected Handbook(){}

    public Handbook(String isbn, String title, String grade, String field) {
        super(isbn, title);
        this.grade = grade;
        this.field = field;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
