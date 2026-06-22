<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result Page</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    #resultContainer {
        background: white;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0,0,0,0.2);
        text-align: center;
        width: 300px;
    }

    #lblTitle {
        font-size: 24px;
        font-weight: bold;
        margin-bottom: 15px;
    }

    #lblResult {
        font-size: 20px;
        color: green;
    }
</style>

</head>
<body>

<div id="resultContainer">
    <div id="lblTitle">Result</div>

    <div id="lblResult">
        ${ans}
    </div>
</div>

</body>
</html>