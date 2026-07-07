package com.example.springRestProject.service;


import com.example.springRestProject.JobPost;
import com.example.springRestProject.reposatory.JobReposatory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobReposatory jobReposatory;
    public void addJob(JobPost jobPost){
        jobReposatory.addJob(jobPost);
    }

    public List<JobPost>getAllJobs(){
       return jobReposatory.getAllJobs();
    }


    public JobPost getJob(int jobid) {
       return jobReposatory.getJob(jobid);
    }
}
