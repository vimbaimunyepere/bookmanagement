package zss.co.zw.bookmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import zss.co.zw.bookmanagement.model.Book;
import zss.co.zw.bookmanagement.model.Category;

import java.util.List;

public interface BookRepository extends JpaRepository <Book,Integer>{

    public List<Book> findAll();


    @Query("SELECT u FROM Book u WHERE u.categoryId.categoryId= ?1")


    public List<Book>findAllByCategoryId(Integer category);
}
