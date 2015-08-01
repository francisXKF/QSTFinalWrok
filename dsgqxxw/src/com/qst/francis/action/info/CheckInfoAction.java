package com.qst.francis.action.info;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qst.francis.dao.InfoDao;
import com.qst.francis.impl.InfoDaoImpl;

//进行info审核
@WebServlet("/checkInfoAction")
public class CheckInfoAction extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		InfoDao infoDao = new InfoDaoImpl();
		
		String info_id = req.getParameter("infoid");
		String info_state_url = "";
		String pay_state = req.getParameter("cost");
		String check_state = req.getParameter("check");
		String info_type = req.getParameter("selectinfooption");
		String startStr = req.getParameter("start");
		info_state_url = "cost=" + pay_state + "&check=" +check_state + "&selectinfooption=" + info_type;
		
		//req 与 resp 一直在转发
		if(infoDao.checkInfo(info_id)){
			req.getRequestDispatcher("queryStateInfoAction?").forward(req, resp);
		}
		else{
			out.print("<html><head><meta charset='utf-8'</head>"
					+ "<body>审核失败，请重新审核</body></html>");
		}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
}
