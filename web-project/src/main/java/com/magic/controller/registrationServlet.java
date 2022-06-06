package com.magic.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.magic.dao.EmployeesDAO;
import com.magic.dto.EmployeesVO;

@WebServlet("/registration.do")
public class registrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		
		EmployeesDAO eDao = EmployeesDAO.getInstance();
		EmployeesVO eVo = eDao.getMember(userid);
		request.setAttribute("eVo", eVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("employee/employeeRegistration.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "employee/employeeRegistration.jsp";
		request.setCharacterEncoding("UTF-8");
		
		EmployeesVO eVo = new EmployeesVO();
		eVo.setName(request.getParameter("name"));
		eVo.setUserid(request.getParameter("userid"));
		eVo.setPwd(request.getParameter("pwd"));
		eVo.setGender(Integer.parseInt(request.getParameter("gender")));
		eVo.setPhone(request.getParameter("phone"));
		eVo.setAdmin(request.getParameter("admin").charAt(0));
		
		EmployeesDAO eDao=EmployeesDAO.getInstance();
		int result=eDao.insertEmployee(eVo);
		
		if (result == 1) {
			request.setAttribute("user", eVo);
			request.setAttribute("message", "회원 등록에 성공했습니다.");
			url = "employee/joinEmployee.jsp";
		} else if (result == -1) {
			request.setAttribute("message", "회원 등록에 실패했습니다.");
		}
		
		RequestDispatcher dispatcher = request
				.getRequestDispatcher(url);
			dispatcher.forward(request, response);
	}

}
