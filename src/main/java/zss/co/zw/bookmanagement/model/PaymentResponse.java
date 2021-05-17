package zss.co.zw.bookmanagement.model;

import java.util.Date;

public class PaymentResponse {
    public Date updated;
    public String responseCode;
    public String responseDescription;
    public String reference;
    public String debitReference;

    public PaymentResponse() {
    }

    public PaymentResponse(Date updated, String responseCode, String responseDescription, String reference, String debitReference) {
        this.updated = updated;
        this.responseCode = responseCode;
        this.responseDescription = responseDescription;
        this.reference = reference;
        this.debitReference = debitReference;
    }



    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDebitReference() {
        return debitReference;
    }

    public void setDebitReference(String debitReference) {
        this.debitReference = debitReference;
    }


}
