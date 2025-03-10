package com.example.supportingdocuments.repository;

import com.example.supportingdocuments.entity.SupportingDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportingDocumentRepository extends JpaRepository<SupportingDocument, Long> {
}
