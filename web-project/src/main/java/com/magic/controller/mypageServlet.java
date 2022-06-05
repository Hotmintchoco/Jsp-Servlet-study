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

@WebServlet("/mypage.do")
public class mypageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		
		EmployeesDAO eDao = EmployeesDAO.getInstance();
		EmployeesVO eVo = eDao.getMember(userid);
		request.setAttribute("eVo", eVo);
		
		RequestDispatcher dis = request.getRequestDispatcher("employee/mypage.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String url = "employee/mypage.jsp";
		
		EmployeesVO eVo = new EmployeesVO();
		eVo.setUserid(request.getParameter("userid"));
		eVo.setPwd(request.getParameter("pwd"));
		eVo.setGender(Integer.parseInt(request.getParameter("gender")));
		eVo.setPhone(request.getParameter("phone"));
		eVo.setAdmin((request.getParameter("admin")).charAt(0));
		EmployeesDAO eDao = EmployeesDAO.getInstance();
		int result = eDao.updateEmployee(eVo);
		
		if (result == 1) {
			EmployeesVO mVo = eDao.getMember(eVo.getUserid());
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", mVo);
			request.setAttribute("message", "회원 정보가 수정되었습니다.");
			url="employee/updateComplete.jsp";
		}  else if(result == -1) {
			request.setAttribute("message", "회원 정보 수정에 실패했습니다.");
		}
		
		RequestDispatcher dis = request
				.getRequestDispatcher(url);
		dis.forward(request, response);
	}

}
