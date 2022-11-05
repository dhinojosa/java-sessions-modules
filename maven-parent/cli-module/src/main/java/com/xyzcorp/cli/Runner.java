package com.xyzcorp.cli;

import com.xyzcorp.entities.Author;
import com.xyzcorp.entities.Book;
import com.xyzcorp.entities.BookDAO;

import java.util.Collections;
import java.util.ServiceLoader;

public class Runner {
    public static void main(String[] args) {
        ServiceLoader<BookDAO> services =
            ServiceLoader.load(BookDAO.class);
        Author author = new Author("Stephen", "King", "Richard Bachman");
        Book book = new Book("It", Collections.singletonList(author));
        services
            .stream()
            .map(ServiceLoader.Provider::get)
            .forEach(bookDAO -> bookDAO.persistBook(book));
        System.out.println(book);
    }
}
