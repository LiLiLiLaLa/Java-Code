package xpu.edu.web.servlet.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/ResponseDemo3")
public class ResponseDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取流对象之前设置流的默认编码（也可以不设置）
        response.setCharacterEncoding("GBK");
        //告诉浏览器，服务器发出的消息体数据的编码，建议浏览器使用该编码解码
        response.setHeader("content-type","text/html;charset=UTF-8");

        //****简单的形式设置编码****
        response.setContentType("text/html;charset=UTF-8");

        //获取字符输出流
        PrintWriter writer = response.getWriter();
        //输出数据
        writer.write("hello response");
        //可以识别标签
        writer.write("<h1>hello response</h1>");
        //中文会乱码说明编解码不一致，浏览器默认字符集和操作系统有关
        writer.write("你好 response");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
