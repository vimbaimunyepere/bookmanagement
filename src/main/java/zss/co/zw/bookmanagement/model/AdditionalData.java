package zss.co.zw.bookmanagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class AdditionalData implements Serializable {
    @JsonProperty("SampleKey")
    public String SampleKey;

    public AdditionalData() {
    }

    public AdditionalData(String sampleKey) {
        SampleKey = sampleKey;
    }

    public String getSampleKey() {
        return SampleKey;
    }

    public void setSampleKey(String sampleKey) {
        SampleKey = sampleKey;
    }

    @Override
    public String toString() {
        return "AdditionalData{" +
                "SampleKey='" + SampleKey + '\'' +
                '}';
    }
}
