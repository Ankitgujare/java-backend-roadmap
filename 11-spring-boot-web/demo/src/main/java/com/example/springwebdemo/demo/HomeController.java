package com.example.springwebdemo.demo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Method home is Called for Home");
        return "index.jsp";
    }


    @RequestMapping("/result")
    public String result(@RequestParam("num1") int num, @RequestParam("num2") int num2, Model model){ //todo we can get rid of the (HttpServletRequest request) by Dirrectly Passing the Values In parameter
        int Ans=num+num2;                                        // todo Can we aslo get rid of the HttpsSession Object ->we can use Model which is a part of the mvc
        model.addAttribute("ans",Ans);
        System.out.println("Method home is Called for result"+ Ans);
        return "result.jsp";
    }



}
