<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.qst.francis.pojo.Info" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <title>ADMIN</title>
        
        <style type="text/css">
            .commen-list{
                list-style: outside none none;
                margin: 20px 0 20px 5px;
            }
            .div-container{
                width: 100%;
                font-size: 10px;
                border: 1px solid #ccc;
            }
            .div-detial-info{
                width: 100%;
                height: 20px;
                padding-top: 10px;
                text-align: center;
                background-color: #ebe6e6;
                
            }
            .div-detial-content{
                width: 100%;
                display:inline-block;
            }
            .float-left{
                float: left;
                width: 50%
            }
            .div-op-info{
                clear: both;
                width: 100%;
            }
            .info{
                font-size: 10px;
                text-align: left;
                padding-left: 43px;
            }
            .table-op-info{
                width: 100%;
                height: 20px;
                padding-bottom: 5px; 
                text-align: center;
                background-color: #ebe6e6;
            }
            .div-foot-info{
                width: 100%;
                height: 300px;
                background-color: #ccc;
            }
            #div-foot{
                background-color: #ccc;
                width: 100%;
                height: 30px;
            }
            .div-foot-table{
                font-size: 10px;
                clear: both;
                width: 80%;
                float: right;
            }
            .div-foot-table tr{
                font-size: 10px;
                width: 30%;
            }
        </style>
    </head>
    <body>
    	<%
    		Info info = (Info)request.getAttribute("infoobj");
    		String info_typename = (String)request.getAttribute("info_typename");
    		String checkurl = "/dsgqxxw/payInfoAction?infoid=" + info.getInfo_id();
    		String deleteurl = "/dsgqxxw/deleteInfoAction?infoid=" + info.getInfo_id();
    		String isdisable = "";
    		String pay_state = "disabled";
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        	if(info.getInfo_pay_state() == 0){
        		pay_state = "未付费";
        	}
        	else{
        		pay_state = "已付费";
        		isdisable = "disabled";
        	}
        	String check_state = ""; 
        	if(info.getInfo_check_state() == 0){
        		check_state = "未审核";
        	}
        	else{
        		check_state = "已审核";
        	}
    	%>
        <div class="div-container">
            <!--    ID值通过jsp更改        -->
            <p>付费设置[ID值：<%=info.getInfo_id() %>]</p>
            <div class="div-detial-info">信息详细内容</div>
            <div class="div-detial-content">
                <div class="float-left">
                    <ul>
                        <li class="commen-list">信息类别： <span name="info1">【${info_typename }】</span></li>
                    </ul>
                    <ul>
                        <li class="commen-list">发布时间： <span name="info2"><%=dateFormat.format(info.getInfo_date()) %></span></li>
                    </ul>
                    <ul>
                        <li class="commen-list">信息标题： <span name="info3"><%=info.getInfo_title() %></span></li>
                    </ul>
                </div>
                <div class="float-left">
                    <ul>
                        <li class="commen-list">付费状态：
                        <span name="info4">★<%=pay_state %></span></li>
                    </ul>
                    <ul>
                        <li class="commen-list">审核状态： <span name="info5">★<%=check_state %> </span></li>
                    </ul>
                </div>
            </div>
            <div class="div-op-info">
                <table class="table-op-info">
                    <tr>
                        <td class="info">信息内容：</td>
                        <td>
                        	<a href=<%=checkurl %>>
                        		<input type="button" id="changehadcost" name="changehadcost" value="√设为付费" <%=isdisable %>>
                        	</a>
                        </td>
                        <td>
                        	<a href=<%=deleteurl %>>
                        		<input type="button" id="changedelete" name="changedelete" value="×删除信息">
                        	</a>
                        </td>
                    </tr>
                </table>
            </div>
            <div class="div-foot-info">
                <div><%=info.getInfo_content() %></div>
            </div><div id="div-foot">
                <table class="div-foot-table">
                    <tr>
                        <td>联系电话:<%=info.getInfo_phone() %></td>
                        <td>联系人:<%=info.getInfo_linkman() %></td>
                        <td>E-mail:<%=info.getInfo_email() %></td>
                    </tr>
                </table>
            </div>
        </div>
    </body>
</html>