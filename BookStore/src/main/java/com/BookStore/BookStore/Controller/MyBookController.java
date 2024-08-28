package com.BookStore.BookStore.Controller;

import com.BookStore.BookStore.MyBookService.MyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyBookController {

    @Autowired
    private MyBookService myBookService;

    @RequestMapping("/deleteMy-book/{id}")
    public String deleteById(@PathVariable("id") int id) {
        myBookService.deleteById(id);
        return "redirect:/my-book";
    }
}
