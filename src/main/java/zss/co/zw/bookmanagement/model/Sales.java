package zss.co.zw.bookmanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.*;

@Entity
@Table(name="sales")
public class Sales implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false,name = "sales_id")
    private int salesId;

    @Column(name = "reference")
    private String reference;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "debit_reference")
    private String debitReference;

    private Card card;


    private AdditionalData additionalData;

    @Column(name = "created")
    private OffsetDateTime created;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(mappedBy = "salesId")
    private List<SalesItems> salesItemsList;

    //private List<SalesItems> salesItemsList = new ArrayList<SalesItems>();

    public Sales() {
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public String getDebitReference() {
        return debitReference;
    }

    public void setDebitReference(String debitReference) {
        this.debitReference = debitReference;
    }



    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public List<SalesItems> getSalesItemsList() {
        return salesItemsList;
    }

    public AdditionalData getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(AdditionalData additionalData) {
        this.additionalData = additionalData;
    }

    public void setSalesItemsList(List<SalesItems> salesItemsList) {
        this.salesItemsList = salesItemsList;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "salesId=" + salesId +
                ", reference='" + reference + '\'' +
                ", amount=" + amount +
                ", debitReference='" + debitReference + '\'' +
                ", card=" + card +
                ", additionalData=" + additionalData +
                ", created=" + created +
                ", salesItemsList=" + salesItemsList +
                '}';
    }
}
