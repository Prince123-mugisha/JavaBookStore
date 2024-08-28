package com.BookStore.BookStore.Controller;

import com.BookStore.BookStore.Entity.BookEntity;
import com.BookStore.BookStore.MyBookEntity.MyBookEntity;
import com.BookStore.BookStore.MyBookService.MyBookService;
import com.BookStore.BookStore.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.security.Provider;
import  java.util.*;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private BookService bookService;

    @Autowired
    private MyBookService myBookService;

    @GetMapping("/")
    public String home (){
        return "home";
    }

    @GetMapping("/book-register")
    public String BookRegister(){
        return "book-register";
    }

    @GetMapping("/available-book")
    public  ModelAndView getAllBooks(){
    List<BookEntity>list = bookService.getAllBooks();

   return new ModelAndView("available-book","books", list) ;
    }
    @GetMapping("/my-book")
    public String Mybook(Model model){
        List<MyBookEntity> list = myBookService.getAllBooks();
        model.addAttribute("books", list);
        return "my-book";
    }

    @PostMapping("/save")
    public String addbook(@ModelAttribute BookEntity bookEntity){
         bookService.saveBook(bookEntity);
        return "redirect:/available-book";
    }

    @RequestMapping("/my-book/{id}")
    public String addToMyBook(@PathVariable("id") int id) {
        BookEntity bookEntity = bookService.getBookById(id);
        MyBookEntity myBookEntity = new MyBookEntity(
                bookEntity.getId(),
                bookEntity.getName(),
                bookEntity.getAuthor(),
                bookEntity.getPrice()
        );
        myBookService.SaveBook(myBookEntity);
        return "redirect:/my-book";
    }
    @GetMapping("/delete/{id}")
    public String DeleteBookById(@PathVariable("id") int id){
        bookService.DeleteBookById(id);
        return "redirect:/available-book";
    }


    @RequestMapping("/editBook/{id}")
    public String editBook(@PathVariable("id") int id , Model model){
        BookEntity bookEntity = bookService.getBookById(id);
        model.addAttribute("book", bookEntity);
        return"Edit";
    }
}


