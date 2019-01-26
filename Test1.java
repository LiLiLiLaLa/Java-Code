/**
 * 饿汉式单例
 */
class Singleton{
    private static final Singleton SINGLETON = new Singleton();//final是为了不让别人更改
    private Singleton(){}
    public static Singleton getSingleton(){
        return SINGLETON;
    }
}

/**
 * 懒汉式单例
 */
class Singleton1{
    public static Singleton1 s;
    private Singleton1(){}
    public static Singleton1 getSingleton(){
        if(s == null){
            s = new Singleton1();
        }
        return s;
    }
}
//
public class Test1 {
    public static void main(String[] args){
        Singleton1 singleton = Singleton1.getSingleton();
        System.out.println(singleton);
        Singleton1 singleton1 = Singleton1.getSingleton();
        System.out.println(singleton1);
    }
}

//class Person{
//    private String name;
//    private int age;
//    public Person(String n,int a){
//        setName(n);
//        setAge(a);
//    }
//    public void setName(String n){
//        name = n;
//    }
//
//    public void setAge(int a) {
//        if(a > 0 && a <= 150){
//            age = a;
//        }else{
//            age = 0;
//        }
//    }
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public void getPersonInfo(){
//        System.out.println("姓名：" + getName() + "、年龄:" + getAge());
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        Person per = new Person("Tim",18);
//        Person per1 = new Person("Tim",200);
//        per.getPersonInfo();
//        per1.getPersonInfo();
//    }
//}
////姓名：Tim、年龄:18
////姓名：Tim、年龄:0

//public Person(){
//    System.out.println("===无参构造===");
//}
//public Person(String n){
//    name = n ;
//    System.out.println("===有参构造===");
//}

//class Person{
//    private String name;
//    private int age;
//
//    public Person(String name,int age){
//        name = name;
//        age = age;
//    }
//
//    public String getPersonInfo(){
//        return "姓名：" + name + "、年龄：" + age;
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        Person per = new Person("Tim",18);
//        System.out.println(per.getPersonInfo());
//    }
//}
////姓名：null、年龄：0

//class Person{
//    private String name;
//    private int age;
//
//    public Person(String name,int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getPersonInfo(){
//        return "姓名：" + name + "、年龄：" + age;
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        Person per = new Person("Tim",18);
//        System.out.println(per.getPersonInfo());
//    }
//}
////姓名：Tim、年龄：18

//class Person{
//    private String name;
//    private int age;
//
//    public Person(String name,int age){
//        this.name = name;
//        this.age = age;
//        this.print();//调用普通方法
//    }
//
//    public void print(){
//        System.out.println("**********");
//    }
//
//    public String getPersonInfo(){
//        return "姓名：" + name + "、年龄：" + age;
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        Person per = new Person("Tim",22);
//        System.out.println(per.getPersonInfo());
//    }
//}
////**********
////姓名：Tim、年龄：22

//class Person{
//    private String name;
//    private int age;
//    public Person(){
//        System.out.println("***产生一个新的Person对象***");
//    }
//    public Person(String name){
//        System.out.println("***产生一个新的Person对象***");
//        this.name = name;
//    }
//    public Person(String name,int age){
//        System.out.println("***产生一个新的Person对象***");
//        this.name = name;
//        this.age = age;
//    }
//    public String getPersonInfo(){
//        return "姓名：" + name + ",年龄："+age;
//    }
//}
// public class Test{
//     public static void main(String[] args) {
//         Person per1 = new Person();
//         Person per2 = new Person("张三");
//         Person per3 = new Person("李四",18);
//         System.out.println(per1.getPersonInfo());
//         System.out.println(per2.getPersonInfo());
//         System.out.println(per3.getPersonInfo());
//     }
// }
//姓名：null,年龄：0
//姓名：张三,年龄：0
//姓名：李四,年龄：18

//class Person{
//    private String name;
//    private int age;
//    public Person(){
//        System.out.println("***产生一个新的Person对象***");
//    }
//    public Person(String name){
//        this();//调用本类无参构造
//        this.name = name;
//    }
//    public Person(String name,int age){
//        this(name);//调用本类有参构造
//        this.age = age;
//    }
//    public String getPersonInfo(){
//        return "姓名：" + name + ",年龄："+age;
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        Person per1 = new Person();
//        Person per2 = new Person("张三");
//        Person per3 = new Person("李四",18);
//        System.out.println(per1.getPersonInfo());
//        System.out.println(per2.getPersonInfo());
//        System.out.println(per3.getPersonInfo());
//

class Person{
    public void print(){
        System.out.println("[PRINT]方法" + this);
    }
}

public class Test{
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("[MAIN]方法" + p1);
        p1.print();
        System.out.println("______________");
        Person p2 = new Person();
        System.out.println("[MAIN]方法" + p2);
        p2.print();
    }
}
//[MAIN]方法Person@1b6d3586
//[PRINT]方法Person@1b6d3586
//______________
//[MAIN]方法Person@4554617c
//[PRINT]方法Person@4554617c
