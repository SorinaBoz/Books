package ro.digitalnation.Books.Service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.digitalnation.Books.Repository.Book;
import ro.digitalnation.Books.Repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
 @Autowired
    BookRepository bookRepository;
 
    @Override
    public Book create(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(String isbn) {
        Optional<Book> optional = bookRepository.findById(isbn);
        return optional.orElseThrow(() -> new EntityNotFoundException("Book with id " + isbn + " not found"));  }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book update(Book book, String isbn) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBookById(String isbn) {
        bookRepository.deleteById(isbn);
    }
}
