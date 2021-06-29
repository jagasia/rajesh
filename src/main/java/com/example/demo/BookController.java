package com.example.demo;

import java.util.List;

import com.example.Book;
import com.example.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//import org.springframework.stereotype.Controller;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class BookController {
//@RequestMapping(value="/book",method=RequestMethod.GET)
/*
@GetMapping("/book")
public Book getBooks()
    {
       Book book=new Book();
       book.setId(1);
       book.setName("the monk who sold the ferrari");
       book.setAuthor("jay shetty");
return book;
*/

BookService bs = new BookService();

@GetMapping("/book")
public List<Book> getBook()
{
return bs.getAllBook();
    }
    @GetMapping("/book/{id}")
    public Book getBooks(@PathVariable("id")int id)
    {
        return bs.getBookById(id);
    }
    @PostMapping(value="book")
    public Book addBook(@RequestBody  Book book) {
        Book b=bs.addBook(book);
        
        return b;
    }
    
}
 
    

