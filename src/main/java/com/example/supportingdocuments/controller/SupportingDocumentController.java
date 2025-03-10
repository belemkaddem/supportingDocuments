package com.example.supportingdocuments.controller;

import com.example.supportingdocuments.entity.SupportingDocument;
import com.example.supportingdocuments.service.SupportingDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/documents")
public class SupportingDocumentController {

    @Autowired
    private SupportingDocumentService service;

    @PostMapping
    public SupportingDocument createDocument(@RequestBody SupportingDocument document) {
        return service.save(document);
    }

    @GetMapping
    public List<SupportingDocument> getAllDocuments() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupportingDocument> getDocumentById(@PathVariable Long id) {
        Optional<SupportingDocument> document = service.findById(id);
        return document.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDocument(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
