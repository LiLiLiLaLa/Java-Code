interface ISubject{
    public void buyComputer(); //核心功能是买电脑
}

class RealSubject implements ISubject{
    @Override
    public void buyComputer() {
        System.out.println("买一台外星人电脑");
    }
}

class ProxySubject implements ISubject{
    //真实的操作
    private ISubject subject;
    public ProxySubject(ISubject subject){
        this.subject = subject;
    }

    public void prodeceComputer(){
        System.out.println("生产一台外星人电脑");
    }

    public void saleAfter(){
        System.out.println("外星人电脑售后团队");
    }

    @Override
    public void buyComputer() {
        this.prodeceComputer();//真实操作之前的准备
        this.subject.buyComputer();//强调真实业务
        this.saleAfter();//强调收尾工作
    }
}

class Factory{
    public static ISubject getInstance(){
        return new ProxySubject(new RealSubject());
    }
}

public class Code{
    public static void main(String[] args) {
        ISubject subject = Factory.getInstance();
        subject.buyComputer();
    }
}

package xpu.com.test;

import xpu.com.java.Message;

public class Demo {
    public static void main(String[] args) {
        Message message = new Message();
        message.print();
    }
}

package xpu.com.java;
//
public class Message {
    public void print(){
        System.out.println("[Message] Hello Package");
    }
}

//class Singleton{
//    public void print(){
//        System.out.println("Hello world");
//    }
//}
//
//public class SingletonTest {
//    public static void main(String[] args) {
//        Singleton singleton = null;//声明对象
//        singleton = new Singleton();//实例化对象
//        singleton.print();
//    }
//}

//class Singleton{
//    private Singleton(){}//private声明构造
//    public void print(){
//        System.out.println("Hello world");
//    }
//}

class Singleton{
    //在类的内部可以访问私有结构，所以可以在类的内部产生实例化对象
    static Singleton instance = new Singleton();
    private Singleton(){}//private声明构造方法
    public void print(){
        System.out.println("我是小可爱");
    }
}
public class SingletonTest{
    public static void main(String[] args) {
        Singleton singleton = null;//声明对象
        singleton = Singleton.instance;
        singleton.print();
    }
}
//我是小可爱