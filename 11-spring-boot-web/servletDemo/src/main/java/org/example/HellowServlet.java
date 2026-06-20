package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HellowServlet  extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter write =resp.getWriter();
        resp.setContentType("text/html");
        write.println("<b><h1>Hello from servlet</b><h1>");
        System.out.println("In service");
    }
}
