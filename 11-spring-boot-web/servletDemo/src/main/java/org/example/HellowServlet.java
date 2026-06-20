package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HellowServlet  extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("In service");
    }
}
