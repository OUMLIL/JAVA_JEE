package com.example.decouverte_spring;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/simple/*", loadOnStartup = 1)
public class SimpleServlet extends HttpServlet   {

    private static final long serialVersionUID = 1L;
    private int cmt = 0;


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        doGet(request,response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String to_print = request.getParameter("texte");
        cmt++;

        out.println("Hello " + to_print + " ! You requested this page " + cmt + " times");
    }
}