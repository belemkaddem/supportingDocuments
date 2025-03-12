package com.example.supportingdocuments.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AdditionalDocument extends BaseDocument {
    private String additionalInfo;

    // Lombok will generate getters and setters
}
