package ro.digitalnation.Books.Repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
@Entity
@Table(name = "handbooks")
public class Handbook extends Book {
    private String grade;
    private String field;

    protected Handbook(){}

    public Handbook(String isbn, String title, String subtitle, String author, String publisher, LocalDate published, int pages, boolean isAvailable, boolean canBeBorrowed, String grade, String field) {
        super(isbn, title, subtitle, author, publisher, published, pages, isAvailable, canBeBorrowed);
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
