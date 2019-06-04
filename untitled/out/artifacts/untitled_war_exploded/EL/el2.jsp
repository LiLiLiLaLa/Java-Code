<%@ page import="xpu.edu.web.servlet.EL.User" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: 15291
  Date: 2019/6/4
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取数据</title>
</head>
<body>

<%
    User user = new User();
    user.setAge(18);
    user.setName("邹鸡儿");
    user.setBirthday(new Date());

    request.setAttribute("u",user);

    List list = new ArrayList();
    list.add("邹鸡儿");
    list.add("邹大炮");

    request.setAttribute("list",list);

    Map hashMap = new HashMap();
    hashMap.put("name","邹鸡儿");
    hashMap.put("age","19");

    request.setAttribute("hashMap",hashMap);
%>

<h3>获取对象中的值</h3>
${requestScope.u}<br/>

<%--
    通过对象的属性来获取
    * setter或getter方法，去掉set或get，在剩余部分首字母变小写
    * setName——>Name——>name
--%>

${requestScope.u.name}<br/>
${requestScope.u.age}<br/>
${requestScope.u.birthday}<br/>

<h3>获取List的值</h3>
${requestScope.list}<br/>
${requestScope.list[0]}
${requestScope.list[1]}
<%--
    越界时会输出空字符串""
--%>
${requestScope.list[10]}

<h3>获取Map的值</h3>
${requestScope.hashMap.name}<br/>
${requestScope.hashMap["name"]}

</body>
</html>
