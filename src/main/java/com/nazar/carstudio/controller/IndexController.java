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
    public String getCheckId(@PathVariable Integer  id) {
        return indexService.getCheckId(id);
    }

    @GetMapping("/queryParam")
    public String getControlAge(@RequestParam Integer age, @RequestParam String name) {
        return indexService.getControlAge(age,name);
    }
    
}
