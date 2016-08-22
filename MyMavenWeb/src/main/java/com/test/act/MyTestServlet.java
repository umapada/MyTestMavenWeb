package com.test.act;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Servlet implementation class MyTestServlet
 */

public class MyTestServlet extends HttpServlet {
	
	//@Autowired
	//MyBO customer;
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyTestServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");

		MyBO customer = (MyBO) appContext.getBean("myBO");
		
		customer.testing();
		
		PrintWriter out = response.getWriter();
		out.print("<html><body> <h3> Hello from Servlet ... </h3> </body> </html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	public void test(){
		System.out.println(" hello from test");
	}

}
