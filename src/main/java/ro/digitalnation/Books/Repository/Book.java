package ro.digitalnation.Books.Repository;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "books")
public class Book {
    @Id
    private String isbn;
    private String title;
    private String subtitle;
    private String author;
    private String publisher;
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate published;
    private int pages;
    private String description;
    private boolean isAvailable;
    private boolean canBeBorrowed;

    protected Book(){}

    public Book(String isbn, String title, String subtitle, String author, String publisher, LocalDate published, int pages, boolean isAvailable, boolean canBeBorrowed) {
        this.isbn = isbn;
        this.title = title;
        this.subtitle = subtitle;
        this.author = author;
        this.publisher = publisher;
        this.published = published;
        this.pages = pages;
        this.isAvailable = isAvailable;
        this.canBeBorrowed = canBeBorrowed;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getPublished() {
        return published;
    }

    public void setPublished(LocalDate published) {
        this.published = published;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isCanBeBorrowed() {
        return canBeBorrowed;
    }

    public void setCanBeBorrowed(boolean canBeBorrowed) {
        this.canBeBorrowed = canBeBorrowed;
    }
}
