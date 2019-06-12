//public class Test{
//    public static void main(String[] args) {
//        System.out.println(add(1,3,4));//随意传递的内容，随意个数
//        System.out.println(add(new int[]{1,2,3}));//可变参数可以接收数组
//        System.out.println(add(new int[]{1,4,6}));
//        System.out.println(add(new int[]{1,1,3,4,4}));
//    }
//
//    public static int add(int...data){
//        int result = 0;
//        for (int i = 0; i < data.length; i++) {
//            result += data[i];
//        }
//        return result;
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        System.out.println(add("Hello"));
//        System.out.println(add("Hello",1,4,5,6));
//        System.out.println(add("Hello",new int[]{1,2,3}));
//    }
//    public static int add(String msg,int ... data) {
//        int result = 0 ;
//        for (int i = 0; i < data.length; i++) {
//            result += data[i] ;
//        }
//        return result ;
//    }
//}

//public class Test{
//    public static void main(String[] args) {
//        int[] data = new int[] { 1, 2, 3, 4, 5 }; // 原始数组
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]); // 通过循环控制索引下标
//        }
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int[] data = new int[] { 1, 2, 3, 4, 5 }; // 原始数组
//        for (int i : data) { // 将数组中每个元素赋值给i
//            System.out.println(i); // 这种循环避免了角标的问题
//        }
//    }
//}

//class MyMath {
//    public static int add(int x, int y) {
//        return x + y;
//    }
//    public static int sub(int x, int y) {
//        return x - y;
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        System.out.println(MyMath.add(10, 20));
//        System.out.println(MyMath.sub(30, 10));
//    }
//}

//package www.xpu.java.util;
//public class MyMath {
//    public static int add(int x, int y) {
//        return x + y;
//    }
//    public static int sub(int x, int y) {
//        return x - y;
//    }
//}

//package www.xpu.java.test;
//
//import www.xpu.java.util.MyMath;
//public class TestDemo {
//    public static void main(String[] args) {
//        System.out.println(MyMath.add(10, 20));
//        System.out.println(MyMath.sub(30, 10));
//    }
//}

//package www.xpu.java.test;
//import static www.xpu.java.util.MyMath.*; // 静态导入
//public class TestDemo {
//    public static void main(String[] args) {
//        System.out.println(add(10, 20));
//        System.out.println(sub(30, 10));
//    }
//}

//class Point {
//    private Object x ;
//    private Object y ;
//    public Object getX() {
//        return x;
//    }
//    public void setX(Object x) {
//        this.x = x;
//    }
//    public Object getY() {
//        return y;
//    }
//    public void setY(Object y) {
//        this.y = y;
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
////        //设置整型坐标
////        // 设置数据
////        Point p = new Point() ;
////        p.setX(10); // 自动装箱并且向上转型为Object
////        p.setY(20);
////        // 取出数据
////        int x = (Integer) p.getX() ; // 强制向下转型为Integer并且自动拆箱
////        int y = (Integer) p.getY() ;
////        System.out.println("x = " +x+",y = "+y);
////
////        //设置字符串坐标
////        // 设置数据
////        Point p1 = new Point() ;
////        p1.setX("东经80度");
////        p1.setY("北纬20度");
////        // 取出数据
////        String x1 = (String) p1.getX() ;
////        String y1 = (String) p1.getY() ;
////        System.out.println("x1 = " +x1+",y1 = "+y1);
//
//        // 设置数据
//        Point p2 = new Point() ;
//        p2.setX(10.2);
//        p2.setY("北纬20度");
//        // 取出数据
//        String x2 = (String) p2.getX() ;
//        String y2 = (String) p2.getY() ;
//        System.out.println("x2 = " +x2+",y2 = "+y2);
//    }
//}

//class MyClass<T,E> {
//}
//
//public class Test {
//    public static void main(String[] args) {
//        MyClass<String,Integer> myClass1 = new MyClass<String,Integer>();
//    }
//}

//class Point <T> {
//    // T表示参数，是一个占位的标记；如果有多个泛型就继续在后面追加
//    private T x ;
//    private T y ;
//    public T getX() {
//        return x;
//    }
//    public void setX(T x) {
//        this.x = x;
//    }
//    public T getY() {
//        return y;
//    }
//    public void setY(T y) {
//        this.y = y;
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        // 设置数据
//        Point<String> p = new Point<>();
//        p.setX("东经80度");
//        p.setY("北纬20度");
//        // 取出数据
//        // 避免了向下转型
//        String x = p.getX() ;
//        String y = p.getY() ;
//        System.out.println("x = " +x+",y = "+y);
//    }
//}
////输出
////x = 东经80度,y = 北纬20度

