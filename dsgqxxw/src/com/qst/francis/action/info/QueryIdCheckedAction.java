package com.qst.francis.action.info;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qst.francis.dao.InfoDao;
import com.qst.francis.impl.InfoDaoImpl;
import com.qst.francis.pojo.Info;

//通过id查询已审核的
@WebServlet("/queryIdCheckedAction")
public class QueryIdCheckedAction extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String infoId = (String)req.getParameter("infoId");
		InfoDao infoDao = new InfoDaoImpl();
		Info infoobj = null;
		infoobj = infoDao.queryByIdChecked(infoId);
		if(infoobj == null){
			resp.getWriter().print("<html><head><meta charset='utf-8'></head><body>未查询到结果,请重新查询</body></html>");
		}
		else{
			req.setAttribute("info", infoobj);
			req.getRequestDispatcher("JSP/info_show.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
