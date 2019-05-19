package xpu.edu.web.servlet.request;

        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;

/**
 * 演示Request对象获取请求行数据
 */
@WebServlet("/RequestDemo1")
public class RequestDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求方式：String getMethod()
        String  method = request.getMethod();
        System.out.println(method);
        // 获取虚拟目录：String getContextPath()
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        // 获取Servlet路径：String getServletPath()
        String servletPath = request.getServletPath();
        System.out.println(servletPath);
        // 获取get方式的请求参数：String getQueryString()
        String queryString = request.getQueryString();
        System.out.println(queryString);
        // 获取请求URI：String getRequestURI()
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
        // 获取请求URL（比URI多了前面部分的http://）：String getRequeatURL()
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURL);
        // 获取协议及版本：String getProtocol()
        String protocol = request.getProtocol();
        System.out.println(protocol);
        // 获取客户机的IP地址：String getRemoteAddr()
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
