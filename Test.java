//abstract class Person{
//    private String name;
//    public String getname(){
//        return name;
//    }
//    public abstract void home();
//}

//class Student extends Person{
//    public void home(){
//        System.out.println("邹鸡儿吃狗屎");
//    }
//}

//public class Test{
//    public static void main(String[] args){
//        // Person  per1 = new Person();
//        // per1.name = "邹二狗";
//        // per1.age = 20;
//        // per1.eat();
//        // per1.sleep();
//        // per1.work();
//        Person per = new Student();
//        per.home();
//    }
//}

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLOutput;

//public class Test {
//    public static void main(String[] args){
//        //获取File对象
//        File file = new File("C:" + File.separator + "Users"
//                + File.separator + "15291" + File.separator + "Desktop"
//                + File.separator + "bit");
//        //判断父路径是否存在，不存在创建多级父路径
//        if(!file.getParentFile().exists()){
//            file.getParentFile().mkdirs();
//        }
//        //判断文件是否存在，不存在创建文件
//        if(file.exists()){
//            System.out.println("文件已存在");
//        }else{
//            try{
//                file.createNewFile();
//            }catch(IOException e){
//                e.printStackTrace();
//            }
//        }
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        //获取File对象
//        File file = new File("C:" + File.separator + "Users"
//                + File.separator + "15291" + File.separator + "Desktop");
//        //将IO操作放在子线程中进行
//        new Thread(()->{
//            long start = System.currentTimeMillis();
//            listAllFiles(file);
//            long end = System.currentTimeMillis();
//            System.out.println("桌面文件遍历结束，共耗时：" + (end - start) + "毫秒");
//        }).start();
//        System.out.println("main线程结束");
//    }
//    public static void listAllFiles (File file){
//        if (file.isFile()) {
//            System.out.println(file);
//        } else {
//            if (file.exists() && file.isDirectory()) {
//                File[] files = file.listFiles();
//                for (File file1 : files) {
//                    listAllFiles(file1);
//                }
//            }
//        }
//    }
//}


public class Test{
    public static void main(String[] args) throws Exception{
        //取得终端对象
        File file = new File("C:" + File.separator + "Users"
                + File.separator + "15291" + File.separator + "Desktop"
                + File.separator + "bit");
        //取得指定文件的输出流
        OutputStream out = new FileOutputStream(file,true);
        //进行数据的输出
        String str = "hello world";
        out.write(str.getBytes(),6,5);
        //关闭流
        out.close();
    }
}



//import java.sql.SQLOutput;
//
//class Person{
//    private String name;
//    private int age;
//    public Person(String name,int age){
//        this.name = name;
//        this.age = age;
//    }
//    @Override
//    public String toString(){
//        return "名字：" + this.name + "  年龄：" + this.age;
//    }
//}
//
//public class test{
//    public static void main(String[] args) {
//        fun(new Person("xiaokeai",18));//名字：xiaokeai  年龄：18
//        fun("Hello");//Hello
//    }
//    public static void fun(Object obj){
//        System.out.println(obj.toString());//
默认输出对象调用的就是toString()方法
//    }
//}
//class Person{
//    private String name;
//    private int age;
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//    @Override
//    public String toString(){
//        return "名字：" + this.name + "  年龄：" + this.age;
//    }
//    @Override
//    public boolean equals(Object obj){
//        //对象判空
//        if(obj == null){
//            return false;
//        }
//        //判断是不是当前对象
//        if(this == obj){
//            return true;
//        }
//        //判断是不是Person类对象
//        if(!(obj instanceof Person)){
//            return false;
//        }
//        //是当前类对象
//        //向下转型比较属性值
//        Person person = (Person)obj;
//        return this.name.equals(person.name) && this.age == person.age;
//    }
//}
//
//public class test{
//    public static void main(String[] args) {
//        Person per1 = new Person("zoujier",18);
//        Person per2 = new Person("zoujier",18);
//        System.out.println(per1.equals(per2));
//    }
//}
//public class test{
//    public static void main(String[] args) {
//        //object接收数组对象，向上转型
//        Object obj = new int[]{1,2,3,4,5,6};
//        //向下转型，需要强转
//        int[] data = (int[])obj;
//        for(int i = 0;i < data.length; i ++){
//            System.out.println(data[i]);
//        }
//    }
//}
////1
////2
////3
////4
////5
////6
interface IMessage{
    public void getMessage();
}

