package com.qst.francis.action.info;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.naming.java.javaURLContextFactory;

import com.qst.francis.dao.InfoDao;
import com.qst.francis.dao.UserDao;
import com.qst.francis.impl.InfoDaoImpl;
import com.qst.francis.impl.UserDaoImpl;
import com.qst.francis.pojo.Info;
import com.qst.francis.pojo.User;

@WebServlet("/insertInfoAction")
public class InsertInfoAction extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		InfoDao infoDao = new InfoDaoImpl();
		UserDao userDao = new UserDaoImpl();
		
		PrintWriter out = resp.getWriter();
		
		User user = null;
		user = (User)req.getSession().getAttribute("nowuser");
		
		//如果用户在登录后返回原界面，直接提交。。。
		if(user == null){
			out.print("<html><head><meta charset='utf-8'></head><body>请登录后发布信息"
					+ "<a href='JSP/login.jsp' target='_parent'>点击此处登录</a> <br></body></html>");
			
		}
		else{
			Date now_date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			Info info = new Info();
			info.setInfo_type_id(Integer.parseInt(req.getParameter("info_type")));
			info.setInfo_title(req.getParameter("info_title"));
			info.setInfo_user_id(user.getUser_id());
			info.setInfo_phone(req.getParameter("info_phone"));
			info.setInfo_email(req.getParameter("info_email"));
			info.setInfo_date(new java.sql.Timestamp(now_date.getTime()));
			info.setInfo_content(req.getParameter("info_content"));
			info.setInfo_linkman(req.getParameter("info_user"));
			
			if(infoDao.insertInfo(info)){
				out.print("<html><head><meta charset='utf-8'></head><body>信息发布成功，等待审核"
						+ "<a href='JSP/index.jsp' target='_parent'>点击跳转到首页</a><br></body></html>");
			}
			else{
				out.print("<html><head><meta charset='utf-8'><script>history.go(-1);</script></head>"
						+ "<body>信息发布失败，请重新发布，3秒之后跳转到发布页面<br></body></html>");
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
