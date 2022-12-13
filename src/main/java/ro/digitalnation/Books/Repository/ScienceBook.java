package ro.digitalnation.Books.Repository;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@SecondaryTable(name = "ScienceBooks")
public class ScienceBook extends Book {

    private String field;

    protected ScienceBook(){}

    public ScienceBook(String isbn, String title, String field) {
        super(isbn, title);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
