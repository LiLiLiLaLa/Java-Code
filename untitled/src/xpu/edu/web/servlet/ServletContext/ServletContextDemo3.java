package xpu.edu.web.servlet.ServletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet("/ServletContextDemo3")
public class ServletContextDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取ServletContext对象，通过HttpServlet获取
        ServletContext servletContext1 = this.getServletContext();
        //获取文件的服务器路径
        String realPath = servletContext1.getRealPath("/b.txt");//Web目录下资源访问
        System.out.println(realPath);
        //File file = new File(realPath);
        String realPath1 = servletContext1.getRealPath("/WEB-INF/c.txt");//WEB-INF目录下的资源访问
        System.out.println(realPath1);

        String realPath2 = servletContext1.getRealPath("/WEB-INF/classes/a.txt");//src目录下访问资源
        System.out.println(realPath2);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
