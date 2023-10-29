package com.example.helloworld;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorld{
    
    @GetMapping("/")
    public String helloworld(){
        return "Hello World!";
    }

    @GetMapping("/name")
    public String getName(){
        return "SwapnaVeera";
    }
}