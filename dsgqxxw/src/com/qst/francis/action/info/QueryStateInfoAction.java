package com.qst.francis.action.info;

import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.util.List;

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

//query by pay_state check_state info_type
@WebServlet("/queryStateInfoAction")
public class QueryStateInfoAction extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		InfoDao infoDao = new InfoDaoImpl();
		InfoTypeDao infoTypeDao = new InfoTypeDaoImpl();
		
		String info_state_url = "";
		String pay_state = req.getParameter("cost");
		String check_state = req.getParameter("check");
		String info_type = req.getParameter("selectinfooption");
		String startStr = req.getParameter("start");
		info_state_url = "cost=" + pay_state + "&check=" +check_state + "&selectinfooption=" + info_type;
		
		int start;
		if(startStr == null || startStr.equals("")){
			start = 0;
		}
		else{
			start = Integer.parseInt(startStr);
		}
		
		int step = 10;
		int allcnt = infoDao.queryCnt(pay_state, check_state, info_type);
		start = (allcnt - start * step) > 0 ? start : start - 1;
		if(start < 0){
			start = 0;
		}
		
		List<Info> queryList = infoDao.queryByState(pay_state, check_state, info_type, start * step, step);
		String info_type_name = "全部信息";
		if(info_type != null && !info_type.equals("") && !info_type.equals("0"))
			info_type_name = infoTypeDao.queryById(Integer.parseInt(info_type));
		req.setAttribute("queryInfoStateList", queryList);
		req.setAttribute("infoStateUrl", info_state_url);
		req.setAttribute("start", start);
		req.setAttribute("step", step);
		req.setAttribute("allCnt", allcnt);
		req.setAttribute("infoTypeName", info_type_name);
		req.getRequestDispatcher("JSP/admin_check_list.jsp").forward(req, resp);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
