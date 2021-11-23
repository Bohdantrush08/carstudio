package com.nazar.carstudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nazar.carstudio.service.IndexService;


@RestController
public class IndexController {
    
    @Autowired
    private IndexService indexService;
    
    @GetMapping("/index")
    public String getIndex() {
        return "Hello world!";
    }
    
    @GetMapping("/pathVar/{id}")
    public String getWithPathVariable(@PathVariable Integer  id) {
        return indexService.getWithPathVariable(id);
    }

    @GetMapping("/queryParam")
    public String getWithQueryParam(@RequestParam Integer age, @RequestParam String name) {
        String result;
       
        if(age > 20){
            result = "Old " + name + " " + age;
        }
        else
            result = "Young " + name + " " + age;
        
        return result;
    }
    
}
