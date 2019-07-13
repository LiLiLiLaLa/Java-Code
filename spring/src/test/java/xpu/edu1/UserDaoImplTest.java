package xpu.edu1;
import org.junit.Test;

public class UserDaoImplTest {

    //传统方式
    @Test
    public void Demo1(){
        UserDao userDao = new UserDaoImpl();
        userDao.save();
    }

    //Spring的IOC的注解方式
    @Test
    public void Demo2(){

    }
}
