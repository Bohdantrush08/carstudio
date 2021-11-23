package com.nazar.carstudio.nazarcontroller;

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

        if (key.equalsIgnoreCase("BMW")) {
            key = map.get("BMW");
        } else if (key.equalsIgnoreCase("Audi")) {
            key = map.get("Audi");
        } else if (key.equalsIgnoreCase("Ziguli")) {
            key = map.get("Ziguli");;
        }
        return key;
    }

    @GetMapping("/queryPar")
    public String getQueryPar(@RequestParam Integer num1, @RequestParam Integer num2, @RequestParam String operation) {
        int sum;
        if (operation.equalsIgnoreCase("add")) {
            sum = num1 + num2;
            return "suma " + sum;
        } else if (operation.equalsIgnoreCase("mult")) {
            sum = num1 * num2;
            return "suma " + sum;
        } else if (operation.equalsIgnoreCase("minus")) {
            sum = num1 - num2;
            return "suma " + sum;
        }
        return operation;
    }
}
