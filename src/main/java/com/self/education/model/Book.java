package com.self.education.model;

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable {

    private static final long serialVersionUID = -4596895315290520557L;

    private long id;

    private String name;

    private List<Author> authors;

    public Book(long id, String name, List<Author> authors)
    {
        this.id = id;
        this.name = name;
        this.authors = authors;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Author> getAuthors()
    {
        return authors;
    }

    public void setAuthors(List<Author> authors)
    {
        this.authors = authors;
    }
}
