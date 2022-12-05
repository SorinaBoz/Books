package ro.digitalnation.Books.Repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "Foreign Language Book")
public class ForeignLanguageBook extends Book {
 private String language;

    public ForeignLanguageBook(String isbn, String title, String subtitle, String author, String publisher, LocalDate published, int pages, boolean isAvailable, boolean canBeBorrowed, String language) {
        super(isbn, title, subtitle, author, publisher, published, pages, isAvailable, canBeBorrowed);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
