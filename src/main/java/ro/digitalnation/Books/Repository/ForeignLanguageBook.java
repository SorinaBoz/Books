package ro.digitalnation.Books.Repository;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@SecondaryTable(name = "Foreign Language Book")
public class ForeignLanguageBook extends Book {
 private String language;

    protected ForeignLanguageBook() {
    }

    public ForeignLanguageBook(String isbn, String title, String language) {
        super(isbn, title);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
