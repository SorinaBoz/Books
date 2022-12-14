package ro.digitalnation.Books.Repository;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "loans")
public class Loan {
@Id
private Long id;

    @ManyToOne
    @JoinColumn(name = "user", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "book", nullable = false)
    private Book book;
    private Date loanDate;
    private Date returnDate;

    protected Loan(){}

    public Loan(Long id, User user, Book book, Date loanDate, Date returnDate) {
        this.id = id;
        this.user = user;
        this.book = book;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
