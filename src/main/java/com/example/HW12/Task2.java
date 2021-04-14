package com.example.HW12;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Task2", value = "/Task2")
public class Task2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int n=Integer.parseInt(request.getParameter("numberIn"));
        for (int i=2;i<10;i++){
            response.getWriter().println(n+"X"+i+" = "+(n*i)+" ;");
        }
    }
}
