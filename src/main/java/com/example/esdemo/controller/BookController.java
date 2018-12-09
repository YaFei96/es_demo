package com.example.esdemo.controller;

import com.example.esdemo.dao.BookDao;
import com.example.esdemo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookDao bookDao;


    @GetMapping("/saves")
    public String save() {
        Book book = new Book();
        book.setId("1");
        book.setName("java");
        book.setMessage("面向对象");
        bookDao.save(book);
        return "success";
    }

    @GetMapping("/getBookById")
    public Optional<Book> getBookById(int id) {
        Optional<Book> book = bookDao.findById("1");
        return book;
    }
}
