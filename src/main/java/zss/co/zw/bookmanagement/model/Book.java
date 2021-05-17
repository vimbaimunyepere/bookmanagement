package zss.co.zw.bookmanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;



@Entity
@Table(name="book")
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false,name = "book_id")
    private int bookId;


    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Category categoryId;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    //@OneToMany(mappedBy = "categoryId")
    //private List<Transaction> transactionList;



    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    //    public Book(int bookId, String title, String description, Number price){
//
//        this.bookId=bookId;
//        this.description=description;
//        this.title=title;
//        this.price=price;
//
//    }
}