class MessageImpl implements IMessage{
    @Override
    public String toString(){
        return "i am father";
    }
    public void getMessage(){
        System.out.println("我是大帅哥");
    }
}

public class test{
    public static void main(String[] args) {
        //子类向父接口转型
        IMessage msg = new MessageImpl();
        //接口向Object转型
        Object obj = msg;
        System.out.println(obj);
        //强制转换类型
        IMessage temp = (IMessage) obj;
        temp.getMessage();
    }
}
//i am father
//我是大帅哥

////这里的IntDemo实际上就是int数据类型的包装类
//class IntDemo{
//    private int num;
//    public IntDemo(int num){
//        this.num = num;
//    }
//    public int intValue(){
//        return this.num;
//    }
//}
//
//public class test{
//    public static void main(String[] args) {
//        //子类对象向上转型
//        Object obj = new IntDemo(55);
//        //向下转型
//        IntDemo temp = (IntDemo)obj;
//        //取出里面的基本数据类型操作
//        System.out.println(temp.intValue());
//    }
//}
////输出
////55

//public boolean equals(Object obj){
//    //自反性
//        if(obj == this){
//            return true;
//        }
//        //非空性
//        else if(obj == null){
//            return false;
//        }
//        else if(!(obj instanceof Person)){
//            return false;
//        }
//        //比较属性
//        Person per = (Person)obj;
//        return per.age.equals(this.age) && per.name.equals(this.name);
//        }

//import java.util.*;
//
//public class test{
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("My");
//        list.add("Son");
//        //取得ArrayList的双向迭代器
//        ListIterator<String> iterator = list.listIterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println("------------------------");
//        while(iterator.hasPrevious()){
//            System.out.println(iterator.previous());
//        }
//    }
//}

import java.util.*;

public class test{
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Hello");
        vector.add("My");
        vector.add("Son");
        Enumeration<String> enumeration = vector.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
//输出
//Hello
//My
//Son

