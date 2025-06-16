package com.example.bookreview.service.impl;

import com.example.bookreview.dto.BookDTO;
import com.example.bookreview.entity.Book;
import com.example.bookreview.exception.ResourceNotFoundException;
import com.example.bookreview.mapper.BookMapper;
import com.example.bookreview.repository.BookRepository;
import com.example.bookreview.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepo;
    private final BookMapper mapper;

    @Override
    public BookDTO createBook(BookDTO bookDTO) {
        log.info("Creating book: {}", bookDTO);
        return mapper.toDTO(bookRepo.save(mapper.toEntity(bookDTO)));
    }

    @Override
    public List<BookDTO> getAllBooks() {
        return bookRepo.findAll().stream().map(mapper::toDTO).toList();
    }

    @Override
    public BookDTO getBookById(Long id) {
        Book book = bookRepo.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("Book not found with id " + id));
        return mapper.toDTO(book);
    }

    @Override
    public BookDTO updateBook(Long id, BookDTO bookDTO) {
        Book book = bookRepo.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Book not found with id " + id));
        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        book.setRating(bookDTO.getRating());
        return mapper.toDTO(bookRepo.save(book));
    }

    @Override
    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }
}
