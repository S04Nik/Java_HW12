package com.example.HW12;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Task3", value = "/Task3")
public class Task3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //0-100
//        int n=Integer.parseInt(request.getParameter("numberIn"));
        int start=0;
        int finish=100;
            if(request.getParameter("Border")!=null&&request.getParameter("less")!=null&&request.getParameter("less").equals("on"))
            {
                start=Integer.parseInt(request.getParameter("start"));
                finish=Integer.parseInt(request.getParameter("Border"));

            }else if(request.getParameter("Border")!=null&&request.getParameter("more")!=null&&request.getParameter("more").equals("on")){
                    start=Integer.parseInt(request.getParameter("Border"));
                    finish=Integer.parseInt(request.getParameter("finish"));
            } else if(request.getParameter("Border")!=null&&request.getParameter("equal")!=null&&request.getParameter("equal").equals("on")){
                RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
                rd.forward(request,response);
            }
            request.setAttribute("start",start);
            request.setAttribute("finish",finish);
            request.setAttribute("numb",(int)Math.round(Math.random()*(finish-start+1)+start));
            RequestDispatcher rd=request.getRequestDispatcher("/task3_2.jsp");
            rd.forward(request,response);  //forwarded to welcome.jsp


    }
}
