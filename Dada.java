import java.util.Scanner;

abstract class Computer{
    public void fun(){}
}

class MacBook extends Computer{
    public void fun(){
        System.out.println("I an a MacBook!");
    }
}

class MacBookPro extends Computer{
    public void fun(){
        System.out.println("I am a MacBookPro!");
    }
}

class ComputerFactory{
    private ComputerFactory(){}
    static Computer com;
    public static Computer getComputer(String ty){
        if(ty.equals("MacBook")){
            com = new MacBook();
        }else if(ty.equals("MacBookPro")){
            com = new MacBookPro();
        }
        return com;
    }
}

public class Dada{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入笔记本");
    Computer com = ComputerFactory.getComputer(sc.next());
    com.fun();
    }
}


///**
// * 咖啡冲泡
// */
//class Coffee{
//    void preparePecipe(){
//        boilWater();
//        brewCoffeeGrings();
//        pourIntoCup();
//        addSugerAndMilk();
//    }
//    public void boilWater(){
//        System.out.println("将水煮沸");
//    }
//    public void brewCoffeeGrings(){
//        System.out.println("冲泡咖啡");
//    }
//    public void pourIntoCup(){
//        System.out.println("把咖啡倒入杯子");
//    }
//    public void addSugerAndMilk(){
//        System.out.println("加牛奶和糖");
//    }
//}
//
///**
// * 咖啡茶
// */
//class Tea{
//    void preparePecipe(){
//        boilWater();
//        steepTeaBag();
//        pourIntoCup();
//        addLemon();
//    }
//    public void boilWater(){
//        System.out.println("将水煮沸");
//    }
//    public void steepTeaBag(){
//        System.out.println("冲泡茶");
//    }
//    public void pourIntoCup(){
//        System.out.println("把茶倒入杯子");
//    }
//    public void addLemon(){
//        System.out.println("加柠檬");
//    }
//}

///**
// * 饮料冲泡是一个抽象类
// */
//abstract class CaffeeOrTea{
//    /**
//     * 现在采用同一个prepareRecipe()方法处理咖啡和茶
//     * 声明final是因为不希望子类将其覆写
//     */
//    final void prepareRecipe(){
//        boilWater();
//        brew();
//        pourIntoCup();
//        addCondiment();
//    }
//
//    abstract void brew();
//    abstract void addCondiment();
//    void boilWater(){
//        System.out.println("将水煮沸");
//    }
//    void pourIntoCup(){
//        System.out.println("倒入杯中");
//    }
//}
//
//class Coffee extends CaffeeOrTea{
//    @Override
//    void brew(){
//        System.out.println("冲泡咖啡");
//    }
//
//    @Override
//    void addCondiment() {
//        System.out.println("加入糖和牛奶");
//    }
//}
//
//class Tea extends CaffeeOrTea{
//    @Override
//    void brew(){
//        System.out.println("冲泡茶");
//    }
//
//    @Override
//    void addCondiment() {
//        System.out.println("加入柠檬");
//    }
//}

///**
// * 基类声明为抽象类是为了让子类必须实现其操作
// */
//abstract class AbstractClass{
//    /**
//     * 模板方法，被声明为final，防止被改变算法顺序
//     */
//    final void templateMethoed(){
//
//    }
//
//    /**
//     * 具体延迟到子类中
//     */
//    abstract void primitiveOperation1();
//    abstract void primitiveOperation2();
//
//    /**
//     * 具体操作且共用的方法定义在超类中，可以被模板方法或子类直接使用
//     */
//    final void concreteOperation(){
//        //实现
//    }
//
//    /**
//     * 钩子方法是一类“默认不做事的方法”，子类可以视情况决定要不要覆盖他们
//     */
//    void hook(){
//        //钩子方法
//    }
//}

//import java.util.Scanner;
//
//abstract class CaffeeOrTea{
//    final void prepareRecipe(){
//        boilWater();
//        brew();
//        pourIntoCup();
//        if(customerWantCondiments()){
//            addCondiment();
//        }
//    }
//
//    abstract void brew();
//
//    abstract void addCondiment();
//
//    void boilWater(){
//        System.out.println("将水煮沸");
//    }
//    void pourIntoCup(){
//        System.out.println("倒入杯中");
//    }
//
//    /**
//     * 钩子方法，超类中通常是默认实现
//     * 子类选择性的覆写此方法
//     * @return
//     */
//    boolean customerWantCondiments(){
//        return true;
//    }
//}
//
//class Tea extends CaffeeOrTea{
//    @Override
//    void brew(){
//        System.out.println("冲泡茶");
//    }
//
//    @Override
//    void addCondiment() {
//        System.out.println("加入柠檬");
//    }
//}
//
//class Coffee extends CaffeeOrTea{
//    @Override
//    void brew(){
//        System.out.println("冲泡咖啡");
//    }
//
//    @Override
//    void addCondiment() {
//        System.out.println("加入糖和牛奶");
//    }
//
//    /**
//     * 子类覆写了钩子方法，实现自定功能
//     */
//    public boolean customerWantCondiments(){
//        String answer = getUserInput();
//        if(answer.equals("Y")){
//            return true;
//        }else{
//            return false;
//        }
//    }
//
//    private String getUserInput(){
//        String answer = null;
//        System.out.println("请问您要在咖啡中加入牛奶吗？");
//        Scanner scanner = new Scanner(System.in);
//        answer = scanner.nextLine();
//        return answer;
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        CaffeeOrTea tea = new Tea();
//        CaffeeOrTea coffee = new Coffee();
//        System.out.println("Making tea");
//        tea.prepareRecipe();
//        System.out.println("Making coffee");
//        coffee.prepareRecipe();
//    }
//}

//abstract class A{
//    public abstract void print();
//}
//
//class B extends A{
//    public void print(){
//        System.out.println("B");
//    }
//}
//
//class C extends A{
//    public void print(){
//        System.out.println("C");
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        A a = new B();
//        a.print();
//        A b = new C();
//        b.print();
//    }
//}

//interface IMessage{
//    public static final String MSG = "我是靓仔";//全局常量
//    public abstract void print();//抽象方法
//}
//
//class Sigleton{
//    private static Sigleton sig;
//    private Sigleton(){}
//    public Sigleton getInstant(){
//        if(sig == null){
//            Synchronized(Sigleton.class){
//                if(sig == null){
//                    sig = new Sigleton();
//                }
//            }
//        }
//        return sig;
//    }
//}

//class Singleton{
//    private volatile static Singleton instance = null;
//    private Singleton(){}
//    public static Singleton getInstance() {
//        if(instance==null) {
//            synchronized (Singleton.class) {
//                if(instance==null)
//                    instance = new Singleton();
//            }
//        }
//        return instance;
//    }
//}

interface IMessage{
    public static final String MSG = "I am a biter" ; // 全局常量
    public abstract void print();// 抽象方法
}
interface INews {
    public abstract String getNews() ;
}
class MessageImpl implements IMessage,INews {
    public void print() {
        System.out.println(IMessage.MSG) ;
    }
    public String getNews(){
        return IMessage.MSG ; // 访问常量都建议加上类名称
    }
}
public class Test{
    public static void main(String[] args) {
        IMessage m = new MessageImpl() ; //子类向上转型,为父接口实例化对象
        m.print() ; // 调用被子类覆写过的方法
        INews n = (INews) m ;
        System.out.println(n.getNews()) ;
    }
}