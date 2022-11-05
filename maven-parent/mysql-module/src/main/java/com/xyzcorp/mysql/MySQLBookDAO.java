package com.xyzcorp.mysql;

import com.xyzcorp.entities.Book;
import com.xyzcorp.entities.BookDAO;

public class MySQLBookDAO implements BookDAO {
    @Override
    public Long persistBook(Book book) {
        System.out.printf("Persisted %s to mySQL", book);
        return 10L;
    }
}