//class MyClass{
//    public <T> void testMethod(T t) {
//        System.out.println(t);
//    }
//}

//class MyClass<T>{
//    public void testMethod1(T t) {
//        System.out.println(t);
//    }
//    public <T> T testMethod2(T t) {
//        return t;
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        MyClass<String> myClass = new MyClass<>();
//        myClass.testMethod1("hello 泛型类");
//        Integer i = myClass.testMethod2(100);
//        System.out.println(i);
//    }
//}
//
//class MyClass<T>{
//    public void testMethod1(T t) {
//        System.out.println(t);
//    }
//    public <E> E testMethod2(E e) {
//        return e;
//    }
//}

//class Message<T> {
//    private T message ;
//    public T getMessage() {
//        return message;
//    }
//    public void setMessage(T message) {
//        this.message = message;
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Message<String> message = new Message() ;
//        message.setMessage("我是小靓仔");
//        fun(message);
//    }
//    public static void fun(Message<String> temp){
//        System.out.println(temp.getMessage());
//    }
//}
////输出
////我是小靓仔

//public class Test {
//    public static void main(String[] args) {
//        Message<Integer> message = new Message() ;
//        message.setMessage(99);
//        fun(message); // 出现错误，只能接收String
//    }
//    public static void fun(Message<String> temp){
//        System.out.println(temp.getMessage());
//    }
//}

//public class TestDemo {
//    public static void main(String[] args) {
//        Message<Integer> message = new Message() ;
//        message.setMessage(55);
//        fun(message);
//    }
//    // 此时使用通配符"?"描述的是它可以接收任意类型，但是由于不确定类型，所以无法修改
//    public static void fun(Message<?> temp){
//        //temp.setMessage(100); 无法修改！
//        System.out.println(temp.getMessage());
//    }
//}

//class Message<T extends Number> { // 设置泛型上限
//    private T message ;
//    public T getMessage() {
//        return message;
//    }
//    public void setMessage(T message) {
//        this.message = message;
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Message<Integer> message = new Message() ;
//        message.setMessage(55);
//        fun(message);
//    }
//    public static void fun(Message<? extends Number> temp){
//        System.out.println(temp.getMessage());
//    }
//}

//class Message<T> {
//    private T message ;
//    public T getMessage() {
//        return message;
//    }
//    public void setMessage(T message) {
//        this.message = message;
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Message<String> message = new Message() ;
//        message.setMessage("Hello World");
//        fun(message);
//    }
//    public static void fun(Message<? super String> temp){
//        temp.setMessage("aa!");
//        System.out.println(temp.getMessage());
//    }
//}

//interface IMessage<T> {
//    // 在接口上定义了泛型
//    public void print(T t) ;
//}

//interface IMessage<T> { // 在接口上定义了泛型
//    public void print(T t) ;
//}
//class MessageImpl<T> implements IMessage<T> {
//    @Override
//    public void print(T t) {
//        System.out.println(t);
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        IMessage<String> msg = new MessageImpl() ;
//        msg.print("Hello World");
//    }
//}

////在子类实现接口的时候明确给出具体类型
//interface IMessage<T> {
//    public void print(T t) ;
//}
//class MessageImpl implements IMessage<String> {
//    @Override
//    public void print(String t) {
//        System.out.println(t);
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        IMessage<String> msg = new MessageImpl() ;
//        msg.print("Hello World");
//    }
//}

//class MyClass<T>{
//    private T message;
//    public T getMessage() {
//        return message;
//    }
//    public void setMessage(T message) {
//        this.message = message;
//    }
//    public void testMethod1(T t) {
//        System.out.println(t);
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        MyClass<String> myClass1 = new MyClass<>();
//        MyClass<Integer> myClass2 = new MyClass<>();
//        System.out.println(myClass1.getClass() == myClass2.getClass());
//    }
//}
////输出
////true

import java.lang.reflect.Field;

class MyClass<T,E>{
    private T message;
    private E text;
    public E getText() {
        return text;
    }
    public void setText(E text) {
        this.text = text;
    }
    public T getMessage() {
        return message;
    }
    public void setMessage(T message) {
        this.message = message;
    }
    public void testMethod1(T t) {
        System.out.println(t);
    }
}
public class Test {
    public static void main(String[] args) {
        MyClass<String,Integer> myClass1 = new MyClass<>();
        Class cls = myClass1.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType());
        }
    }
}
//输出
//class java.lang.Object
//class java.lang.Object