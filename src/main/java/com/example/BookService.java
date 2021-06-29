package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BookService {
private static List<Book> list=new ArrayList<>();
 
static
{
    list.add(new Book(12,"java complete","avbv"));
    list.add(new Book(14,"java  is complete","abv"));
    list.add(new Book(16,"java s complete","abc"));
    list.add(new Book(19,"java in complete","atbv"));

}
public List<Book> getAllBook()
{
    return list;
}
 public Book getBookById(int id)
{
    Book book=null;
  book=list.stream().filter(e->e.getId()==id).findFirst().get();
    return book;

}

public Book addBook(Book b)
{
    list.add(b);
    return b;
}

}
