package com.example.supportingdocuments.repository;

import org.springframework.stereotype.Repository;

import com.example.supportingdocuments.entity.SupportingDocument;

@Repository
public interface SpecificDocumentRepository extends BaseDocumentRepository<SupportingDocument> {
    // Add specific methods here if needed
}
