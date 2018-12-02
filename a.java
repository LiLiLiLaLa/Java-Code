String str1 = "Hello";
String str2 = "Hello";
String str3 = "Hello";
System.out.println(str1 == str2);//true
System.out.println(str1 == str3);//true
System.out.println(str2 == str3);//true
String str = new String("Hello");

//共享问题：该字符串常量并没有保存在对象池之中
String str1 = new String("hello");
String str2 = "hello";
System.out.println(str1 == str2);//false

String str1 = new String("hello").intern();
String str2 = "hello";
System.out.println(str1 == str2);//true

String str = "hello";
str = str + "world";
str += "!!!";
System.out.println(str);//hello world!!!

String str = "hello";
for(int i = 0; i < 100; i++){
	str += i;
}
Ststem.out.println(str);

//charAt()方法
String str = "hello";
System.out.println(str.charAt(0));//h
System.out.println(syr.charAt(10));//StringIndexOutOfBoundsException

String str = "helloworld";
//字符串变为字符数组
char[] data = str.toCharArray();
for(int i = 0; i < data.length; i++){
	data[i] -= 32;
	System.out.println(data[i] + "、")；
}
//字符数组变为字符串
System.out.println(new String(data));//全部转换
System.out.println(new String(data,5,5));//部分转换

String str = "helloworld";
byte[] data = str.getBytes();
for(int i = 0; i < data.length; i++){
	data[i] -= 32;
	System.out.println(data[i] + "、")；
}
System.out.println(new String(data));

//不区分大小写的比较
String str1 = "hello";
String str2 = "Hello";
System.out.println(str1.equals(str2));//false
System.out.println(str1.equalsIgnoreCase(str2));//true

System.out.println("A".compareTo("a"));//-32
System.out.println("a".compareTo("A"));//32
System.out.println("A".compareTo("A"));//0
System.out.println("AB".compareTo("AC"))；//-1
System.out.println("刘".compareTo("杨"))；

import java.lang.reflect.Constructor;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.reflect.Field;
import java.lang.String;

class Person{
    private int age;
    //public int age;
//    private String name;
////    private int age;
////    private Person(){}
////    protected Person(String name,int age){
////        this.name = name;
////        this.age = age;
////    }
////    public String toString() {}
//    public String getName(){return name;}
//    public void setName(String name){this.name = name;}
}


public class Test {
    public static void main(String[] args) throws Exception {
        Class<Person> cls = Person.class;
        //取得Field对象
        Field field = cls.getDeclaredField("age");
        //取得Person实例化对象
        Person per = cls.newInstance();
        //set&get
        field.setAccessible(true);
        per.age = 10;
//        //取得Class对象
//        Class<Person> cls = Person.class;
//        //组装方法名称
//        String setMethodName = "set"+initCap(args[0]);
//        String getMethodName = "get"+initCap(args[0]);
//        //取得Method对象
//        Method steMethod = cls.getMethod(setMethodName,String.class);
//        Method gteMethod = cls.getMethod(getMethodName);
//        //取得Person实例化对象而后调用方法
//        Person per = cls.newInstance();
//        ...
////        Class<Person> cls = Person.class;
////        //取得有参构造
////        Constructor constructor = cls.getConstructor(String.class,int.
class);
////        //实例化对象
////        //相当于调用Person per = new Person("邹鸡儿"，18)；
////        Person per = (Person) constructor.newInstance("邹鸡儿",18);
////        System.out.println(per);
    }
}
