package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class Controller {
    @GetMapping("/api/test")
    public String getString(){
        return "Hola como estas";
    }

}
