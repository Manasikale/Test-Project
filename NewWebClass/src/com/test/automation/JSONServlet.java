package com.test.automation;


import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.google.gson.JsonObject;

import java.io.IOException;

@WebServlet(value = "/simpleServlet")
public class JSONServlet extends  HttpServlet
{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Override	
public void doGet(HttpServletRequest request , HttpServletResponse response)throws ServletException , IOException


{
 
 JsonObject jsonObject = new JsonObject();
 jsonObject.addProperty(" NAME", "MANASI KALE");
 jsonObject.addProperty("Birthdate", "02-03-1996");
 PrintWriter out = response.getWriter();
 out.println(jsonObject);
 }
 public void destroy() 
 {
    // do nothing.
 }
  }














































































































































//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * @author Manasi J. Kale
// *
// */
//@WebServlet(name = "UserServlet", urlPatterns="/UserServlet")
//public class NewWebService extends HttpServlet 
//{
//    /**
//	 * 
//	 */
//private static final long serialVersionUID = 1L;
//private Gson gson = new Gson();
// 
//public NewWebService(String uname, String  bdate)
//    {
//	
//	}
//
//	@Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
//    {
//         
//        NewWebService user = new NewWebService("UserName::--"+"Manasi Kale","BirthDate::-"+"02-03-1996");
//        String userJsonString = this.gson.toJson(user);
// 
//        PrintWriter out = response.getWriter();
//        response.setContentType("application/json");
//        response.setCharacterEncoding("UTF-8");
//        out.print(userJsonString);
//        out.flush();   
//    }
//}