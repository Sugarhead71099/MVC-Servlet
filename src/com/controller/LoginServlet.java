package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.LoginDAO;
import com.DAO.LoginDAOImpl;
import com.model.LoginModel;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{

	private static final long serialVersionUID;

	private LoginDAO dao;
	private LoginModel model;

	static
	{
		serialVersionUID = -6338963339384206104L;
	}

    public void init()
    {
    	model = new LoginModel();
    	dao = new LoginDAOImpl(model);
    }

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setContentType("text/html");	
	    PrintWriter out=resp.getWriter();

	    String user=req.getParameter("username");
	    String paswd=req.getParameter("password");

	    dao.saveData(model);
	    
	    req.setAttribute("data", model);
	    RequestDispatcher rd= req.getRequestDispatcher("welcome.jsp");
	    rd.forward(req, resp);
	}

}
