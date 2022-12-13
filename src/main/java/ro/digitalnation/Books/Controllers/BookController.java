package ro.digitalnation.Books.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ro.digitalnation.Books.Repository.Book;
import ro.digitalnation.Books.Repository.BookRepository;
import ro.digitalnation.Books.Service.BookService;
import ro.digitalnation.Books.Service.BookServiceImpl;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public String getAllBooks(Model model) {
        List<Book> books = bookService.getAll();
        model.addAttribute("books", books);
        return "books";
    }

    @RequestMapping("/book/{id}")
    public Book getBook(@PathVariable String id) {
        return bookService.getBookById(id);
    }

        @PostMapping("/addBook")
    public String createBook( Book book){
        bookService.create(book);
        return "bookCreated";
        }

    @RequestMapping(method= RequestMethod.PUT, value="/books/{id}")
    public void updateBook(@RequestBody Book book, @PathVariable String id) {
        bookService.update(book, id);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/books/{id}")
    public void deleteBook(@PathVariable String id) {
        bookService.deleteBookById(id);
    }
    
}
