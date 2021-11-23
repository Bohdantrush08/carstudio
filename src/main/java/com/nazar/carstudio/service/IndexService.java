package com.nazar.carstudio.service;
import org.springframework.stereotype.Service;

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
}
