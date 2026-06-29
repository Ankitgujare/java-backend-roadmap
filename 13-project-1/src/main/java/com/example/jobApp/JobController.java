package com.example.jobApp;

import com.example.jobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JobController {

    @Autowired
    JobService jobService;

    @RequestMapping({"/","home"})
    public String home(){
        System.out.println("home Method is Called");
        return "home";
    }

    @RequestMapping("addjob")
    public String addjob(){
        return "addjob";
    }

    @RequestMapping("viewalljobs")
    public String viewalljobs(){
        System.out.println("You Called View All Jobs");
        return "viewalljobs";
    }


    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        System.out.println("HandleForm Is Called");
        jobService.addJob(jobPost);
        return "success";
    }
}
