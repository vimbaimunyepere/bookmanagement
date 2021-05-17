package zss.co.zw.bookmanagement.model;




import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;


public class Transaction implements Serializable {

    private String type;
    private String extendedType;
    private BigDecimal amount;


    private OffsetDateTime created;

    private String reference;
    private String narration;
    private AdditionalData additionalData;
    private Card card;

    public Transaction() {
    }

    public Transaction(String type, String extendedType, BigDecimal amount, OffsetDateTime created, String reference, String narration, AdditionalData additionalData, Card card) {
        this.type = type;
        this.extendedType = extendedType;
        this.amount = amount;
        this.created = created;
        this.reference = reference;
        this.narration = narration;
        this.additionalData = additionalData;
        this.card = card;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExtendedType() {
        return extendedType;
    }

    public void setExtendedType(String extendedType) {
        this.extendedType = extendedType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

    public AdditionalData getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(AdditionalData additionalData) {
        this.additionalData = additionalData;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;

    }


    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", extendedType='" + extendedType + '\'' +
                ", amount=" + amount +
                ", created=" + created +
                ", reference='" + reference + '\'' +
                ", narration='" + narration + '\'' +
                ", additionalData=" + additionalData +
                ", card=" + card +
                '}';
    }
}
