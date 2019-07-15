package xpu.edu;

import org.junit.Test;
import xpu.edu1.CglibProxy;
import xpu.edu1.CustomerDao;

public class UserDaoImplTest {
    @Test
    //JDK动态代理
    public void demo1(){
        UserDao dao = new UserDaoImpl();
        //创建代理
        UserDao proxy = new JdkProxy(dao).ctreateProxy();
        proxy.save();
        proxy.delete();
        proxy.find();
        proxy.update();
    }

    @Test
    //cglib动态代理
    public void demo2(){
        CustomerDao customerDao = new CustomerDao();
        CustomerDao proxy = new CglibProxy(customerDao).createProxy();
        proxy.delete();
        proxy.find();
        proxy.save();
        proxy.update();
    }
}
