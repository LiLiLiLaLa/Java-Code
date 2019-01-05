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