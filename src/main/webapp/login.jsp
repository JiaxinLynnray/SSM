<%--
  Created by IntelliJ IDEA.
  User: Lynnray
  Date: 2019/10/28
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>SSM登录界面</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript">
        function login() {
            let userName = $("#userName").val();
            let password = $("#password").val();
            let roleName = $("#roleName").val();

            if (userName == null || userName === "") {
                alert("用户名不能为空！");
                return;
            }
            if (password == null || password === "") {
                alert("密码不能为空！");
                return;
            }
            $("#adminLogin").submit();
        }
    </script>
</head>
<body>
<form id="adminLogin" method="post" name="adminLogin" action="${pageContext.request.contextPath}/user/login.do">
    <table border="0" cellspacing="0" cellpadding="0">
        <tbody>
        <tr>
            <td height="150">&nbsp;</td>
        </tr>
        <tr style="height: 254px;">
            <td>
                <div style="margin: auto;width: 936px">
                    <img style="display: block" src="${pageContext.request.contextPath}/img/body_03.jpg">
                </div>
                <div style="background-color: #278296">
                    <div style="margin: auto; width: 936px">
                        <div style="background: url(${pageContext.request.contextPath}/img/body_05.jpg) no-repeat;
                                height: 155px">
                            <div style="text-align: left;width: 265px;height: 125px; float: left">
                                <table border="0" cellpadding="0" cellspacing="0">
                                    <tbody>
                                    <tr>
                                        <td style="height: 45px">
                                            <input type="text" class="input" value="${user.userName}" name="userName"
                                                   id="userName">
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input type="password" class="input" value="${user.password}"
                                                   name="password" id="password">
                                        </td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                            <div style="height: 1px;clear: both"></div>
                            <div style="width: 380px;float: right;clear: both">
                                <table border="0" cellspacing="0" cellpadding="0" width="300">
                                    <tbody>
                                    <tr>
                                        <td width="100" align="right">
                                            <input style="border: 0" id="btnLogin"
                                                   src="${pageContext.request.contextPath}/img/btn1.jpg" type="image"
                                                   name="btnLogin" onclick="login();return false;">
                                        </td>
                                        <td width="100" align="right">
                                            <input style="border: 0" id="btnReset"
                                                   src="${pageContext.request.contextPath}/img/btn2.jpg" type="image"
                                                   name="btnReset" onclick="adminlogin.reset();return false;">
                                        </td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                <div style="margin: 0 auto; width: 936px">
                    <img src="${pageContext.request.contextPath}/img/body_06.jpg">
                </div>
            </td>
        </tr>
        <tr style="height: 30%">
            <td>&nbsp;</td>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>
<script type="text/javascript">
    if ('${errorMsg}' != '') {
        alert('${errorMsg}');
    }
</script>
