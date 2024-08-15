package com.progrank.maven.MavenApp.Class;


import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class First {


//    @RequestMapping("/home")
//    public String hello(){
//        return "Hello";
//    }

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
