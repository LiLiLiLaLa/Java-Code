public class Aa{
    public static void main(String[] args){
        System.out.println(strMakeOfNum("abc"));
    }
    //判断给定字符串是否由数字组成
    public static boolean strMakeOfNum(String str){
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(!(arr[i] <= '9' && arr[i] >= '0')){
                return false;
            }
        }

        return true;
    }
}
//class Person{
//    public void print(){
//        System.out.println("Person类的print方法");
//    }
//}
//class Student extends Person{
//    public void print(){
//        //更严格的访问控制权限
//        System.out.println("Student类的print方法");
//    }
//
//    public Student(){
//        super.print();
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        new Student();
//    }
//}
//Person类的print方法

//class Person{
//    public void fun(){
//        this.print();
//    }
//    //现在父类方法使用了private定义，那么表示该方法只能被父类使用，子类无法使用，所以子类根本不知道父类有这个方法
//    private void print(){
//        System.out.println("Person类的print方法");
//    }
//}
//
//class Student extends Person{
//    //子类不知晓父类拥有print方法，所以此处的private方法只是子类定义的一个新方法而已，和父类方法无任何关系
//    public void print(){
//        System.out.println("Student的print方法");
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        new Student().fun();
//    }
//}
////Person类的print方法

//class Person{
//    private int age;
//    public Person(){
//        System.out.println("Person类的无参构造");
//    }
//    public Person(int age){
//        System.out.println("Person类的有参构造");
//        this.age = age;
//   }
//}
//
//class Student extends Person{
//    public Student(){
//        //super();
//        super(6);
//        System.out.println("Student类的无参构造");
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        Student student = new Student();
//    }
//}

//class Person{
//    public final String info;
//
//    public Person(){
//        this.info = "nana";
//    }
//}
//
//class Student extends Person{
//    //public String info = "儿子！";
//    public void print(){
//        System.out.println(super.info);
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        new Student().print();
//    }
//}
////爸爸！
////儿子！


//class Person{
//    public void print(){
//        System.out.println("爸爸");
//    }
//}
//
//class Student extends Person{
//    public void print(){
//        System.out.println("儿子");
//    }
//    public void fun(){
//        System.out.println("只有儿子有");
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        Person per = new Student();
//        System.out.println(per instanceof Student);
//        System.out.println(per instanceof Person);
//        if(per instanceof Student){
//            Student stu = (Student) per;
//            stu.fun();
//        }
//    }
//}
////true
////true
////只有儿子有

class Person{
    public void print(){
        System.out.println("我是人类");
    }
}
class Student extends Person{
    public void print(){
        System.out.println("我是学生");
    }
}
class Worker extends Person{
    public void print(){
        System.out.println("我是工人");
    }
}
public class Test{
    public static void main(String[] args) {
        whoYouAre(new Student());
        whoYouAre(new Worker());
    }
    public static void whoYouAre(Person per){
        per.print();
    }
}
//我是学生
//我是工人

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static int[] exchangeAB(int[] AB) {
        AB[0] = (AB[0]) ^ (AB[1]);
        AB[1] = (AB[0]) ^ (AB[1]);
        AB[0] = (AB[0]) ^ (AB[1]);
        return AB;
    }

    public static void print(int[] AB){
        for (int i = 0; i < AB.length; i++) {
            System.out.println(AB[i]);
        }
    }

//    public static String[] getGray(int n) {
//        //定义数组存放元素
//        ArrayList<Integer> arr = new ArrayList<Integer>(1 << n);
//        arr.add(0);
//        for (int i = 0; i < n; i++) {
//            int high_bit = 1 << i;
//            for (int j = arr.size() - 1; j >= 0; j --) {
//                //给二进制数前面加1，就用这个二进制数与二的这个二进制数的位数次方相与
//                arr.add(high_bit | arr.get(j));
//            }
//        }
//        String[] str_arr = new String[arr.size()];
//        for (int i = 0; i < arr.size(); i++) {
//            str_arr[i] = "\""+arr.get(i) + "\"";
//        }
//        return str_arr;
//    }
    public static String[] getGray(int n) {
//        while (n <= 0) {
//            return null;
//        }
        String[] result = null;
        if (n == 1) {
            result = new String[]{"0", "1"};
        } else {
            String[] strs = getGray(n - 1);
            result = new String[2 * strs.length];
            for (int i = 0; i < strs.length; i++) {
                result[i] = "0" + strs[i];
                result[result.length - 1 - i] = "1" + strs[i];
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        String[] gray = getGray(2);
        System.out.println(Arrays.toString(gray));
    }
}

//class Person<T>{
//    @Deprecated
//    public Person(){}
//    public Person(String name){}
//    @Deprecated
//    public void fun(){}
//}
//
//public class Demo{
//    @SuppressWarnings({"rawtype","unused"})
//    public static void main(String[] args) {
//        Person person = new Person();//明确标记出过期
//    }
//}

interface IMessage{
    public default void fun(){
        //追加的普通方法，所以需要有方法体
        System.out.println("Hello Tim");
    }
    //可以直接由接口名调用
    public static IMessage getInstance(){
        return new MessageImpl();
    }
    public void print();
}

class MessageImpl implements IMessage{
    @Override
    public void print() {
        System.out.println("Hello Tom");
    }
}

public class Demo{
    public static void main(String[] args) {
        IMessage iMessage = IMessage.getInstance();
        System.out.println(iMessage);
        iMessage.print();;
        iMessage.fun();
    }
}
//输出
//MessageImpl@74a14482
//Hello Tom
//Hello Tim
