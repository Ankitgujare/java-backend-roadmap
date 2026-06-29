package com.example.jobApp.service;


import com.example.jobApp.JobPost;
import com.example.jobApp.reposatory.JobReposatory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
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



}
