package ro.digitalnation.Books.Repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
@Entity
@Table(name = "ScienceBooks")
public class ScienceBook extends Book {

    private String field;

    protected ScienceBook(){}
    public ScienceBook(String isbn, String title, String subtitle, String author, String publisher, LocalDate published, int pages, boolean isAvailable, boolean canBeBorrowed, String field) {
        super(isbn, title, subtitle, author, publisher, published, pages, isAvailable, canBeBorrowed);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
