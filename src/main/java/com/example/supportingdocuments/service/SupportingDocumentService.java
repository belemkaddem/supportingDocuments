package com.example.supportingdocuments.service;

import com.example.supportingdocuments.entity.BaseDocument;
import com.example.supportingdocuments.repository.BaseDocumentRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(rollbackOn = Exception.class)
public class SupportingDocumentService<T extends BaseDocument> {

    @Autowired
    private BaseDocumentRepository<T> repository;

    public T save(T document) {
        return repository.save(document);
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public Optional<T> findById(Long id) {
        return repository.findById(id);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
