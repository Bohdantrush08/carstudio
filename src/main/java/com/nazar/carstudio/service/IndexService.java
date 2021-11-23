package com.nazar.carstudio.service;

import org.springframework.stereotype.Service;

@Service
public class IndexService {
    
    public String getWithPathVariable(Integer id){
        if (id == 1){
            return "this is 1";
        }
        else if (id == 2 ){
            return "this is 2";
        }
        else return "not 1 and not 2";
    }
}
