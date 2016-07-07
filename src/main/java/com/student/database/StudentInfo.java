package com.student.database;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(name = "StudentInfo", urlPatterns = {"/StudentInfo"})
public class StudentInfo extends HttpServlet{
    private static final long serialVersionUID = 1031422249396784970L;
    private List<Student> students = new ArrayList<Student>();


    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        //req.setAttribute("students", students);
        req.getRequestDispatcher("/studentform.jsp").forward(req, resp);


    }

     public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Student st = new Student();
         if(req.getParameter("age") != "" && req.getParameter("name") != "" &&
                 req.getParameter("gender") != "") {
             st.setName(req.getParameter("name"));
             try {
                 st.setAge(Integer.parseInt(req.getParameter("age")));
             } catch (Exception e) {
                 System.out.println("Invalid");
             }

             st.setGender(req.getParameter("gender"));
             students.add(st);
         }
        req.setAttribute("students", students);
        req.getRequestDispatcher("/WEB-INF/student.jsp").forward(req, resp);

    }


}
