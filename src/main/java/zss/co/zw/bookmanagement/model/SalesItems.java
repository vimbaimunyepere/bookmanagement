package zss.co.zw.bookmanagement.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="sales_items")
public class SalesItems implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false,name = "sales_item_id")
    private int salesItemId;

    @JoinColumn(name = "sales_id", referencedColumnName = "sales_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Sales salesId;

    @Column(name = "book_id")
    private int  bookId;

    @Column(name = "price")
    private BigDecimal price;

    public SalesItems() {
    }

    public int getSalesItemId() {
        return salesItemId;
    }

    public void setSalesItemId(int salesItemId) {
        this.salesItemId = salesItemId;
    }

    public Sales getSalesId() {
        return salesId;
    }

    public void setSalesId(Sales salesId) {
        this.salesId = salesId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SalesItems{" +
                "salesItemId=" + salesItemId +
                ", salesId=" + salesId +
                ", bookId=" + bookId +
                ", price=" + price +
                '}';
    }
}
