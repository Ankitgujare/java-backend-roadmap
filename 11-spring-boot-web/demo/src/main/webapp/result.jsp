<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    String result = "";

    if (request.getParameter("num1") != null &&
        request.getParameter("num2") != null) {

        try {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));

            result = String.valueOf(num1 + num2);

        } catch (Exception e) {
            result = "Invalid Input";
        }
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simple Calculator</title>
</head>
<body>

    <h2>Simple Calculator</h2>

    <form action="add" method="post" id="calculatorForm">

        <label for="txtNum1">Number 1:</label>
        <input
            type="text"
            id="txtNum1"
            name="num1"
            placeholder="Enter first number">

        <br><br>

        <label for="txtNum2">Number 2:</label>
        <input
            type="text"
            id="txtNum2"
            name="num2"
            placeholder="Enter second number">

        <br><br>

        <button
            type="submit"
            id="btnAdd">
            Add
        </button>

    </form>

    <br>

    <h3 id="lblResult">
        Result: <%= result %>
    </h3>

</body>
</html>