class Person{};
class Student{};
public class P1 {
    public static void main(String[] args) {
        fun(new Person());
        fun(new Student());
    }
    public static void fun(Object obj){
        System.out.println(obj);
    }
}


//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//
//@SuppressWarnings("serial")
//class Person implements Serializable{
//    private String name ;
//    private int age ;
//    public Person(String name, int age) {
//        super();
//        this.name = name;
//        this.age = age;
//    }
//    @Override
//    public String toString() {
//        return "Person [name=" + name + ", age=" + age + "]";
//    }
//}
//public class P1{
//    public static final File FILE = new File("/Users/yuisama/Desktop/testSer.txt") ;
//    public static void main(String[] args) throws Exception {
//        ser(new Person("yuisama", 25)) ;
//    }
//    public static void ser(Object obj) throws FileNotFoundException, IOException {
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE)) ;
//        oos.writeObject(obj ) ;
//        oos.close() ;
//    }
//}

import java.lang.ref.WeakReference;

public class P1{
    private Object instance;
    private static int _1MB =  1024 * 1024;
    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) {
        P1 test = new P1();
        WeakReference w = new WeakReference(test);
        test = null;
        System.gc();
    }
}

//interface IMessage{
//    public static final String MSG = "我是靓仔";//全局常量
//    public abstract void print();//抽象方法
//}
//
//interface INews{
//    public abstract String getName();
//}
//
//abstract class New{
//    //抽象类中方法前面的abstract不能省略，否则就是普通方法
//    public abstract void setName();
//}
//
//class MessageImpl extends New implements IMessage,INews{
//    @Override
//    public void setName() {
//        System.out.println("我是靓仔！");
//    }
//
//    @Override
//    public String getName() {
//        return IMessage.MSG;//访问常量都建议加上类名称
//    }
//
//    @Override
//    public void print() {
//        System.out.println(getName());
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        IMessage m = new MessageImpl();//子类向上转型
//        m.print();//调用被子类覆写过的方法
//        INews n = (INews) m;
//        System.out.println(n.getName());
//        New news = (New) m ;
//        news.setName();
//    }
//}
////我是靓仔
////我是靓仔
////我是靓仔！

//interface A{
//    public void printA();
//    static interface D{
//        public void print();
//    }
//}
//
//interface B{
//    public void printB();
//}
//
//interface C extends A,B{
//    //接口多继承
//    public void print();
//}
//
//class Impl implements A.D{
//    @Override
//    public void print(){}
//}

///**
// * 定义一个USB标准
// */
//interface USB{
//    /**
//     * 安装驱动
//     */
//    public void setUp();
//
//    /**
//     * 进行工作
//     */
//    public void work();
//}
///**
// * 定义电脑类
// */
//class Computer{
//    /**
//     * 插入USB设备
//     * @param usb
//     */
//    public void plugin(USB usb){
//        usb.setUp();//安装
//        usb.work();//工作
//    }
//}
//
///**
// * 定义一个USB设备
// */
//class UDisk implements USB{
//    @Override
//    public void setUp() {
//        System.out.println("安装打印机驱动");
//    }
//
//    @Override
//    public void work() {
//        System.out.println("打印机开始工作");
//    }
//}

//interface Computer{
//    void printComputer();
//}
//
//class MackbookProComputer implements Computer{
//    @Override
//    public void printComputer() {
//        System.out.println("MackbookPro");
//    }
//}
//
//class SuferaceBookComputer implements Computer{
//    @Override
//    public void printComputer() {
//        System.out.println("SufaceBook");
//    }
//}
//
//public class Test{
//    public void buyComputer(Computer computer){
//        computer.printComputer();
//    }
//
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.buyComputer(new MackbookProComputer());
//    }
//}

import java.util.Scanner;

interface Computer{
    void printComputer();
}

class MacbookProComputer implements Computer{
    @Override
    public void printComputer() {
        System.out.println("MackbookPro");
    }
}

class SurfaceBookComputer implements Computer{
    @Override
    public void printComputer() {
        System.out.println("SurfaceBook");
    }
}

interface ComputerFactory{
    Computer createComputer();
}

class MsFactory implements ComputerFactory{
    @Override
    public Computer createComputer() {
        return new SurfaceBookComputer();
    }
}

class AppleFactory implements ComputerFactory{
    @Override
    public Computer createComputer() {
        return new MacbookProComputer();
    }
}

public class Test{
    public void buyComputer(Computer computer){
        computer.printComputer();
    }

    public static void main(String[] args) {
        Test t = new Test();
        ComputerFactory factory = new AppleFactory();
        t.buyComputer(factory.createComputer());
    }
}
