<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.qst.francis.pojo.Info" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <title>admin_modify_user</title>
        <style>
            #container{
                width: 70%;
                text-align: center;
                margin: 50px 0 0 50px;
            }
            table{
                width: 100%;
                text-align: center;
            }
            .error-info{
				color: #f71;
            }
        </style>
        <script>
            function judgeSamePassword(){
                var password1 = document.getElementById("password").value;
                var password2 = document.getElementById("passwordAgain").value;
                if(password1 == "" || password2 == ""){
                    document.getElementById("infoAlert").innerHTML = "密码不可为空";
                    return false;
                }
                if(password1 != password2){
                    document.getElementById("infoAlert").innerHTML = "两次密码不一致";
                    return false;
                }
                return true;
            }
        </script>
    </head>
    <body>
    <%
    	String userid = (String)request.getParameter("userid");
    	String username = (String)request.getParameter("username");
    %>
        <div id="container">
        	<form action="/dsgqxxw/updatePasswordUserAction" method="post" target="_parent" onsubmit="return judgeSamePassword()">
	            <table>
	                <tr>
	                    <td>用户ID</td>
	                    <td><input type="text" name="userid" readonly value="<%=userid %>"></td>
	                </tr>
	                <tr>
	                    <td>用户名</td>
	                    <td><input type="text" name="username" readonly value="<%=username %>"></td>
	                </tr>
	                <tr>
	                    <td>请输入新的用户密码</td>
	                    <td><input type="password" name="password" id="password"></td>
	                </tr>
	                <tr>
	                    <td>请再次确认用户密码</td>
	                    <td><input type="password" name="passwordAgain" id="passwordAgain"></td>
	                </tr>
	               <tr>
	                   <td colspan="2" class="error-info"><div id="infoAlert"></div></td>
	               </tr>
	            </table>
	            <input type="submit" value="提交">
	            <input type="reset" value="重置">
            </form>
        </div>
    </body>
</html>