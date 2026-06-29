package com.example.jobApp.reposatory;


import com.example.jobApp.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobReposatory {

    private ArrayList<JobPost> jobs = new ArrayList<>(
            Arrays.asList(
                    new JobPost(
                            101,
                            "Java Developer",
                            "Develop and maintain Java-based backend applications using Spring Boot and REST APIs.",
                            2,
                            Arrays.asList("Java", "Spring Boot", "Hibernate", "MySQL", "REST API")
                    ),
                    new JobPost(
                            102,
                            "Android Developer",
                            "Build Android applications using Kotlin, Jetpack Compose, MVVM, and Firebase.",
                            1,
                            Arrays.asList("Kotlin", "Jetpack Compose", "MVVM", "Firebase", "Room")
                    ),
                    new JobPost(
                            103,
                            "Frontend Developer",
                            "Develop responsive web applications using React and TypeScript.",
                            3,
                            Arrays.asList("HTML", "CSS", "JavaScript", "React", "TypeScript")
                    ),
                    new JobPost(
                            104,
                            "Full Stack Developer",
                            "Develop end-to-end web applications using Java Spring Boot and React.",
                            4,
                            Arrays.asList("Java", "Spring Boot", "React", "MySQL", "Docker")
                    ),
                    new JobPost(
                            105,
                            "Python Developer",
                            "Build scalable backend services and automation scripts using Python and Django.",
                            2,
                            Arrays.asList("Python", "Django", "PostgreSQL", "REST API", "Git")
                    )
            )
    );




    public List<JobPost>getAllJobs(){
        return jobs;
    }


    public void addJob(JobPost jobPost){
        jobs.add(jobPost);
        System.out.println("Job Added Successfully..");
        System.out.println("List of Available Jobs :: "+jobs);
    }





}
