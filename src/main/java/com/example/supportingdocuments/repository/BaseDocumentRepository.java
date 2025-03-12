package com.example.supportingdocuments.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.example.supportingdocuments.entity.BaseDocument;

@NoRepositoryBean
public interface BaseDocumentRepository<T extends BaseDocument> extends JpaRepository<T, Long> {
}