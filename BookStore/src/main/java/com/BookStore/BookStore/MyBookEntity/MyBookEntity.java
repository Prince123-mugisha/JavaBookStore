package com.BookStore.BookStore.MyBookEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.scheduling.support.SimpleTriggerContext;
@Getter
@Setter
@Entity
@Table(name = "My_book_list")
public class MyBookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String author;
    private String price;

    public MyBookEntity(){

    }
    public MyBookEntity(int id, String name, String author, String price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }
}
