package wx.persistence.repo;

import org.springframework.data.repository.CrudRepository;

import wx.persistence.model.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}