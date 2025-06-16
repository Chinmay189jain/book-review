package com.example.bookreview.controller;

import com.example.bookreview.dto.BookDTO;
import com.example.bookreview.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
@Validated
public class BookController {

    private final BookService service;

    @PostMapping
    public ResponseEntity<BookDTO> create(@RequestBody @Valid BookDTO bookDTO) {
        return new ResponseEntity<>(service.createBook(bookDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public List<BookDTO> getAll() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public BookDTO get(@PathVariable Long id) {
        return service.getBookById(id);
    }

    @PutMapping("/{id}")
    public BookDTO update(@PathVariable Long id, @RequestBody @Valid BookDTO dto) {
        return service.updateBook(id, dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
}
