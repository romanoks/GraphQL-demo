package com.self.education.service;

import com.self.education.model.Author;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class AuthorService {

    public List<Author> getAuthorByIdBook(int idBook)
    {
        List<Author> list = new LinkedList<>();


        list.add(new Author("h"+idBook, "a"+idBook));
        list.add(new Author("b"+idBook, "c"+idBook));

        return list;
    }
}
