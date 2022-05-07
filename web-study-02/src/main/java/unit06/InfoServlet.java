package unit06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InfoServlet")
public class InfoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=EUC-KR");
		
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("당신이 입력한 정보입니다.<br>");
		out.print("아이디 : ");
		out.print(name);
		out.print("<br> 주소 : ");
		out.print(addr);
		
		out.println("<br><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</body></html>");
		out.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
