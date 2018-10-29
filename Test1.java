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