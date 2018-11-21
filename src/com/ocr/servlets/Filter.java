package com.ocr.servlets;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Filter implements javax.servlet.Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		chain.doFilter(request, response) ;
		//request.getServletContext().getRequestDispatcher("/WEB-INF/404.jsp").forward(request, response);
		//RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/404.jsp") ;
		//requestDispatcher.forward(request, response) ;
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
