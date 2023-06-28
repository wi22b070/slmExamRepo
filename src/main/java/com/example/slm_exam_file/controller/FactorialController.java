package com.example.slm_exam_file.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FactorialController {



   @RequestMapping("/api/controller/factorial")
    public int factorial(@RequestParam int number){
        if(number==0){
            return 1;
        }else{
            return number*factorial(number-1);
        }
    }


}
