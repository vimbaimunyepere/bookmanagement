package zss.co.zw.bookmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zss.co.zw.bookmanagement.model.Category;

public interface CategoryRepository extends JpaRepository <Category,Integer>{
}
