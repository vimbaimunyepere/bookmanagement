package zss.co.zw.bookmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zss.co.zw.bookmanagement.model.Category;
import zss.co.zw.bookmanagement.repository.CategoryRepository;

@RestController
@RequestMapping("/api")
public class CategoryController {
    @Autowired
    CategoryRepository categoryRepository;

    @CrossOrigin
    @RequestMapping(value = "/addcategory", method = RequestMethod.POST)
    public String catadd(@RequestBody Category cat) {

        Category n = new Category();
        n.setCategoryName(cat.getCategoryName());

        categoryRepository.save(n);

        return ("category saved");
    }






}
