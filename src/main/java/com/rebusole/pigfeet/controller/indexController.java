package com.rebusole.pigfeet.controller;

import com.rebusole.pigfeet.model.IndexModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class indexController {
    @Value("${rebusole}")
    private String name;


    @RequestMapping("/helloWorld")
    public String index(){
        IndexModel indexModel = new IndexModel();
        return "hello world"+name;
    }
}
