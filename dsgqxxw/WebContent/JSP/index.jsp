<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.qst.francis.pojo.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <title>Index</title>
        <link rel="shortcut icon" type="image/x-icon" href="../images/my_logo.gif" />
        <link rel="stylesheet" type="text/css" href="../css/index.css">
        <script>
            function change_jobinfo(){
                document.getElementById("content-indexbody-right").src="jobinfo.html";
            }
            function change_index(){
                document.getElementById("content-indexbody-right").src="recommendInfo.jsp";
            }
            function change_searchAnswer(){
                document.getElementById("content-indexbody-right").src="searchAnswer.html";
            }
        </script>
    </head>
    <body class="index-body">
        <div class="container">
            <div class="top-message">
                <div class="top-message-left">
                    <a href="releaseInfo.jsp" target="content-indexbody-right">[发布信息]</a>
                    <a href="admin.jsp">[进入后台]</a>
                </div>
                <div class="top-message-right">
                    <a href="#">设为主页</a>-
                    <a href="#">收藏本页</a>-
                    <a href="#">联系我们</a>
                </div>
            </div>
            
            <div class="top-pic">
            </div>
            <div class="top-menu">
                <table class="table-top-menu" id="tableTopMenu">
                    <tr>
                        <td><span class="likea" onclick="change_index()">首&nbsp;&nbsp;页</span></td>
<!--                        <td><span class="likea" onclick="change_jobinfo()">招聘信息</span></td>-->
                        <td><a href="/dsgqxxw/queryByTypeId?infoTypeId=1" target="content-indexbody-right" class="likea">招聘信息</a></td>
                        <td><a href="/dsgqxxw/queryByTypeId?infoTypeId=2" target="content-indexbody-right" class="likea">培训信息</a></td>
                        <td><a href="/dsgqxxw/queryByTypeId?infoTypeId=5" target="content-indexbody-right" class="likea">房屋信息</a></td>
                        <td><a href="/dsgqxxw/queryByTypeId?infoTypeId=6" target="content-indexbody-right" class="likea">求购信息</a></td>
                        <td><a href="/dsgqxxw/queryByTypeId?infoTypeId=7" target="content-indexbody-right" class="likea">招商引资</a></td>
                    </tr>
                    <tr>
                        <td><a href="/dsgqxxw/queryByTypeId?infoTypeId=8" target="content-indexbody-right" class="likea">公寓信息</a></td>
                        <td><a href="/dsgqxxw/queryByTypeId?infoTypeId=3" target="content-indexbody-right" class="likea">求职信息</a></td>
                        <td><a href="/dsgqxxw/queryByTypeId?infoTypeId=4" target="content-indexbody-right" class="likea">家教信息</a></td>
                        <td><a href="/dsgqxxw/queryByTypeId?infoTypeId=9" target="content-indexbody-right" class="likea">车辆信息</a></td>
                        <td><a href="/dsgqxxw/queryByTypeId?infoTypeId=10" target="content-indexbody-right" class="likea">出售信息</a></td>
                        <td><a href="/dsgqxxw/queryByTypeId?infoTypeId=11" target="content-indexbody-right" class="likea">寻找启示</a></td>
                    </tr>
                </table>
            </div>
            
            <div class="top-midpic">
            </div>
            
            <div class="div-indexbody-left">
                <ul>
                    <li>
                        <div class="li-indexbody-left">日历</div>
                        <!--    获取正确时间并显示     -->
                        <iframe id="content-time" name="content-time" src="../html/calender.html" class="iframe-cale"></iframe>
                    </li>
                    <li>
                    	<form action="/dsgqxxw/queryByCondtionAction" method="post" target="content-indexbody-right">
	                        <div class="li-indexbody-left">信息快速检索</div>
	                        <div class="info-search">
	                            关键字： <input type="text" name="coninput" size="17px"><br>
	                            条&nbsp;件：
	                            <select class="select-cond" name="condition" >
	                                <option value="INFO_TYPE_NAME">信息类型</option>
	                                <option value="INFO_TITLE">信息标题</option>
	                                <option value="INFO_LINKMAN">信息联系人</option>
	                                <option value="INFO_PHONE">信息联系电话</option>
	                                <option value="INFO_EMAIL">信息联系邮箱</option>
	                                <option value="INFO_CONTENT">信息内容</option>
	                            </select>
	                            <input type="submit" name="index-search" id="index-search" value="搜索"><br>               
	                            搜索类型：
	                            <input type="radio" name="matchType" id="matchall" value="matchAll">全字匹配
	                            <input type="radio" name="matchType" id="matchsome" value="matchSome" checked="checked">模糊匹配
	                        </div>
                        </form>
                    </li>
                </ul>
            </div>
            <div class="div-indexbody-right" id="div-indexbody-right-id">
                <iframe id="content-indexbody-right" name="content-indexbody-right" src="recommendInfo.jsp"></iframe>
            </div>
        </div>
    </body>
</html>