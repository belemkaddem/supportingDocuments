package com.example.supportingdocuments.entity;

import jakarta.persistence.Entity;

@Entity
public class AdditionalDocument extends BaseDocument {
    private String additionalInfo;

    // Getters and setters
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
