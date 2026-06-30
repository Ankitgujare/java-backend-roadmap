<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="com.example.jobApp.JobPost" %>

<%
    List<JobPost> jobs = (List<JobPost>) request.getAttribute("jobs");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>All Job Posts</title>

    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
            rel="stylesheet">

    <style>
        body{
            background-color:#f8f9fa;
        }

        .card{
            margin-bottom:20px;
            border-radius:10px;
        }

        ul{
            margin-bottom:0;
        }
    </style>

</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-warning">
    <div class="container">

        <a class="navbar-brand fs-3 fw-bold" href="home">
            Telusko Job Portal
        </a>

        <button class="navbar-toggler"
                type="button"
                data-bs-toggle="collapse"
                data-bs-target="#navbarNav">

            <span class="navbar-toggler-icon"></span>

        </button>

        <div class="collapse navbar-collapse" id="navbarNav">

            <ul class="navbar-nav ms-auto">

                <li class="nav-item">
                    <a class="nav-link" href="home">Home</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link active" href="viewalljobs">All Jobs</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="addjob">Add Job</a>
                </li>

            </ul>

        </div>

    </div>
</nav>

<div class="container mt-5">

    <h2 class="text-center mb-4">Available Job Posts</h2>

    <%
        if(jobs != null && !jobs.isEmpty()){

            for(JobPost job : jobs){
    %>

    <div class="card shadow">

        <div class="card-header bg-dark text-white">
            <h4><%= job.getPostProfile() %></h4>
        </div>

        <div class="card-body">

            <p>
                <strong>Post ID :</strong>
                <%= job.getPostId() %>
            </p>

            <p>
                <strong>Description :</strong><br>
                <%= job.getPostDesc() %>
            </p>

            <p>
                <strong>Experience Required :</strong>
                <%= job.getReqExperience() %> Years
            </p>

            <strong>Tech Stack :</strong>

            <ul>

                <%
                    if(job.getPostTechStack()!=null){

                        for(String tech : job.getPostTechStack()){
                %>

                    <li><%= tech %></li>

                <%
                        }

                    }else{
                %>

                    <li>No Tech Stack Available</li>

                <%
                    }
                %>

            </ul>

        </div>

    </div>

    <%
            }

        }else{
    %>

    <div class="alert alert-warning text-center">
        No Job Posts Available.
    </div>

    <%
        }
    %>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>