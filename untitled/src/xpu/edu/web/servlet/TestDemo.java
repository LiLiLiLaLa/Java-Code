package xpu.edu.web.servlet;
//
//@FunctionalInterface  //是一个函数式编程接口，只允许有一个方法
//interface IMessage{
//    public void print();//接口中的抽象方法必须由子类覆写
//}
////
//public class TestDemo {
////    public static void main(String[] args) {
////        IMessage message = new IMessage() {
////            //匿名内部类
////            @Override
////            public void print() {
////                System.out.println("Hello World");
////            }
////        };
////        message.print();
////    }
//public static void main(String[] args) {
//    //函数式编程
//    IMessage message = () -> System.out.println("Hello World");
//    message.print();
//}
//}
//
//class Person {
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
//
//@FunctionalInterface
//interface IUtil<R,PN,PA> {
//    public R createPerson(PN p1,PA p2) ;
//}
//public class TestDemo {
//    public static void main(String[] args) {
//        IUtil<Person,String,Integer> iu = Person :: new;
//        System.out.println(iu.createPerson("小可爱", 25));//Person [name=小可爱, age=25]
//    }
//}
import java.util.function.Function;
public class TestDemo {
    public static void main(String[] args) {
        Function<Integer, String> fun = String :: valueOf ;
        System.out.println(fun.apply(1000));
    }
}