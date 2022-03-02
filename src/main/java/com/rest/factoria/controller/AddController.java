package com.rest.factoria.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AddController {
    private static Integer totalValue = 1;


    @GetMapping("hello")
    public String Hello(String name, Integer edad){
        return "Soy " + name + " y tengo " +edad+ " años.";
    }
    @GetMapping("total")
    public Integer total (){
        return totalValue;
    }


   @PostMapping("add")
    public Integer add (Integer valueToAdd) {
       return totalValue += valueToAdd;
   }

    @PostMapping("subs")
    public Integer subs (Integer valueToSubs) {
        return totalValue -= valueToSubs;
    }
}