package ro.digitalnation.Books.Service;


import ro.digitalnation.Books.Repository.Book;

import java.util.List;

public interface BookService {
    Book create(Book book);

   Book getBookById(String isbn);

    List<Book> getAll();

    Book update(Book book, String isbn);

    void deleteBookById(String isbn);
}
