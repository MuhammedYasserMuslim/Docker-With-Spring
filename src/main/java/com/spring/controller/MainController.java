package com.spring.controller;

import com.spring.Model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/main")
public class MainController {
    List<Person> list = new ArrayList<>(Arrays.asList(
            new Person(1L, "Muhammed", 23),
            new Person(2L, "Ali", 29),
            new Person(3L, "Khalid", 30),
            new Person(4L, "Ahmed", 19)
    ));


    @GetMapping("/persons")
    public List<Person> findALl() {
        return list;
    }
}
