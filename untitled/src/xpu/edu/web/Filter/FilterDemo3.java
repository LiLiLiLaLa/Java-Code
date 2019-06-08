package xpu.edu.web.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo3 implements Filter {
    /**
     * 在服务器关闭后，Filter对象被销毁，如果服务器正常关闭，就会执行destroy方法，只执行一次，一般用于释放资源
     */
    public void destroy() {
        System.out.println("destroy...");
    }

    /**
     * 每一次请求被拦截资源时会被执行，会执行多次
     */
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("doFilter...");
        //放行
        chain.doFilter(req, resp);
    }

    /**
     *在服务器启动后，会创建Filter对象，然后调用init方法，只执行一次，一般用于加载资源
     */
    public void init(FilterConfig config) throws ServletException {
        System.out.println("init...");
    }

}
