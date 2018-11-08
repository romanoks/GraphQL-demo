package com.self.education.service;

import com.self.education.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private AuthorService authorService;

    public List<Book> getAllBook() {
        List<Book> bookList = new LinkedList<>();

        bookList.add(new Book(1, "klsdkfs", authorService.getAuthorByIdBook(1)));
        bookList.add(new Book(2, "kls", authorService.getAuthorByIdBook(2)));
        bookList.add(new Book(3, "dkfs", authorService.getAuthorByIdBook(3)));

        return bookList;
    }
}
