package xpu.edu1;

import javafx.scene.shape.CubicCurve;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//cglib动态代理
public class CglibProxy implements MethodInterceptor {
    private CustomerDao customerDao;
    public CglibProxy(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
    //使用cglib产生代理的方法
    public CustomerDao createProxy(){
        //创建cglib的核心类对象
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(customerDao.getClass());
        //设置回调（类似于InvocationHandler对象）
        enhancer.setCallback(this);
        //创建代理对象
        CustomerDao proxt = (CustomerDao) enhancer.create();
        return proxt;
    }
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //进行增强
        //判断方法是否为save
        if("save".equals(method.getName())){
            System.out.println("增强方法");
            return methodProxy.invokeSuper(proxy,args);
        }
        //不是save执行父类的方法
        return methodProxy.invokeSuper(proxy,args);
    }
}
