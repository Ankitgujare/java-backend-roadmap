package com.example.springRestProject;

import com.example.springRestProject.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("/")
    public String home() {
        return "Hello";
    }


    @GetMapping("jobs")
    public List<JobPost>getAllJobs(){
        return jobService.getAllJobs();
    }



    @GetMapping("job/{jobid}")
    public JobPost getJob(@PathVariable("jobid") int jobid){
       return jobService.getJob(jobid);
    }

}
