<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.qst.francis.pojo.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <title>search answer</title>
        <style>
            .searchAnswer-container{
                width: 90%;
                height: 100%;
                border: 1px solid #fff;
                font-size: 15px;
            }
            #searchAnswer-table{
                width: 100%;
                border-collapse:collapse;
            }
            .one-bg{
                background-color: #fff;
                text-align: center;
            }
            .two-bg{
                background-color: #ccc;
                text-align: center;
            }
            .align-left{
                text-align: left;
            }
            #searchAnswer-table th{
                background-color: #eee;
            }
            .float-left{
                float: left;
            }
            .float-right{
                float: right;
            }
            .td_id{
                font-weight: bold;
            }
            .mouseon{
                color: #f73;
                font-size: 1em;
            }
            .mouseout{
                color: #000;
                font-size: 1em;
            }
            a{
			    color: #000;
			    text-decoration: none;
			}
        </style>
        <script>
            function changeSpan(){
                var all_div=document.getElementsByTagName("span");
                for(i=0; i<all_div.length; i++){
                    all_div[i].onmouseover=function(){
                        this.className="mouseon";
                    }
                    all_div[i].onmouseout=function(){
                        this.className="mouseout";
                    }
                }
            }

            function changeTr(){
            	var all_div=document.getElementsByTagName("tr");
            	for(i=0; i<all_div.length; i++){
    	            if(i % 2 == 0){
    	            	all_div[i].className="two-bg";
    	            }
    	            else{
    	                all_div[i].className="one-bg";
    	            }
            	}
            }
            function change(){
            	changeSpan();
            	changeTr();
            }
        </script>
    </head>
    <body onload="change()">
    	<%
		int nowpage = (Integer)request.getAttribute("queryConditionStart");
		int info_cnt = nowpage * (Integer)request.getAttribute("queryConditionStep") + 1;
		int prepage = nowpage - 1;
		int nextpage = nowpage + 1;
		String basePath = "/dsgqxxw/queryByCondtionAction?";
		String infoStateUrl = (String)request.getAttribute("queryConditionStateUrl");
		String infoPreUrl = basePath + infoStateUrl + "&start=" + prepage;
		String infoNextUrl = basePath + infoStateUrl + "&start=" + nextpage;
		String infoNowUrl = infoStateUrl + "&start=" + nowpage;
		int allcnt = (Integer)request.getAttribute("queryConditionAllCnt");
		int step = (Integer)request.getAttribute("queryConditionStep");
		int finalPage = allcnt / step;
		if(allcnt % step > 0){
			finalPage += 1;
		}
		String infoFinalUrl = basePath + infoStateUrl + "&start=" + finalPage;
    	%>
        <div class="searchAnswer-container">
            <table id="searchAnswer-table" >
                <tr>
                    <th>序号</th>
                    <th>信息类别</th>
                    <th>ID值</th>
                    <th>信息标题</th>
                    <th>发布时间</th>
                    <th>联系人</th>
                    <th>E-mail</th>
                </tr>
                <c:forEach items="${queryConditionList }" var="info">
	                <tr>
	                	<td class="td_id"><%=info_cnt++ %></td>
	                	<td>${info.info_type_name }</td>
	                	<td class="td_id">${info.info_id }</td>
	                	<td>
	                		<a href="/dsgqxxw/queryIdCheckedAction?infoId=${info.info_id }">
	                			<span>${info.info_title }</span>
	                		</a>
	                	</td>
	                	<td><fmt:formatDate value= "${info.info_date }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	                	<td>${info.info_linkman }</td>
	                	<td>${info.info_email }</td>
	                </tr>
                </c:forEach>
            </table>
            <div class="float-left">每页显示：${queryConditionStep }/${queryConditionAllCnt }条记录！当前页：${queryConditionStart + 1}/<%=finalPage %>页</div>
            <div class="float-right">
                <a href=<%=infoPreUrl %> target="content-indexbody-right">上一页</a>
                <a href=<%=infoNextUrl %> target="content-indexbody-right">下一页</a>
                <a href=<%=infoFinalUrl%> target="content-indexbody-right">尾页</a>
            </div>
        </div>
    </body>
</html>