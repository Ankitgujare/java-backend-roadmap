package com.example.springwebdemo.demo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Logger;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Method home is Called for Home");
        return "userinfo";
    }


    @RequestMapping("/result")
    public ModelAndView result(@RequestParam("num1") int num, @RequestParam("num2") int num2, ModelAndView mv){ //todo we can get rid of the (HttpServletRequest request) by Dirrectly Passing the Values In parameter
        int Ans=num+num2;                                        // todo Can we aslo get rid of the HttpsSession Object ->we can use Model which is a part of the mvc
        mv.addObject("ans",Ans);
                                                                 //todo instead of this: model.addAttribute("ans",Ans);
        System.out.println("Method home is Called for result"+ Ans);
        return mv;
    }


    @RequestMapping("/submitUser")
    public ModelAndView userInfo(
            @RequestParam("name") String name,
            @RequestParam("phone") String phone,
            @RequestParam("email") String email,
            ModelAndView mv) {

            System.out.println("Userinfo Is Called");


        Userinfo userinfo=new Userinfo();
        userinfo.setName(name);
        userinfo.setPhone(phone);
        userinfo.setEmail(email);

        mv.addObject("result",userinfo);

        mv.setViewName("result");

        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);

        return mv;
    }







}
