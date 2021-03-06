<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <style type="text/css">
            body{
                font-size: 12px;
            }
            #jobinfo-container{
                clear: both;
                width: 100%;
                height: 550px;
            }
            #jobinfo-top{
                width: 100%;
                height: 30px;
            }
            #jobinfo-foot{
                width: 100%;
                height: 20px;
                bottom: 0px;
                text-align: center;
            }
            #jobinfo-mid{
                width: 100%;
                height: 80px;
            }
            #jobinfo-mid textarea{
                border: 0;
                width: 98%;
            }
            .float-left{
                float: left;
            }
            .float-right{
                float: right;
            }
            #jobinfo-foot-table{
                width: 90%;
                float: right;
            }
            #jobinfo-foot-table td{
                
            }
            #jobinfo-container span{
                font-size: 16px;
                color: #0e3295;
            }
            #good-info{
                width: 100%;
                height: 150px;
                clear: both;
                background-color: #eee;
            }
            #new-info{
                width: 100%;
                height: 150px;
                clear: both;
                background-color: #eee;
            }
            #jobinfo-container ul{
                list-style: none;
                margin-left: -30px;
            }
        </style>
        <script>
        	function goPre(){
        		history.go(-1);
        	}
        </script>
    </head>
    <body>
        <div id="jobinfo-container">
            <ul>
                <li><span>■信息类型【${info.info_type_name }】</span><br>
                    <div id="good-info">
                        <div id="jobinfo-top">
                            <div class="float-left">【${info.info_title }】</div>
                            <div class="float-right">发布时间：『<fmt:formatDate value= "${info.info_date }" pattern="yyyy-MM-dd HH:mm:ss"/>』</div>
                        </div>

                        <div id="jobinfo-mid">
                            <pre readonly="readonly">${info.info_content }</pre>
                        </div>

                        <div id="jobinfo-foot">
                            <table id="jobinfo-foot-table">
                                <tr>
                                    <td>联系电话：<span>${info.info_phone }</span></td>
                                    <td>联系人：<span>${info.info_linkman }</span></td>
                                    <td>E-mail : <span>${info.info_email }</span></td>
                                </tr>
                            </table>
                        </div>
                    </div>
                    <input type="button"  value="返回" onclick="goPre()">
                </li>
            </ul>
        </div>
    </body>
</html>