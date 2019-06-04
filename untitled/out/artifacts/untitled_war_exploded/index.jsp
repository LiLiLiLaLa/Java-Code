<%--
  Created by IntelliJ IDEA.
  User: 15291
  Date: 2019/5/18
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="RequestDemo4" method="GET">
    <input name="userName"/>
    <input type="submit" value="提交"/>
  </form>

  <hr>
  <a href="RequestDemo4">RequestDemo4</a>

  <%
    System.out.println("Hello JSP!!!");//打印到控制台
  %>

  <!--会打印在浏览器-->
  <h1>hi~ jsp！！！</h1>

  </body>
</html>
