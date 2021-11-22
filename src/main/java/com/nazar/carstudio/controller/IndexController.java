package com.nazar.carstudio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {
   
    @GetMapping("/index")
    public String getIndex() {
        return "Hello world!";
    }
    
    @GetMapping("/pathVar/{id}")
    public String getWithPathVariable(@PathVariable Integer  id) {
        if (id == 1){
            return "this is 1";
        }
        else if (id == 2 ){
            return "this is 2";
        }
        else return "not 1 and not 2";
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
