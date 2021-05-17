package zss.co.zw.bookmanagement.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;


public class Card implements Serializable {


    private String id;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private Date expiry;

    public Card() {
    }

    public Card(String id, Date expiry) {
        this.id = id;
        this.expiry = expiry;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", expiry=" + expiry +
                '}';
    }
}
