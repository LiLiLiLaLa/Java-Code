
interface ISubject{
    public void buyComputer(); //核心功能是买电脑
}

class RealSubject implements ISubject{
    @Override
    public void buyComputer() {
        System.out.println("买一台外星人电脑");
    }
}

class ProxySubject implements ISubject{
    //真实的操作
    private ISubject subject;
    public ProxySubject(ISubject subject){
        this.subject = subject;
    }

    public void prodeceComputer(){
        System.out.println("生产一台外星人电脑");
    }

    public void saleAfter(){
        System.out.println("外星人电脑售后团队");
    }

    @Override
    public void buyComputer() {
        this.prodeceComputer();//真实操作之前的准备
        this.subject.buyComputer();//强调真实业务
        this.saleAfter();//强调收尾工作
    }
}

class Factory{
    public static ISubject getInstance(){
        return new ProxySubject(new RealSubject());
    }
}

public class Code{
    public static void main(String[] args) {
        ISubject subject = Factory.getInstance();
        subject.buyComputer();
    }
}

package xpu.com.test;

import xpu.com.java.Message;

public class Demo {
    public static void main(String[] args) {
        Message message = new Message();
        message.print();
    }
}

package xpu.com.java;
//
public class Message {
    public void print(){
        System.out.println("[Message] Hello Package");
    }
}

//class Singleton{
//    public void print(){
//        System.out.println("Hello world");
//    }
//}
//
//public class SingletonTest {
//    public static void main(String[] args) {
//        Singleton singleton = null;//声明对象
//        singleton = new Singleton();//实例化对象
//        singleton.print();
//    }
//}

//class Singleton{
//    private Singleton(){}//private声明构造
//    public void print(){
//        System.out.println("Hello world");
//    }
//}

class Singleton{
    //在类的内部可以访问私有结构，所以可以在类的内部产生实例化对象
    static Singleton instance = new Singleton();
    private Singleton(){}//private声明构造方法
    public void print(){
        System.out.println("我是小可爱");
    }
}
public class SingletonTest{
    public static void main(String[] args) {
        Singleton singleton = null;//声明对象
        singleton = Singleton.instance;
        singleton.print();
    }
}
//我是小可爱

//class Singleton{
//    //在类的内部可以访问私有结构，所以可以在类的内部产生实例化对象
//    private static Singleton instance = new Singleton();
//    //私有化构造函数
//    private Singleton(){}
//    public static Singleton getInstance(){
//        return instance;
//    }
//    public void print(){
//        System.out.println("我是小可爱");
//    }
//}
//
//public class SingletonTest{
//    public static void main(String[] args) {
//        Singleton singleton = null;//声明对象
//        singleton = Singleton.getInstance();
//        singleton.print();
//    }
//}
//
////我是小可爱

////懒汉式单例（用时再new）
//class Singleton{
//    private static Singleton singleton;
//    private Singleton(){}
//    public Singleton getInstance(){
//        if(singleton == null){
//            singleton = new Singleton();
//        }
//        return singleton;
//    }
//}


////饿汉式单例（上来就new）
//class Singleton{
//    private final static Singleton SINGLETON = new Singleton();
//    private Singleton(){}
//    public Singleton getSingleton(){
//        return SINGLETON;
//    }
//}

//class Sex{
//    private String title;
//    public static final int MALE = 1;
//    private static final int FEMALE = 2;
//    private static final Sex MA = new Sex("男");
//    private static final Sex FEMA = new Sex("女");
//    private Sex(String s){
//        this.title = title;
//    }
//    public static Sex getInstance(int flag){
//        switch (flag){
//            case MALE:
//                return MA;
//            case FEMALE:
//                return FEMA;
//            default:
//                return null;
//        }
//    }
//    public String toString(){
//        return this.title;
//    }
//}

//try{
//    有可能出现异常的语句
//}[catch(异常类 对象){
//}...]
//[finally{
//    异常的出口
//}]

