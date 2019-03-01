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

//class Singleton{
//    //在类的内部可以访问私有结构，所以可以在类的内部产生实例化对象
//    private static Singleton instance = new Singleton();
//    //私有化构造函数
//    private Singleton(){}
//    public static Singleton getInstance(){
//        return instance;
//    }
//    public void print(){
//        System.out.println("我是小可爱");
//    }
//}
//
//public class SingletonTest{
//    public static void main(String[] args) {
//        Singleton singleton = null;//声明对象
//        singleton = Singleton.getInstance();
//        singleton.print();
//    }
//}
//
////我是小可爱

////懒汉式单例（用时再new）
//class Singleton{
//    private static Singleton singleton;
//    private Singleton(){}
//    public Singleton getInstance(){
//        if(singleton == null){
//            singleton = new Singleton();
//        }
//        return singleton;
//    }
//}


////饿汉式单例（上来就new）
//class Singleton{
//    private final static Singleton SINGLETON = new Singleton();
//    private Singleton(){}
//    public Singleton getSingleton(){
//        return SINGLETON;
//    }
//}

//class Sex{
//    private String title;
//    public static final int MALE = 1;
//    private static final int FEMALE = 2;
//    private static final Sex MA = new Sex("男");
//    private static final Sex FEMA = new Sex("女");
//    private Sex(String s){
//        this.title = title;
//    }
//    public static Sex getInstance(int flag){
//        switch (flag){
//            case MALE:
//                return MA;
//            case FEMALE:
//                return FEMA;
//            default:
//                return null;
//        }
//    }
//    public String toString(){
//        return this.title;
//    }
//}

//try{
//    有可能出现异常的语句
//}[catch(异常类 对象){
//}...]
//[finally{
//    异常的出口
//}]

//public class Test{
//    public static void main(String[] args) throws Exception{
//        System.out.println(calculate(10,0));
//    }
//
//    public static int calculate(int x, int y) throws Exception{
//        return x/y;
//    }
//}

//public class Test{
//    public static void main(String[] args) {
//        try{
//            throw new Exception("抛个异常试试");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        try{
//            System.out.println(calculate(10,0));
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    public static int calculate(int x,int y) throws Exception{
//        int result = 0;
//        System.out.println("计算开始前**");
//        try{
//            result = x / y;
//        }finally {
//            System.out.println("计算结束**");
//        }
//        return result;
//    }
//}

//public class Test{
//    public static void main(String[] args) {
//        String str = "100";
//        int num = Integer.parseInt(str);
//        System.out.println(num * 2);
//    }
//}
////200

class AddException extends Exception {
    public AddException(String str) {
        super(str);
    }
}

public class Test{
    public static void main(String[] args) throws AddException {
        int num1 = 20;
        int num2 = 30;
        if(num1 + num2 == 50){
            throw new AddException("错误的操作");
        }
    }
}

