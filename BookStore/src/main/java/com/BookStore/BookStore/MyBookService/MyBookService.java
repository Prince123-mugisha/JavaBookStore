package com.BookStore.BookStore.MyBookService;

import com.BookStore.BookStore.Entity.BookEntity;
import com.BookStore.BookStore.MyBookEntity.MyBookEntity;
import com.BookStore.BookStore.MyBookRepo.MyBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookService {
    @Autowired
    private MyBookRepo myBookRepo;

    public void SaveBook(MyBookEntity myBookEntity){
        myBookRepo.save(myBookEntity);
    }

    public List<MyBookEntity> getAllBooks(){
        return myBookRepo.findAll();
    }

    public void deleteById(int id){
        myBookRepo.deleteById(id);
    }


}
