package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Book;

/**
 * @author Anna Ovcharenko
 */

public interface BookService {

    Iterable<Book> findAll();
}
