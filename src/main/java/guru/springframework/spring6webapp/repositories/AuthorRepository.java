package guru.springframework.spring6webapp.repositories;

import guru.springframework.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Anna Ovcharenko
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}