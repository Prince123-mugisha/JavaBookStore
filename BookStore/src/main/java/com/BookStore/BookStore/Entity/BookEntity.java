package com.BookStore.BookStore.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String author;
    private String price;

    public BookEntity(){

    }

    public BookEntity(String name, String author, String price){
        this.name = name;
        this.author = author;
        this.price = price;

    }

}
