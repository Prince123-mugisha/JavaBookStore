package com.BookStore.BookStore.MyBookRepo;

import com.BookStore.BookStore.MyBookEntity.MyBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBookRepo extends JpaRepository<MyBookEntity, Integer> {
}
