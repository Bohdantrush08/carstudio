package com.nazar.carstudio.controller;

import com.nazar.carstudio.service.NazarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NazarController {

    @Autowired
    private final NazarService nazarService;

    public NazarController(NazarService nazarService) {
        this.nazarService = nazarService;
    }

    @GetMapping("/users")
    public String getStatus() {
        return "Hello!";
    }

    @GetMapping("/pathVariable/{key}")
    public String getCarKlichka(@PathVariable String key) {
        return nazarService.getCarKlichka(key);
    }

    @GetMapping("/queryPar")
    public String getResultArithmeticOperation(@RequestParam Double num1, @RequestParam Double num2, @RequestParam String operation) {
       return nazarService.getResultArithmeticOperation(num1,num2,operation);
    }
}
