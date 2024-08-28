package com.BookStore.BookStore.Repository;
import com.BookStore.BookStore.Entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public interface BookRepo extends JpaRepository <BookEntity, Integer>{
}
