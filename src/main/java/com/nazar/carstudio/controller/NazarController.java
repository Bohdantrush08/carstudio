package com.nazar.carstudio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class NazarController {

    @GetMapping("/users")
    public String getStatus() {
        return "Hello!";
    }

    @GetMapping("/pathVariable/{key}")
    public String getPathVar(@PathVariable String key) {

        Map<String, String> map = new HashMap<>();
        map.put("BMW", "NOT norm car");
        map.put("Audi", "NORM car");
        map.put("Ziguli", "THE BEST");
        
        String value = "Another car";
        
        if (key.equalsIgnoreCase("BMW")) {
            value = map.get("BMW");
        } else if (key.equalsIgnoreCase("Audi")) {
            value = map.get("Audi");
        } else if (key.equalsIgnoreCase("Ziguli")) {
            value = map.get("Ziguli");;
        }
        return value;
    }

    @GetMapping("/queryPar")
    public String getQueryPar(@RequestParam Double num1, @RequestParam Double num2, @RequestParam String operation) {
        Double result = 0d;
        
        if (operation.equalsIgnoreCase("add")) {
            result = num1 + num2;
        } else if (operation.equalsIgnoreCase("mult")) {
            result = num1 * num2;
        } else if (operation.equalsIgnoreCase("minus")) {
            result = num1 - num2;
        } else if (operation.equalsIgnoreCase("divide")) {
            if (num2 == 0){
                return "Can't divide by zero";
            }
            result = num1 / num2;
        }
        return result.toString();
    }
}
