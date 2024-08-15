package com.progrank.maven.MavenApp.Class;


import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class First {


    @RequestMapping("/index")
    public String hello(){
        return "index";
    }

    @RequestMapping("/result")
    public String index(String data,HttpSession session){
        System.out.println("Data:"+data);
        session.setAttribute("value:",data);
        return "result";
    }
}
