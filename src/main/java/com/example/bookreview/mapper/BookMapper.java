package com.example.bookreview.mapper;

import com.example.bookreview.dto.BookDTO;
import com.example.bookreview.entity.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDTO toDTO(Book book);
    Book toEntity(BookDTO bookDTO);
}
