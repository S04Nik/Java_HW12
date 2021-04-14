package com.example.HW12;

import com.example.HW12.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Task6", value = "/Task6")
public class Task6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            String name=request.getParameter("name");
            String phone=request.getParameter("phone");
            String age=request.getParameter("age");
            String email=request.getParameter("email");
            String  gender="";
            boolean subscr;
            if(request.getParameter("subscribe")!=null&&request.getParameter("subscribe").equals("on")){
                subscr=true;
            }else
                subscr=false;
            if(request.getParameter("male")!=null&&request.getParameter("male").equals("on")){
                gender="male";
            }else if(request.getParameter("female")!=null&&request.getParameter("female").equals("on")){
                gender="female";
            }else if(request.getParameter("alien")!=null&&request.getParameter("alien").equals("on")){
                gender="alien";
            }else
                throw new Exception("Not right or full info");
            User first=new User(name,phone,age,email,gender,subscr);
            request.setAttribute("user",first);
            request.getRequestDispatcher("task6_2.jsp").forward(request,response);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            request.setAttribute("errorMessage","Wrong data . Please fill form again");
            request.getRequestDispatcher("task6.jsp").forward(request,response);
        }

    }
}
