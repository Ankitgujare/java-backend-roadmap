package com.example.jobApp;

import com.example.jobApp.service.JobService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

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


    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost, HttpServletRequest request){
        System.out.println("HandleForm Is Called");
        jobService.addJob(jobPost);
        System.out.println(request.getParameter("requiredExp"));
        System.out.println(request.getParameter("reqExperience"));

        System.out.println(Arrays.toString(request.getParameterValues("techStack")));
        System.out.println(Arrays.toString(request.getParameterValues("postTechStack")));

        System.out.println(jobPost);
        return "success";
    }



    @GetMapping("viewalljobs")
    public String viewAllJobs(Model model){
        List<JobPost>jobs=jobService.getAllJobs();
        model.addAttribute("jobs",jobs);
        return "viewalljobs";
    }
}
