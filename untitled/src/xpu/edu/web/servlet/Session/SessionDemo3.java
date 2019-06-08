package xpu.edu.web.servlet.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/SessionDemo3")
public class SessionDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //使用Session共享数据
        //1.获取Session
        HttpSession session = request.getSession();
        System.out.println(session);//打印的HashCode值

        //希望客户端关闭后再次获取Session能相同
        Cookie cookie = new Cookie("JSSIONID",session.getId());
        cookie.setMaxAge(60 * 60);
        response.addCookie(cookie);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
