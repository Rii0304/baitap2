package demo.com.repository;

import demo.com.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookEntity, Integer> {

    BookEntity findById(int bookID);

}
