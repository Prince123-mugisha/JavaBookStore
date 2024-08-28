package com.BookStore.BookStore.Service;

import com.BookStore.BookStore.Entity.BookEntity;
import com.BookStore.BookStore.Repository.BookRepo;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {


    private final BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public void saveBook(BookEntity bookEntity) {
        bookRepo.save(bookEntity);
    }


    public List<BookEntity> getAllBooks() {
        return bookRepo.findAll();
    }

    public BookEntity getBookById(int id) {
        return bookRepo.findById(id).get();
    }

    public void DeleteBookById(int id) {
        bookRepo.deleteById(id);
    }


}
