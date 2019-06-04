<%--
  Created by IntelliJ IDEA.
  User: 15291
  Date: 2019/6/4
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        //在域中存储数据
        request.setAttribute("name","张三");
        session.setAttribute("age","18");
    %>
<hr/>

<h3>获取值</h3>
${requestScope.name}
${sessionScope.age}
${sessionScope.haha}
</body>
</html>
