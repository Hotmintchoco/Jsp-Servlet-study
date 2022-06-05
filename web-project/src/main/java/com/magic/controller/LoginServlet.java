package com.magic.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.magic.dao.EmployeesDAO;
import com.magic.dto.EmployeesVO;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "employee/login.jsp";
		
		HttpSession session=request.getSession();
		
		if(session.getAttribute("loginUser") != null)
			url="main.jsp";
		RequestDispatcher dispatcher = request.
				getRequestDispatcher(url);
		
		dispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "employee/login.jsp";
		
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		
		EmployeesDAO eDao = EmployeesDAO.getInstance();
		int result = eDao.userCheck(userid, pwd);
		
		if (result == 1) {
			EmployeesVO eVo = eDao.getMember(userid);
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", eVo);
			url="main.jsp";
		} else if(result == 0) {
			request.setAttribute("message", "비밀번호가 맞지 않습니다.");
		} else if(result == -1) {
			request.setAttribute("message", "존재하지 않는 회원입니다.");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
