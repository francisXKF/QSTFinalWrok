package com.qst.francis.action.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qst.francis.dao.UserDao;
import com.qst.francis.impl.UserDaoImpl;
import com.qst.francis.util.StringToInteger;

@WebServlet("/updatePasswordUserAction")
public class UpdatePasswordUserAction extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		PrintWriter out = resp.getWriter();
		UserDao userDao = new UserDaoImpl();
		
		String useridStr = (String)req.getParameter("userid");
		String newpassword = (String)req.getParameter("password");
		Integer userid = new StringToInteger().change(useridStr);
		if(userid == null){
			out.print("<html><head><meta charset='utf-8'><script>function error_fun(){alert(修改错误);}</script></head>"
					+ "<body onload='error_fun()'>修改错误</body></html>");
			resp.sendRedirect("JSP/admin_modify_user.jsp");
			
		}
		else{
			if(userDao.updatePassword(userid, newpassword)){
				out.print("<html><head><meta charset='utf-8'></head><body>修改成功<br>3秒之后跳转</body></html>");
				resp.sendRedirect("JSP/admin.jsp");
			}
			else{
				out.print("<html><head><meta charset='utf-8'></head><body>修改失败，请重新修改<br>3秒之后跳转</body></html>");
				resp.setHeader("Refresh","3;URL=JSP/admin_modify_user.jsp");
			}
		}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
