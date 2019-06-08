package xpu.edu.web.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo2 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //对request对象请求参数增强
        System.out.println("FilterDemo2执行了");
        //放行
        chain.doFilter(req, resp);
        //对response对象的响应消息增强
        System.out.println("FilterDemo2回来了");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
