package com.ex;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Register")
public class Register extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String username=req.getParameter("username");
        PrintWriter out=res.getWriter();
        out.print("hello" +username);
	}
}
 