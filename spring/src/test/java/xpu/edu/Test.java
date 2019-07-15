package xpu.edu;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

//AOP入门测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test {
    @Resource(name="userDao")
    private UserDao userDao;

    @org.junit.Test
    public void demo1(){
        userDao.update();;
        userDao.find();
        userDao.delete();
        userDao.save();
    }
}
