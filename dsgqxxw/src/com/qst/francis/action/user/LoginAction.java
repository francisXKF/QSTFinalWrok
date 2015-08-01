package com.qst.francis.action.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qst.francis.dao.UserDao;
import com.qst.francis.impl.UserDaoImpl;
import com.qst.francis.pojo.User;

@WebServlet("/loginAction")
public class LoginAction extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		UserDao userDao = new UserDaoImpl();
		
		String adminpath = "JSP/admin.jsp";
		PrintWriter out = resp.getWriter();
		
		if(userDao.login(username, password)){
			List<User> list = userDao.queryByName(username);
			User user = null;
			Iterator<User> it = list.iterator();
			if(it.hasNext()){
				user = it.next();
			}
			req.getSession().setAttribute("nowuser", user);
			
			resp.sendRedirect(adminpath);
		}
		else{
			out.print("<html><head><meta charset='utf-8'></head><body>登录失败，请重新登录<br>3秒之后跳转</body></html>");
			resp.setHeader("Refresh","3;URL=JSP/login.jsp");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
}
