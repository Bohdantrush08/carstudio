package com.nazar.carstudio.service;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class IndexService {
    
    public String getCheckId(Integer id){

        if (id == 1){
            return "this is 1";
        }
        else if (id == 2 ){
            return "this is 2";
        }
        else return "not 1 and not 2";
    }

    public String getControlAge(Integer age, String name){

        String result;

        if(age > 20){
            result = "Old " + name + " " + age;
        }
        else
            result = "Young " + name + " " + age;
        return result;
    }

    public String getCarKlichka(String key) {
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
            value = map.get("Ziguli");
        }
        return value;
    }

    public String getResultArithmeticOperation(Double num1, Double num2, String operation) {
        Double result = 0d;

        if (operation.equalsIgnoreCase("add")) {
            result = num1 + num2;
        } else if (operation.equalsIgnoreCase("mult")) {
            result = num1 * num2;
        } else if (operation.equalsIgnoreCase("minus")) {
            result = num1 - num2;
        } else if (operation.equalsIgnoreCase("divide")) {
            if (num2 == 0) {
                return "Can't divide by zero";
            }
            result = num1 / num2;
        }
        return result.toString();
    }
}
