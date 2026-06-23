<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Information</title>

<style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        font-family: Arial, sans-serif;
    }

    body {
        background-color: #f4f6f9;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .container {
        background-color: white;
        padding: 30px;
        width: 400px;
        border-radius: 10px;
        box-shadow: 0 4px 10px rgba(0,0,0,0.15);
    }

    h2 {
        text-align: center;
        margin-bottom: 20px;
        color: #333;
    }

    .form-group {
        margin-bottom: 15px;
    }

    label {
        display: block;
        margin-bottom: 5px;
        font-weight: bold;
        color: #555;
    }

    input[type="text"],
    input[type="email"],
    input[type="tel"] {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 14px;
    }

    input:focus {
        outline: none;
        border-color: #007bff;
    }

    .btn {
        width: 100%;
        padding: 12px;
        background-color: #007bff;
        color: white;
        border: none;
        border-radius: 5px;
        font-size: 16px;
        cursor: pointer;
    }

    .btn:hover {
        background-color: #0056b3;
    }
</style>

</head>
<body>

<div class="container">
    <h2>User Information</h2>

    <form action="submitUser" method="post">

        <div class="form-group">
            <label for="name">Name</label>
            <input type="text"
                   id="name"
                   name="name"
                   placeholder="Enter your name"
                   required>
        </div>

        <div class="form-group">
            <label for="phone">Phone Number</label>
            <input type="tel"
                   id="phone"
                   name="phone"
                   placeholder="Enter your phone number"
                   required>
        </div>

        <div class="form-group">
            <label for="email">Email ID</label>
            <input type="email"
                   id="email"
                   name="email"
                   placeholder="Enter your email"
                   required>
        </div>

        <button type="submit" class="btn">Submit</button>

    </form>
</div>

</body>
</html>