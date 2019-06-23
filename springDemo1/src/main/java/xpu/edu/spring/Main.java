package xpu.edu.spring;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        //创建HelloWorld对象
//        HelloWorld helloWorld = new HelloWorld();
//        //为name属性赋值
//        helloWorld.setName("小靓仔");

        //1.创建Spring的IOC容器对象
        //ApplicationContext代表IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从IOC容器中获取Bean实例
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        //调用hello方法
        helloWorld.hello();
    }
}