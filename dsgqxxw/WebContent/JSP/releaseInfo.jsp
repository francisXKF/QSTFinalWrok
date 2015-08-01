<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- 发布信息-->
<html>
    <head>
        <meta charset="utf-8">
        <head>发布信息</head>
        <style type="text/css">
            #container{
                width: 100%;
                height: auto;
                border: 1px solid #ccc;
                background-color: #eee;
            }
            .float-left{
                float: left;
            }
            .float-right{
                float: right;
            }
            .second-line{
                clear: both;
            }
            .second-line input{
                width: 70%;
            }
            span{
                background-color: #ddd;
            }
            textarea{
                width: 90%;
                height: 100px;
                
                resize: none;
                clear: both;
            }
            .div-foot{
                width: 90%;
                text-align: center;
            }
        </style>
        <script>
            function content_calc(){
                var total = document.getElementById("type_content").value;
                document.getElementById("usedchar").innerHTML = total.length;
                document.getElementById("remainderchar").innerHTML = 500 - total.length;
            }
            function judgeSubmit(){
                var flag = true;
                if(document.getElementById("info_title").value==""){
                    alert("标题不可为空");
                    flag = false;
                }
                if(document.getElementById("info_phone").value==""){
                    alert("联系电话不可为空");
                    flag = false;
                }
                if(document.getElementById("info_user").value==""){
                    alert("联系人不可为空");
                    flag = false;
                }
                if(document.getElementById("info_email").value==""){
                    alert("E-mail不可为空");
                    flag = false;
                }
                return flag;
            }
        </script>
    </head>
    <body>
        <div id="container">
            ■发布信息<br>
            <form action="../insertInfoAction" method="post" onSubmit="return judgeSubmit()">
                <div class="float-left">
                    信息类别:&nbsp;
                    <select name="info_type" id="info-type">
                        <option value="1" selected=selected>招聘信息</option>
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
                    </select><br>
                </div>
                <div class="float-right">
                    [信息标题最多不得超过40个字符]
                </div>
                <div class="second-line">
                    信息标题:&nbsp;
                    <input type="text" maxlength="40" name="info_title"  id="info_title"><br>
                
                </div>
                信息内容:&nbsp;&nbsp;已用：<span id="usedchar">0</span>个&nbsp;剩余：<span id="remainderchar">500</span>个
                <div class="float-right">[信息内容最多不得超过500个字符]</div>
                <br>
                <textarea class="content" name="info_content" maxlength="500" oninput ="content_calc()" id="type_content"></textarea><br>
                联系电话:&nbsp;<input type="text" name="info_phone"  id="info_phone">[多个电话以逗号分隔！]<br>
                联 系 人:&nbsp;<input type="text" name="info_user" id="info_user"><br>
                E - mail:&nbsp;<input type="text" name="info_email" id="info_email"><br>
                <div class="div-foot">
                    <input type="submit" id="submitbtn" value="发布">
                    <input type="reset" id="resetbtn" value="重置">
                </div>
            </form>
        </div>
    </body>
</html>