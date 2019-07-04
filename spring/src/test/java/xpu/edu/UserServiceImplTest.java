package xpu.edu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  Spring的IOC入门
 */
public class UserServiceImplTest {
    @Test
    /**
     * 传统的调用方式
     */
    public void demo1() {
        UserService u = new UserServiceImpl();
        ((UserServiceImpl) u).setName("小靓仔");
        u.save();
    }

    @Test
    /**
     *  Spring方式的调用
     */
    public void demo2(){
        //创建Spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();
    }
}