//public class Test{
//    public static void main(String[] args) throws Exception{
//        System.out.println(calculate(10,0));
//    }
//
//    public static int calculate(int x, int y) throws Exception{
//        return x/y;
//    }
//}

//public class Test{
//    public static void main(String[] args) {
//        try{
//            throw new Exception("抛个异常试试");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        try{
//            System.out.println(calculate(10,0));
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    public static int calculate(int x,int y) throws Exception{
//        int result = 0;
//        System.out.println("计算开始前**");
//        try{
//            result = x / y;
//        }finally {
//            System.out.println("计算结束**");
//        }
//        return result;
//    }
//}

//public class Test{
//    public static void main(String[] args) {
//        String str = "100";
//        int num = Integer.parseInt(str);
//        System.out.println(num * 2);
//    }
//}
////200

class AddException extends Exception {
    public AddException(String str) {
        super(str);
    }
}

public class Test{
    public static void main(String[] args) throws AddException {
        int num1 = 20;
        int num2 = 30;
        if(num1 + num2 == 50){
            throw new AddException("错误的操作");
        }
    }
}

package Sequence;

import java.util.Arrays;

public class SequenceArrayImpl implements Sequence {
    //存放元素的对象数组
    private Object[] elementData;
    //默认容量
    private final static int DEFAULT_CAPACITY = 10;
    //存放元素个数
    private int size;
    //线性表的最大容量
    private final static int MAX_CAPACITY = Integer.MAX_VALUE - 8;

    /**
     * 初始化存储元素数组，初始化为10
     * @param elementData 存放元素的对象数组
     */
    public SequenceArrayImpl(Object[] elementData) {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    /**
     * 传入初始化长度
     * @param capacity
     */
    public SequenceArrayImpl(int capacity){
        if(capacity > 0){
            this.elementData = new Object[capacity];
        }
    }

    /**
     * 确保没有越界
     * @param cap 传入待判断是否越界的元素个数
     */
    private void ensureCapacityInternal(int cap){
        if(cap - elementData.length > 0) {
            //此时数组长度小于待存放元素个数，需要扩容
            grow(cap);
        }
    }

    /**
     * 扩容
     * @param cap 待存放元素个数
     */
    private void grow(int cap){
        int oldCap = elementData.length;
        //二倍扩容
        int newCap = oldCap << 1;
        if(cap - newCap > 0) {
            //扩容后仍旧不能存放
            newCap = cap;
        }
        if(newCap - MAX_CAPACITY > 0){
            //超出最大值
            throw new IndexOutOfBoundsException("线性表超出最大值");
        }
        //数组扩容，将原数组的内容拷贝到新的扩容后的数组
        elementData = Arrays.copyOf(elementData, newCap);
    }

    @Override
    public void add(Object data) {
        //首先判断添加元素是否会导致数组越界
        //若越界先扩容而后存储
        ensureCapacityInternal(size + 1);
        elementData[size ++] = data;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    /**
     * 判断索引是否合法
     * @param index
     */
    private void rangeCheck(int index){
       if(index < 0 || index >= size){
           throw new IndexOutOfBoundsException("数组越界异常");
       }
    }

    @Override
    public Object get(int index) {
        //判断索引是否合法
        rangeCheck(index);
        return elementData[index];
    }

    @Override
    public boolean contains(Object data) {
        //判断是否有指定内容
        if(data == null){
            for (int i = 0; i < size; i++) {
                if(elementData[i] == null){
                    return true;
                }
            }
        }else{
            for (int i = 0; i < size; i++) {
                //反着调用equals防止数组里面本身有空值
                if(data.equals(elementData[i])){
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public Object set(int index, Object newData) {
        //判断索引是否合法
        rangeCheck(index);
        Object oldData = elementData[index];
        elementData[index] = newData;
        return oldData;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.size; i++) {
            elementData[i] = null;
        }
        this.size = 0;
    }

    @Override
    public Object[] toArray() {
        return this.elementData;
    }
}
