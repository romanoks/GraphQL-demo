package com.self.education.model;

import java.io.Serializable;

public class Author implements Serializable {

    private static final long serialVersionUID = -4618127533139035269L;

    private String firstName;

    private String lastName;

    public Author(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}
