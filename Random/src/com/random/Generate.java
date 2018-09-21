package com.random;

import java.io.IOException;
import java.io.PrintWriter;


import java.util.*;

import javax.mail.*;

import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_Continue_Take
 */
@WebServlet("/Rand_num")
public class Generate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Generate() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		// TODO Auto-generated method stub

	}

	/**
	 * @throws IOException
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String s = request.getParameter("textbox3");
		
		out.println(s+"this is your conformation pin...");
		out.print("pls check your mail");
		 try{
			  
			  String host="smtp.gmail.com";
			  String user="vigneshwari.makpo@gmail.com";
			  String pass="Vigneshwari@123";
			  String to="vickysugu99@gmail.com";
			  String from="vigneshwari.makpo@gmail.com";
			  String subject="Task completed";
			  String messageText=s;
			  boolean sessionDebug=false;
			  Properties props = System.getProperties();
			  props.put("mail.smtp.starttls.enable", "true");
			  props.put("mail.smtp.host",host);
			  props.put("mail.smtp.port", "587");
			  props.put("mail.smtp.auth","true");
			  props.put("mail.smtp.starttls.required","true");
			  props.put("mail.smtp.EnableSSL.enable","true");
			  props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
			   props.setProperty("mail.smtp.socketFactory.fallback", "false");   
			    
			  props.setProperty("mail.smtp.socketFactory.port", "465"); 
			  
			  
			 java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
			 Session mailSession = Session.getDefaultInstance(props,null);
			 mailSession.setDebug(sessionDebug); 
			 
			  Message message = new MimeMessage(mailSession);
			  message.setFrom(new InternetAddress(from));
		      InternetAddress[] address = {new InternetAddress(to)};
		           message.setRecipients(Message.RecipientType.TO,address);
		           
		message.setSubject(subject);
		      

		         message.setText(messageText);  
		         
		         Transport transport = mailSession.getTransport("smtp");
		         transport.connect(host,user,pass);
		         transport.sendMessage(message,message.getAllRecipients());
		         transport.close();
		         System.out.println("added successfully");
		  }
		  catch(Exception ex){
			System.out.println(ex);  
		  }
			
		doGet(request, response);
	}
	
}
