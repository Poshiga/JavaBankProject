package com.abc.Controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class RegisterFilter
 */
public class RegisterFilter implements Filter {

    /**
     * Default constructor. 
     */
    public RegisterFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
	          String pass = request.getParameter("password");
	          String conpass = request.getParameter("confirmpassword");
	          if(pass.equals(conpass)==true)
	          {
	        	  chain.doFilter(request, response);
	          }
	          else
	          {
	        	  ((HttpServletResponse) (response)).sendRedirect("/MiniProject/ErrorRegister.jsp");
	          }
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
