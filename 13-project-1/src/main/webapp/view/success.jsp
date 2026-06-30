<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="com.example.jobApp.JobPost" %>

<%
    JobPost myJobPost = (JobPost) request.getAttribute("jobPost");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Job Posted Successfully</title>

    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
            rel="stylesheet">

    <style>
        body {
            background-color: #f5f5f5;
        }

        .card {
            margin-top: 50px;
            border-radius: 12px;
        }

        .card-header {
            font-size: 24px;
            font-weight: bold;
        }

        ul {
            padding-left: 20px;
        }

        li {
            margin-bottom: 6px;
        }
    </style>

</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-warning">
    <div class="container">

        <a class="navbar-brand text-dark fw-bold" href="home">
            Telusko Job Portal
        </a>

        <div class="navbar-nav ms-auto">
            <a class="nav-link text-dark" href="home">Home</a>
            <a class="nav-link text-dark" href="viewalljobs">All Jobs</a>
            <a class="nav-link text-dark" href="addjob">Add Job</a>
        </div>

    </div>
</nav>

<div class="container">

    <div class="card shadow">

        <div class="card-header bg-dark text-white">
            Job Posted Successfully
        </div>

        <div class="card-body">

            <h3 class="text-primary">
                <%= myJobPost.getPostProfile() %>
            </h3>

            <hr>

            <p>
                <strong>Post ID:</strong>
                <%= myJobPost.getPostId() %>
            </p>

            <p>
                <strong>Job Description:</strong><br>
                <%= myJobPost.getPostDesc() %>
            </p>

            <p>
                <strong>Required Experience:</strong>
                <%= myJobPost.getReqExperience() %> Years
            </p>

            <p>
                <strong>Tech Stack:</strong>
            </p>

            <ul>

                <%
                    if (myJobPost.getPostTechStack() != null) {

                        for (String tech : myJobPost.getPostTechStack()) {
                %>

                <li><%= tech %></li>

                <%
                        }
                    } else {
                %>

                <li>No Tech Stack Selected</li>

                <%
                    }
                %>

            </ul>

        </div>

        <div class="card-footer text-center">

            <a href="addjob" class="btn btn-success">
                Add Another Job
            </a>

            <a href="viewalljobs" class="btn btn-primary">
                View All Jobs
            </a>

        </div>

    </div>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>