package xpu.edu.web.servlet.ServletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletContextDemo2")
public class ServletContextDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取ServletContext对象，通过HttpServlet获取
        ServletContext servletContext1 = this.getServletContext();
        //定义一个文件名称（实际应用中是动态获取的）
        String filename = "a.jpg";
        //获取MIME类型
        String mimeType = servletContext1.getMimeType(filename);
        System.out.println(mimeType);//image/jpeg

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
