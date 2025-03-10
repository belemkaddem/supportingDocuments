package com.example.supportingdocuments.service;

import com.example.supportingdocuments.entity.SupportingDocument;
import com.example.supportingdocuments.repository.SupportingDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupportingDocumentService {

    @Autowired
    private SupportingDocumentRepository repository;

    public SupportingDocument save(SupportingDocument document) {
        return repository.save(document);
    }

    public List<SupportingDocument> findAll() {
        return repository.findAll();
    }

    public Optional<SupportingDocument> findById(Long id) {
        return repository.findById(id);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
