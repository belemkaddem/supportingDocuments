package com.example.supportingdocuments.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SupportingDocument extends BaseDocument {
    private String type;
    private byte[] data;
    private String documentType;

    // Lombok will generate getters and setters
}