    final void checkForComodification(){
        if(modCout != expectedModCount)
            throw new ConcurrentModificationExeption();
    }
	
	
//public class test{
//    public static void main(String[] args) {
//        Integer num = new Integer(55);//装箱
//        int data = num.intValue();//拆箱
//        System.out.println(data);
//    }
//}
////输出
////55
//public class test{
//    public static void main(String[] args) {
//        //自动装箱
//        Integer x = 55;
//        //可以直接利用包装类对象操作
//        System.out.println(++x);
//    }
//}
////输出
////56
public class test{
    public static void main(String[] args) {
//        Integer num1 = new Integer(10);
//        Integer num2 = new Integer(10);
//        System.out.println(num1 == num2);//false
//        System.out.println(num1 == new Integer(10));//false
//        System.out.println(num1.equals(num2));//true
//        System.out.println(num1.equals(new Integer(10)));//true
//        String str = "123";//String类型
//        int num = Integer.parseInt(str);
//        System.out.println(num);//123
//        String str = "123" ; // String类型
//        double num = Double.parseDouble(str) ;
//        System.out.println(num);//123.0
//        String str = "123aassa" ; // String类型
//        double num = Double.parseDouble(str) ;
//        System.out.println(num);
//        String str = "346" ; // String类型
//        boolean num = Boolean.parseBoolean(str) ;
//        System.out.println(num);//false
        String str = String.valueOf(100) ;
        System.out.println(str);//100
    }
}
//Exception in thread "main" java.lang.NumberFormatException: For input string
: "123aassa"

//class Outer{
//    private String msg = "Hello World";
//    //定义一个内部类
//    class Inner{
//        //在内部类中定义一个普通方法
//        public void print(){
//            //调用msg属性
//            System.out.println(msg);
//        }
//    }
//    //在外部类中定义一个方法，该方法负责产生内部类对象并且调用print()方法
//    public void fun(){
//        Inner in = new Inner();
//        in.print();
//    }
//}

//class Outer{
//    private String msg = "Hello World";
//    //定义如下方法取得私有属性msg
//    public String getMsg(){
//        return msg;
//    }
//    //定义当前对象的fun方法获得一个Inner的对象并调用print()方法
//    public void fun(){
//        Inner in = new Inner(this);
//        in.print();
//    }
//}
//
//class Inner{
//    private Outer out = new Outer();
//    public Inner(Outer out){
//        this.out = out;
//    }
//    public void print(){
//        System.out.println(out.getMsg());
//    }
//}
//
//public class Test{
//    public static void main(String[] args){
//        Outer out = new Outer();
//        out.fun();
//    }
//}
//////Hello World

//class Outter{
//    private static String msg = "Hello World";
//    //定义一个静态内部类
//    static class Inner{
//        public void print(){
//            System.out.println(msg);
//        }
//    }
//    //在外部类中定义一个方法，该方法负责产生内部类对象并且调用print()方法
//    public void fun(){
//        Inner in = new Inner();
//        in.print();
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        Outter.Inner in = new Outter.Inner();
//        in.print();
//    }
//}
////Hello World

class Outter{
    private static String msg = "Hello World";
    public void fun(int num){
        class Inner{
            public void print(){
                System.out.println("num:" + num);
                System.out.println("msg:" + msg);
            }
        }
        //产生内部类并调用方法
        new Inner().print();
    }
}

public class Test{
    public static void main(String[] args) {
        Outter out = new Outter();
        out.fun(22);
    }
}
//num:22
//msg:Hello World

//import java.util.Stack;
//
//public class Test {
//    Stack<Integer> stack1 = new Stack<>();
//    Stack<Integer> stack2 = new Stack<>();
//
//    public void push(int node) {
//        //入栈压入第一个栈
//        stack1.push(node);
//    }
//
//    public int pop() {
//        Integer re = null;
//        //如果栈二不为空，要把里面的元素先弹出
//        if(!stack2.empty()){
//            re = stack2.pop();
//        }else{
//            //栈二为空时，把栈一中的元素全部弹入栈二，然后再出栈
//            while(!stack1.empty()){
//                re = stack1.pop();
//                stack2.push(re);
//            }
//            //栈二中有数了就直接弹出栈二的元素
//            if(!stack2.empty()){
//                re = stack2.pop();
//            }
//        }
//        //如果栈一此时也为空，直接返回re(null)，否则返回re
//        return re;
//    }
//
//
//    public static void main(String[] args) {
//        Test s = new Test();
//        for (int i = 0; i < 100; i++) {
//            s.push(i);
//        }
//        for (int i = 0; i < 100; i++) {
//            int pop = s.pop();
//            System.out.println(pop);
//        }
//    }
//}

import java.util.Stack;
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

}

public class Test{

    public void Mirror(TreeNode root) {
        //头结点为空直接退出
        if(root == null){
            return;
        }
        //创建栈存放结点
        Stack<TreeNode> stack = new Stack<>();
        //将头节点入栈
        stack.push(root);
        //栈不为空就找栈的第一个节点
        while(!stack.isEmpty()){
            TreeNode root1 = stack.pop();
            //交换左右节点
            TreeNode tmp = root1.right;
            root1.right = root1.left;
            root1.left = tmp;
            //如果左右节点不为空就在入栈，此时左右节点已经交换，先入右节点相当于先入左节点，后出放到右节点位置
            if(root1.right != null){
                stack.push(root1.right);
            }
            if(root1.left != null){
                stack.push(root1.left);
            }
        }
    }
}