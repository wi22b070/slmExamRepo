package com.example.slm_exam_file.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FactorialController {

    private int currentTotal = 0;


//method for calling calculation method, adjusting current total and returning result
   @RequestMapping("/api/controller/factorial")
    public int factorial(@RequestParam int number){
        int result = calculateFactorial(number);
        this.currentTotal+=result;
        return result;
    }

    //method for calculation factorial of entered number
    public int calculateFactorial(int number){
        if(number==0){
            return 1;
        }else{
            return number*calculateFactorial(number-1);
        }
    }

    //method for returning current total
    @RequestMapping("/api/controller/total")
    public int total(){
     return this.currentTotal;
    }

}
