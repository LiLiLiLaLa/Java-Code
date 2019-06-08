package xpu.edu.web.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ListenerDemo implements ServletContextListener {
    /**
     * 监听ServletContext对象创建的，在服务器启动后自动创建
     *
     * 在服务器启动后自动创建
     * @param servletContextEvent
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext对象被创建了");
    }

    /**
     * 在服务器关闭后，ServletContext对象被销毁，当服务器被正常调用后该方法被调用
     * @param servletContextEvent
     */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext对象被销毁了");
    }
}
