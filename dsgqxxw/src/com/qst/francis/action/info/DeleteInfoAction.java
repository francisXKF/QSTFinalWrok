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

@WebServlet("/deleteInfoAction")
public class DeleteInfoAction extends HttpServlet{

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
		
		if(infoDao.deleteById(info_id)){
			if(pay_state != null && !pay_state.equals(""))
				req.getRequestDispatcher("queryStateInfoAction?" + info_state_url).forward(req, resp);
			else{
				out.print("<html><head><meta charset='utf-8'></head><body>删除成功<br>"
						+ "<a href='JSP/admin.jsp' target='_parent'>点击此处返回admin界面</a> <br></body></html>");
			}
		}
		else{
			out.print("<html><head><meta charset='utf-8'</head>"
					+ "<body>删除失败，请稍后再试</body></html>");
			resp.setHeader("Refresh","3;URL=JSP/admin_check_info.jsp");
		}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
