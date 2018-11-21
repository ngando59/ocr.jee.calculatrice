package com.ocr.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ocr.beans.Calculator;

@SuppressWarnings("serial")
public class Home extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String resultatMessage = "";
		req.setAttribute("resultatMessage", resultatMessage);
		this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int number1 = 0;
		int number2 = 0;
		if(req.getParameter("number1") != "") {
			number1 = Integer.valueOf(req.getParameter("number1"));
		}
		if(req.getParameter("number2") != "") {
			number2 = Integer.valueOf(req.getParameter("number2"));
		}
		char operator = req.getParameter("operator").charAt(0);
		Calculator cal = new Calculator(number1, number2, operator);
		String resultatMessage = "";
		if(cal != null){
			int nb1 = cal.getNumber1();
			int nb2 = cal.getNumber2();
			int result = 0;
			try {
				result = cal.result();
				resultatMessage +=(nb1+" "+cal.getOperator()+" "+nb2+" = "+result);
			} catch (ArithmeticException e){
				resultatMessage +=("<span class=\"red\">Erreur division par 0 !</span>");
			}
		}
		req.setAttribute("resultatMessage", resultatMessage);
		this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(req, resp);
	}
}
