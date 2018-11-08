package com.self.education;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.self.education.model.Book;
import com.self.education.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Configuration
public class GraphQLJavaConfig {

    private final BookService bookService;

    private final RestTemplate http;

    @Autowired
    public GraphQLJavaConfig(BookService bookService, RestTemplate http)
    {
        this.bookService = bookService;
        this.http = http;
    }

    @Bean
    public GraphQLQueryResolver queryResolver()
    {
        return new GraphQLQueryResolver() {
            public List<Book> query()
            {
                return bookService.getAllBook();
            }
        };
    }
}
