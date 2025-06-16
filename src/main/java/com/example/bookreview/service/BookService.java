package com.example.bookreview.service;

import com.example.bookreview.dto.BookDTO;

import java.util.List;

public interface BookService {

    BookDTO createBook(BookDTO bookDTO);
    List<BookDTO> getAllBooks();
    BookDTO getBookById(Long id);
    BookDTO updateBook(Long id, BookDTO bookDTO);
    void deleteBook(Long id);
}


