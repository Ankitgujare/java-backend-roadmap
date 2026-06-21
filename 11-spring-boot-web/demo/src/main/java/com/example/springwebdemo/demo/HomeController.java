package com.example.springwebdemo.demo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Method home is Called for Home");
        return "index.jsp";
    }


    @RequestMapping("/result")
    public String result(HttpServletRequest request, HttpSession session){
       int num1= Integer.parseInt(request.getParameter("num1"));
       int num2= Integer.parseInt(request.getParameter("num2"));
       int sum=num1+num2;
       session.setAttribute("result",sum);
        System.out.println("Ans is "+sum    );
        System.out.println("Method home is Called for result");
        return "result.jsp";
    }



}
