package com.qst.francis.action.info;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qst.francis.dao.InfoDao;
import com.qst.francis.dao.InfoTypeDao;
import com.qst.francis.impl.InfoDaoImpl;
import com.qst.francis.impl.InfoTypeDaoImpl;
import com.qst.francis.pojo.Info;

@WebServlet("/queryIdInfoAction")
public class QueryIdInfoAction extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		InfoDao infoDao = new InfoDaoImpl();
		Info infoobj = null;
		//js验证传入的id只含数字
		String id = req.getParameter("enterhadcost");
		infoobj = infoDao.queryById(id);
		if(infoobj == null){
			out.print("<html><head><meta charset='utf-8'></head><body>未查询到结果,请重新查询</body></html>");
//			resp.sendRedirect("../JSP/admin.jsp");
		}
		else{
			InfoTypeDao infoTypeDao = new InfoTypeDaoImpl();
			String info_typename = infoTypeDao.queryById(infoobj.getInfo_type_id());
			req.setAttribute("infoobj", infoobj);
			req.setAttribute("info_typename", info_typename);
			req.getRequestDispatcher("JSP/admin_check_info.jsp").forward(req, resp);
		}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
