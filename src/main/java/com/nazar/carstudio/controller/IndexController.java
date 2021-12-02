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
    
    @GetMapping("/checkId/{id}")
    public String getCheckId(@PathVariable Integer  id) {
        return indexService.getCheckId(id);
    }

    @GetMapping("/controlAge")
    public String getControlAge(@RequestParam Integer age, @RequestParam String name) {
        return indexService.getControlAge(age, name);
    }

    @GetMapping("/getCarKlichka/{key}")
    public String getCarKlichka(@PathVariable String key) {
        return indexService.getCarKlichka(key);
    }

    @GetMapping("/getResultArithmeticOperation")
    public String getResultArithmeticOperation(@RequestParam Double num1, @RequestParam Double num2, @RequestParam String operation) {
        return indexService.getResultArithmeticOperation(num1, num2, operation);
    }
}
