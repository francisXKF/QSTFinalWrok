<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.qst.francis.pojo.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

   	<%
   		User user = (User)session.getAttribute("nowuser");
   		if(user == null){
   			response.sendRedirect("/dsgqxxw/JSP/login.jsp");
   		}
   	%>
    <head>
        <meta charset="utf-8">
        <title>后台付费状态检索</title>
        <link rel="shortcut icon" type="image/x-icon" href="../images/my_logo.gif" />
        <link rel="stylesheet" type="text/css" href="../css/admin.css">
        <script>
            function showdetailinfo(){
                document.getElementById("content-body").src="admin_check_info.html";
            }
            function judgeDigit(){
            	var reg = /^[0-9]+$/;
            	var queryid = document.getElementById("enterhadcost").value;
            	if(!reg.test(queryid)){
            		alert("请输入数字");
            		return false;
            	}
            	return true;
            }
            function judgeDigitOrNull(){
            	var reg = /^[0-9]*$/;
            	var queryid = document.getElementById("enteruserid").value;
            	if(!reg.test(queryid)){
            		alert("请输入数字");
            		return false;
            	}
            	return true;
            }
        </script>
    </head>
    <body>
        <div class="container">
            <!--top-->
            <div class="top">
                <div class="admin-index">
                    <a href="index.jsp"><img src="../images/admin_index.gif"></a>
                </div>
                <div class="admin-exit">
                    <a href="/dsgqxxw/logoffAction"><img src="../images/admin_exit.gif"></a>
                </div>
            </div>
            
            <!--    body        -->
            <div class="div-body">
                <div class="div-body-left">
                    <!--        iframe            -->
                    <iframe id="content-body" name="content_body" src="../html/admin_welcome.html"></iframe>
                </div>
                
                <div class="div-body-right">
                    <ul>
                    	<li>
                    		<p class="li-top-right">用户设置(请输入用户ID)</p>
                            <div class="div-right-top">
                            	<form action="../queryIdUserAction" method="GET" target="content_body" onsubmit="return judgeDigitOrNull()">
	                                <input type="text" name="enteruserid" id="enteruserid" size="16px">
	                                <input type="submit" name="searchuser" id="searchuser" value="查询">
                            	</form>
                            </div>
                    	</li>
                        <li>
                            <p class="li-top-right">显示方式</p>
                            <div class="div-right-top">
	                            <form action="../queryStateInfoAction" method="post" target="content_body">
	                                <fieldset>
	                                    <legend align="left">★付费状态</legend>
	                                    <input type="radio" name="cost" value="0">未付费
	                                    <input type="radio" name="cost" value="1">已付费
	                                    <input type="radio" name="cost" value="-1" checked="checked">全部
	                                </fieldset>
	                                <fieldset>
	                                    <legend align="left">★审核状态</legend>
	                                    <input type="radio" name="check" value="0">未审核
	                                    <input type="radio" name="check" value="1">已审核
	                                    <input type="radio" name="check" value="-1" checked="checked">全部
	                                </fieldset>
	                                <div class="select-jobinfo">
	                                    信息类别：
	                                    <select style="border:1px solid #999" name="selectinfooption">
	                                        <option value="0" selected="selected">&nbsp;</option>
	                                        <option value="1">招聘信息</option>
	                                        <option value="2">培训信息</option>
	                                        <option value="3">求职信息</option>
	                                        <option value="4">家教信息</option>
					                        <option value="5">房屋信息</option>
					                        <option value="6">求购信息</option>
					                        <option value="7">招商引资</option>
					                        <option value="8">公寓信息</option>
					                        <option value="9">车辆信息</option>
					                        <option value="10">出售信息</option>
					                        <option value="11">寻找启示</option>
	                                    </select>
	                                    <input type="submit" value="显示" name="show">
	                                </form>
                                </div>
                            </div>
                        </li>
                        <li>
                            <p class="li-top-right">付费设置</p>
                            <div class="div-right-top">
                            	<form action="../queryIdInfoAction" method="GET" target="content_body" onsubmit="return judgeDigit()">
	                                <p>请输入要设为已付费状态的信息ID：<br></p>
	                                <input type="text" name="enterhadcost" id="enterhadcost" size="16px">
	                                <input type="submit" name="searchcost" id="searchcost" value="查询">
                            	</form>
                            </div>
                        </li>
                        <li>
                            <p class="li-top-right">日历</p>
                            <!--    获取正确时间并显示     -->
                            <iframe id="content-time" name="content-time" src="../html/calender.html"></iframe>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        
    </body>
</html>