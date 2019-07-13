//public class Test{
//    public static void main(String[] args) {
//        int line = 10;
//        for(int x = 0; x < line; x ++){
//            for (int y = 0; y < line; y ++){
//                System.out.print(" ");
//            }
//            for(int z = 0; z < x; z ++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//
//if(布尔表达式){
//    //条件满足时执行代码
//        }else{
//    条件不满足时执行代码
//        }
//
//
//if(布尔表达式1){
//    //条件1满足时执行代码
//        }else if(布尔表达式2){
//    //条件2满足时执行代码
//        }....
//         else{
//             //以上条件均不满足时执行代码
//        }

//switch(数字|枚举|字符|字符串){
//    case 内容1:{
//        内容1满足时执行代码;
//        break;
//        }
//    case 内容2:{
//        内容2满足时执行代码;
//        break;
//        }
//    case 内容3:{
//        内容3满足时执行代码;
//        break;
//        }
//    .....
//    default:{
//         以上内容均不满足时执行语句;
//         break;
//         }
//}

//import java.io.IOException;
//
//public class Test{
//    public static void main(String[] args) throws IOException {
//        System.out.println("请输入字符：");
//        char x = (char) System.in.read();
//        switch(x){
//            case 'a':{
//                System.out.println("邹大炮是猪");
//                break;
//            }
//            case 'b':{
//                System.out.println("邹大炮不是猪");
//                break;
//            }
//            default:{
//                System.out.println("邹大炮原来是瓜娃子");
//                break;
//            }
//        }
//    }
//}
////请输入字符：
////a
////邹大炮是猪
//
////请输入字符：
////b
////邹大炮不是猪
////邹大炮原来是瓜娃子

//while(控制循环的条件判断){
//    循环语句;
//    修改条件内容;
//        }
//
//do{
//   循环语句;
//   修改条件内容;
//        }while(控制循环的条件判断);

//for(循环初始化;循环结束的条件判断;修改条件内容){
//    循环体;
//        }

//public class Test{
//    public static void main(String[] args) {
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + "*" + i + "=" + i*j + "\t");
//            }
//            System.out.println();
//        }
//    }
//}
//输出
//1*1=1
//1*2=2	2*2=4
//1*3=3	2*3=6	3*3=9
//1*4=4	2*4=8	3*4=12	4*4=16
//1*5=5	2*5=10	3*5=15	4*5=20	5*5=25
//1*6=6	2*6=12	3*6=18	4*6=24	5*6=30	6*6=36
//1*7=7	2*7=14	3*7=21	4*7=28	5*7=35	6*7=42	7*7=49
//1*8=8	2*8=16	3*8=24	4*8=32	5*8=40	6*8=48	7*8=56	8*8=64
//1*9=9	2*9=18	3*9=27	4*9=36	5*9=45	6*9=54	7*9=63	8*9=72	9*9=81

//public static 方法返回值类型 方法名称(参数类型 参数1，参数类型 参数2....参数类型 参数n){
//    方法体代码;
//    return 返回值;
//}

//public class Test{
//    public static void main(String[] args) {
//        System.out.println(add(5,5));
//        System.out.println(add(5,5,555));
//    }
//    public static int add(int x,int y){
//        return x + y;
//    }
//    public static int add(int x,int y,int z){
//        return x + y + z;
//    }
//}
////10
////565

//public class Test{
//    public static void main(String[] args) {
//        myPrint(1);
//        myPrint(2);
//        myPrint(3);
//        myPrint(4);
//    }
//    public static void myPrint(int x){
//        if(x == 2){
//            return;//若执行此语句，则此语句后面的代码不能被执行，方法调用结束
//        }else{
//            System.out.println(x);
//        }
//    }
//    //输出
//    //1
//    //3
//    //4
//}

////递归实现1到100的叠加
//public class Test{
//    public static void main(String[] args) {
//        System.out.println(sum(100));
//    }
//    public static int sum(int num){
//        if(num == 1){
//            return 1;
//        }else{
//            return num + sum(num - 1);
//        }
//    }
//}
////5050

////数据类型[] 数组名称 = new 数据类型[长度];
//
//public class Test{
//    public static void main(String[] args) {
//        //开辟一个长度为3的整型数组
//        //int[] x = new int[3];
//        int[] x = null;
//        x = new int[3];
//        System.out.println(x.length);
//        //给数组放入值
//        x[0] = 1;
//        x[1] = 3;
//        x[2] = 5;
//        for (int i = 0; i < x.length; i++) {
//            //通过循环控制索引访问数组元素
//            System.out.println(x[i]);
//        }
//    }
//}
////输出
////3
////1
////3
////5

//public class Test{
//    public static void main(String[] args) {
//        int[] x = null;
//        int[] temp = null;
//        x = new int[3];
//        //System.out.println(x.length);
//        x[0] = 1;
//        x[1] = 3;
//        x[2] = 5;
//        //如果要出现引用传递，不要出现[]
//        temp = x;
//        //修改数据
//        temp[0] = 99;
//        System.out.println(x[0]);//99
//    }
//}

//public class Test{
//    public static void main(String[] args) {
//        int[] x = new int[]{1,2,5,55};
//        System.out.println(x.length);
//        for (int i = 0; i < x.length; i++) {
//            System.out.println(x[i]);
//        }
//    }
//}
////输出
////4
////1
////2
////5
////55

public class Test{
    public static void main(String[] args) {
        //数组并不是等列数组
        int[][] data = new int[][]{
                {1,2,3},{4,5},{6,7,8,9}
        };
        //在进行输出时要使用双循环
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("data["+i+"]["+j+"]="+data[i][j]);
            }
        }
    }
}


//输出
//data[0][0]=1
//data[0][1]=2
//data[0][2]=3
//data[1][0]=4
//data[1][1]=5
//data[2][0]=6
//data[2][1]=7
//data[2][2]=8
//data[2][3]=9

public class Test{
    public static void main(String[] args) {
        int[] data = init();
        printArray(data);
    }

    public static int[] init(){
        return new int[]{1,2,3,4};
    }

    public static void printArray(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
//输出
//1
//2
//3
//4

//public class Test{
//    public static void main(String[] args) {
//        int[] data = init();
//        printArray(data);
//    }
//
//    public static int[] init(){
//        return new int[]{1,2,3,4};
//    }
//
//    public static void printArray(int[] data){
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
//    }
//}
////输出
////1
////2
////3
////4
//public class Test{
//    public static void main(String[] args) {
//        int[] data = new int[]{1,2,3,4};
//        printArray(data);
//    }
//    public static void printArray(int[] data){
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
//    }
//}
////1
////2
////3
////4
//public class Test{
//    public static void main(String[] args) {
//        int[] data = init();
//        bigger(data);
//        printArray(data);
//    }
//    //定义一个数组返回方法
//    public static int[] init(){
//        return new int[]{1,2,3,4};
//    }
//    //定义一个数组打印方法
//    public static void printArray(int[] data){
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
//    }
//    //定义方法将数组中每个值扩大5倍
//    public static void bigger(int[] data){
//        for (int i = 0; i < data.length; i++) {
//            data[i] = data[i] * 5;
//        }
//    }
//}
////5
////10
////15
////20
public class Test{
    public static void main(String[] args) {
        int[] intData = new int[]{1,62,31,24};
        char[] charData = new char[]{'a','z','b','d'};
        java.util.Arrays.sort(intData);
        java.util.Arrays.sort(charData);
        printArray(intData);
        printArray(charData);
    }
    public static void printArray(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
    //方法重载
    public static void printArray(char[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
//1
//24
//31
//62
//a
//b
//d
//z

//public class Test{
//    public static void main(String[] args) {
//        int[] data = init();
//        printArray(data);
//    }
//
//    public static int[] init(){
//        return new int[]{1,2,3,4};
//    }
//
//    public static void printArray(int[] data){
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
//    }
//}
////输出
////1
////2
////3
////4
//public class Test{
//    public static void main(String[] args) {
//        int[] data = new int[]{1,2,3,4};
//        printArray(data);
//    }
//    public static void printArray(int[] data){
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
//    }
//}
////1
////2
////3
////4
//public class Test{
//    public static void main(String[] args) {
//        int[] data = init();
//        bigger(data);
//        printArray(data);
//    }
//    //定义一个数组返回方法
//    public static int[] init(){
//        return new int[]{1,2,3,4};
//    }
//    //定义一个数组打印方法
//    public static void printArray(int[] data){
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
//    }
//    //定义方法将数组中每个值扩大5倍
//    public static void bigger(int[] data){
//        for (int i = 0; i < data.length; i++) {
//            data[i] = data[i] * 5;
//        }
//    }
//}
////5
////10
////15
////20
//public class Test{
//    public static void main(String[] args) {
//        int[] intData = new int[]{1,62,31,24};
//        char[] charData = new char[]{'a','z','b','d'};
//        java.util.Arrays.sort(intData);
//        java.util.Arrays.sort(charData);
//        printArray(intData);
//        printArray(charData);
//    }
//    public static void printArray(int[] data){
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
//    }
//    //方法重载
//    public static void printArray(char[] data){
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
//    }
//}
////1
////24
////31
////62
////a
////b
////d
////z
import java.util.Arrays;

public class Test{
    public static void main(String[] args){
        int[] original = new int[]{1,3,5,7,9};
        int[] result = Arrays.copyOf(original,10);
        for (int temp : result) {
            System.out.println(temp);
        }
    }
}
//1
//3
//5
//7
//9
//0
//0
//0
//0
//0

//1
//55
//66
//77
//5
//6
//7
//8
//9

//class 类名称{
//    属性1;
//    属性2;
//    属性n...;
//
//    方法1(){}
//    方法2(){}
//    ...
//    方法n(){}
//}

//class Person{
//    public String name;
//    public int age;
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
//        Person per1 = new Person("邹大",18);
//        System.out.println(per1.name);
//        System.out.println(per1.age);
//        System.out.println(per1.getPersonInfo());
//    }
//}
////邹大
////18
////姓名：邹大、年龄：18
//class Person{
//    String name;
//    int age;
//    public void getPersonInfo(){
//        System.out.println("姓名：" + name + "、年龄：" + age);
//    }
//}
class Person{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void getPersonInfo(){
        System.out.println("姓名：" + name + "、年龄：" + age);
    }
}

public class Test {
    public static void main(String[] args) {
        Person per = new Person();
        per.setName("tim");
        per.setAge(18);
        per.getPersonInfo();
    }
}
//姓名：tim、年龄：18

package xpu.edu;

//class MyThread implements Runnable {
//    private int ticket = 10 ; // 一共十张票
//    @Override
//    public void run() {
//        while(this.ticket>0) { // 还有票
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//// TODO Auto-generated catch block
//                e.printStackTrace();
//            } // 模拟网络延迟
//            System.out.println(Thread.currentThread().getName()+",还有" +this.ticket --
//                    +" 张票");
//        }
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        MyThread mt = new MyThread() ;
//        new Thread(mt,"黄牛A").start();
//        new Thread(mt,"黄牛B").start();
//        new Thread(mt,"黄牛C").start();
//    }
//}
////黄牛C,还有10 张票
////黄牛B,还有10 张票
////黄牛A,还有9 张票
////黄牛A,还有8 张票
////黄牛C,还有8 张票
////黄牛B,还有7 张票
////黄牛B,还有6 张票
////黄牛C,还有6 张票
////黄牛A,还有6 张票
////黄牛B,还有5 张票
////黄牛A,还有5 张票
////黄牛C,还有4 张票
////黄牛A,还有3 张票
////黄牛C,还有3 张票
////黄牛B,还有3 张票
////黄牛A,还有2 张票
////黄牛B,还有1 张票
////黄牛C,还有2 张票

//class MyThread implements Runnable {
//    private int ticket = 1000 ;
//    @Override
//    public void run() {
//        //确保票能卖完
//        for (int i = 0; i < 1000; i++) {
//            // 在同一时刻，只允许一个线程进入代码块处理
//            synchronized(this) { // 表示为程序逻辑上锁
//                if(this.ticket>0) { // 还有票
//                    try {
//                        Thread.sleep(20);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    } // 模拟网络延迟
//                    System.out.println(Thread.currentThread().getName()+",还有" +this.ticket -- +" 张票");
//                }else {
//                    break;
//                }
//            }
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        MyThread mt = new MyThread() ;
//        Thread t1 = new Thread(mt,"黄牛A");
//        Thread t2 = new Thread(mt,"黄牛B");
//        Thread t3 = new Thread(mt,"黄牛C");
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.MAX_PRIORITY);
//        t3.setPriority(Thread.MAX_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//}

//class MyThread implements Runnable {
//    private int ticket = 1000; // 一共十张票
//    @Override
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            this.sale();
//        }
//    }
//    public synchronized void sale() {
//        if (this.ticket > 0) { // 还有票
//            try {
//                Thread.sleep(20);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } // 模拟网络延迟
//            System.out.println(Thread.currentThread().getName() + ",还有" + this.ticket-- + " 张票");
//        }
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        MyThread mt = new MyThread();
//        Thread t1 = new Thread(mt, "黄牛A");
//        Thread t2 = new Thread(mt, "黄牛B");
//        Thread t3 = new Thread(mt, "黄牛C");
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.MAX_PRIORITY);
//        t3.setPriority(Thread.MAX_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//}

//class Sync {
//    public synchronized void test() {
//        System.out.println("test方法开始，当前线程为 "+Thread.currentThread().getName());
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("test方法结束，当前线程为 "+Thread.currentThread().getName());
//    }
//}
//class MyThread extends Thread {
//    @Override
//    public void run() {
//        Sync sync = new Sync() ;
//        sync.test();
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        for (int i = 0; i < 3 ; i++) {
//            Thread thread = new MyThread() ;
//            thread.start();
//        }
//    }
//}
////test方法开始，当前线程为 Thread-0
////test方法开始，当前线程为 Thread-1
////test方法开始，当前线程为 Thread-2
////test方法结束，当前线程为 Thread-2
////test方法结束，当前线程为 Thread-1
////test方法结束，当前线程为 Thread-0

//class Sync {
//    public void test() {
//        synchronized(this) {
//            System.out.println("test方法开始，当前线程为 " +
//                    Thread.currentThread().getName());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("test方法结束，当前线程为 " +
//                    Thread.currentThread().getName());
//        }
//    }
//}
//class MyThread extends Thread {
//    private Sync sync ;
//    public MyThread(Sync sync) {
//        this.sync = sync ;
//    }
//    @Override
//    public void run() {
//        this.sync.test();
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Sync sync = new Sync() ;
//        for (int i = 0; i < 3 ; i++) {
//            Thread thread = new MyThread(sync) ;
//            thread.start();
//        }
//    }
//}
////test方法开始，当前线程为 Thread-0
////test方法结束，当前线程为 Thread-0
////test方法开始，当前线程为 Thread-2
////test方法结束，当前线程为 Thread-2
////test方法开始，当前线程为 Thread-1
////test方法结束，当前线程为 Thread-1

//class Sync {
//    public void test() {
//        synchronized(Sync.class) {
//            System.out.println("test方法开始，当前线程为 " +
//                    Thread.currentThread().getName());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("test方法结束，当前线程为 " +
//                    Thread.currentThread().getName());
//        }
//    }
//}
//class MyThread extends Thread {
//    @Override
//    public void run() {
//        Sync sync = new Sync() ;
//        sync.test();
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        for (int i = 0; i < 3 ; i++) {
//            Thread thread = new MyThread() ;
//            thread.start();
//        }
//    }
//}
////test方法开始，当前线程为 Thread-0
////test方法结束，当前线程为 Thread-0
////test方法开始，当前线程为 Thread-2
////test方法结束，当前线程为 Thread-2
////test方法开始，当前线程为 Thread-1
////test方法结束，当前线程为 Thread-1

//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//class MyThread implements Runnable {
//    private int ticket = 500;
//    private Lock ticketLock = new ReentrantLock() ;
//    @Override
//    public void run() {
//        for (int i = 0; i < 500; i++) {
//            ticketLock.lock();
//            try {
//                if (this.ticket > 0) { // 还有票
//                    try {
//                        Thread.sleep(20);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    } // 模拟网络延迟
//                    System.out.println(Thread.currentThread().getName() + ",还有" +
//                            this.ticket-- + " 张票");
//                }
//            } finally {
//                ticketLock.unlock();
//            }
//        }
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        MyThread mt = new MyThread();
//        Thread t1 = new Thread(mt, "黄牛A");
//        Thread t2 = new Thread(mt, "黄牛B");
//        Thread t3 = new Thread(mt, "黄牛C");
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.MAX_PRIORITY);
//        t3.setPriority(Thread.MAX_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//}

//public class Test {
//    private static String commStr;
//    private static ThreadLocal<String> threadStr = new ThreadLocal<String>();
//    public static void main(String[] args) {
//        commStr = "main";
//        threadStr.set("main");
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                commStr = "thread";
//                threadStr.set("thread");
//            }
//        });
//        thread.start();
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(commStr);
//        System.out.println(threadStr.get());
//    }
//}
////thread
////main

//private void set(ThreadLocal key, Object value) {
//        Entry[] tab = table;
//        int len = tab.length;
//        // 计算要存储的索引位置
//        int i = key.threadLocalHashCode & (len-1);
//        // 循环判断要存放的索引位置是否已经存在 Entry，若存在，进入循环体
//        for (Entry e = tab[i];
//        e != null;
//        e = tab[i = nextIndex(i, len)]) {
//            ThreadLocal k = e.get();
//            // 若索引位置的 Entry 的 key 和要保存的 key 相等，则更新该 Entry 的值
//            if (k == key) {
//                e.value = value;
//                return;
//            }
//            // 若索引位置的 Entry 的 key 为 null（key 已经被回收了），表示该位置的 Entry 已经无效，用要保存的键值替换该位置上的 Entry
//            if (k == null) {
//                replaceStaleEntry(key, value, i);
//                return;
//            }
//        }
//        // 要存放的索引位置没有 Entry，将当前键值作为一个 Entry 保存在该位置
//        tab[i] = new Entry(key, value);
//        // 增加 table 存储的条目数
//        int sz = ++size;
//        // 清除一些无效的条目并判断 table 中的条目数是否已经超出阈值
//        if (!cleanSomeSlots(i, sz) && sz >= threshold)
//        rehash(); // 调整 table 的容量，并重新摆放 table 中的 Entry
//}

//private void rehash() {
//        // 先清除无效 Entry
//        expungeStaleEntries();
//        // 判断当前 table 中的条目数是否超出了阈值的 3/4
//        if (size >= threshold - threshold / 4)
//        resize();
//}

//private Entry getEntry(ThreadLocal key) {
//        // 使用指定的 key 的 HashCode 计算索引位置
//        int i = key.threadLocalHashCode & (table.length - 1);
//        // 获取当前位置的 Entry
//        Entry e = table[i];
//        // 如果 Entry 不为 null 且 Entry 的 key 和 指定的 key 相等，则返回该 Entry
//        // 否则调用 getEntryAfterMiss(ThreadLocal key, int i, Entry e) 方法
//        if (e != null && e.get() == key)
//            return e;
//        else
//            return getEntryAfterMiss(key, i, e);
//}

//private Entry getEntryAfterMiss(ThreadLocal key, int i, Entry e) {
//        Entry[] tab = table;
//        int len = tab.length;
//        // 索引位置上的 Entry 不为 null 进入循环，为 null 则返回 null
//        while (e != null) {
//            ThreadLocal k = e.get();
//            // 如果 Entry 的 key 和指定的 key 相等，则返回该 Entry
//             if (k == key)
//                return e;
//             // 如果 Entry 的 key 为 null （key 已经被回收了），清除无效的 Entry
//            // 否则获取下一个位置的 Entry，循环判断
//            if (k == null)
//                expungeStaleEntry(i);
//            else
//                i = nextIndex(i, len);
//            e = tab[i];
//        }
//        return null;
//}

//public class Test{
//    public static void main(String[] args) throws InterruptedException {
//        Object object = new Object();
//        synchronized (object) {
//            System.out.println("等待中...");
//            object.wait();
//            System.out.println("等待已过...");
//        }
//        System.out.println("main方法结束...");
//    }
//}

//class MyThread implements Runnable {
//    private boolean flag;
//    private Object obj;
//    public MyThread(boolean flag, Object obj) {
//        super();
//        this.flag = flag;
//        this.obj = obj;
//    }
//    public void waitMethod() {
//        synchronized (obj) {
//            try {
//                while (true) {
//                    System.out.println("wait()方法开始.. " +
//                            Thread.currentThread().getName());
//                    obj.wait();
//                    System.out.println("wait()方法结束.. " +
//                            Thread.currentThread().getName());
//                    return;
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    public void notifyMethod() {
//        synchronized (obj) {
//            try {
//                System.out.println("notify()方法开始.. " +
//                        Thread.currentThread().getName());
//                obj.notify();
//                System.out.println("notify()方法结束.. " +
//                        Thread.currentThread().getName());
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    @Override
//    public void run() {
//        if (flag) {
//            this.waitMethod();
//        } else {
//            this.notifyMethod();
//        }
//    }
//}
//public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        Object object = new Object();
//        MyThread waitThread = new MyThread(true, object);
//        MyThread notifyThread = new MyThread(false, object);
//        Thread thread1 = new Thread(waitThread, "wait线程");
//        Thread thread2 = new Thread(notifyThread, "notify线程");
//        thread1.start();
//        Thread.sleep(1000);
//        thread2.start();
//        System.out.println("main方法结束!!");
//    }
//}
////wait()方法开始.. wait线程
////main方法结束!!
////notify()方法开始.. notify线程
////notify()方法结束.. notify线程
////wait()方法结束.. wait线程

//class MyThread implements Runnable {
//    private boolean flag;
//    private Object obj;
//    public MyThread(boolean flag, Object obj) {
//        super();
//        this.flag = flag;
//        this.obj = obj;
//    }
//    public void waitMethod() {
//        synchronized (obj) {
//            try {
//                while (true) {
//                    System.out.println("wait()方法开始.. " +
//                            Thread.currentThread().getName());
//                    obj.wait();
//                    System.out.println("wait()方法结束.. " +
//                            Thread.currentThread().getName());
//                    return;
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    public void notifyMethod() {
//        synchronized (obj) {
//            try {
//                System.out.println("notify()方法开始.. " +
//                        Thread.currentThread().getName());
//                obj.notify();
//                System.out.println("notify()方法结束.. " +
//                        Thread.currentThread().getName());
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    @Override
//    public void run() {
//        if (flag) {
//            this.waitMethod();
//        } else {
//            this.notifyMethod();
//        }
//    }
//}
//public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        Object object = new Object();
//        MyThread waitThread = new MyThread(true, object);
//        MyThread notifyThread = new MyThread(false, object);
//        Thread thread1 = new Thread(waitThread, "wait线程");
//        Thread thread2 = new Thread(notifyThread, "notify线程");
//        thread1.start();
//        Thread.sleep(1000);
//        thread2.start();
//        System.out.println("main方法结束!!");
//    }
//}
////wait()方法开始.. wait线程
////main方法结束!!
////notify()方法开始.. notify线程
////notify()方法结束.. notify线程
////wait()方法结束.. wait线程

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

class Goods {
    //商品名
    private String goodName;
    //商品库存
    private int count;

    //生产方法
    public synchronized void set(String goodName) throws InterruptedException {
        if (this.count > 0) {
            System.out.println("还有库存");
            wait();
        }
        this.goodName = goodName;
        this.count = count + 1;
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
        System.out.println(toString());
        //生产完商品之后通知消费者可以消费了
        notifyAll();
    }




    //消费方法
    public synchronized void get() throws InterruptedException {
        //此时如果还没有生产好的商品，就先等生产者生产
        if(this.count == 0){
            System.out.println("商品已售罄，请等待");
            wait();
        }
        //每次消费一个产品
        this.count = this.count - 1;
        sleep(1000);
        System.out.println(Thread.currentThread().getName());
        System.out.println("消费" + toString());
        //消费完商品可以通知生产者继续生产了
        notifyAll();
    }


    @Override
    public String toString() {
        return "Goods{" + "goodName='" + goodName + '\'' + ", count=" + count + '}';
    }
}

1.第一题：两数之和
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //HashMap的键值对，前一位为数组真实值作为key，数组索引下标作为value存入
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        //从前往后将元素与指定值做减法，比对HashMap中是否有对应元素，有的话输出，没有继续往后走
        for(int i = 0; i < nums.length; i ++){
            //判断HashMap中是否存在与num[i]对应的元素
            if(map.containsKey(target - nums[i])){
                //如果存在
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            //如果不存在，将当前元素放入HashMap
            map.put(nums[i], i);
        }
        return result;
    }
}

2.第二题：两数相加
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //排除空链表影响
        if(l1 == null){
            l1 = new ListNode(0);
        }
        if(l2 == null){
            l2 = new ListNode(0);
        }
        //恰好两个链表一起加完
        if(l1.next == null && l2.next == null){
            int val = l1.val + l2.val;
            //如果发生进位
            if(val > 9){
                //逆序放入
                ListNode node = new ListNode(val % 10);
                node.next = new ListNode(val / 10);
                return node;
            }else{
                //如果不发生进位
                return new ListNode(val);
            }
        }else{
            //l1不为空l2不为空l1l2均不为空
            int val = l1.val + l2.val;
            //如果需要进位
            if(val > 9){
                val = val % 10;
                //当l1的下一个值不为空或l1l2的下一个值均不为空时进位值加给l1的下一位
                if(l1.next != null){
                    l1.next.val ++;
                }else if(l2.next != null){
                    //当l1的下一个值为空，将进位的值加给l2的下一个值
                    l2.next.val ++;
                }
            }
            //如果不需要进位
            ListNode node = new ListNode(val);
            //链表还不为空则继续进行合并
            node.next = addTwoNumbers(l1.next, l2.next);
            return node;
        }
    }
}

3.第三题：无重复字符的最长子串
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        int left = 0;
        int right = 0;
        //转成数组
        char[] chars = s.toCharArray();
        //定义HashMap存放字母和在数组中的索引
        Map<Character,Integer> map = new HashMap<>();
        while(right < chars.length && left < chars.length){
            //当遇到重复元素
            if(map.containsKey(chars[right])){
                //判断新的重复是不是在上次重复范围之外
                if(left < map.get(chars[right]) + 1){
                    left = map.get(chars[right]) + 1;
                }
            }
            //没遇到重复元素
            map.put(chars[right], right ++);
            len = Math.max(len, right - left);
        }
        return len;
    }
}

4.第四题：查找两个有序数组的中位数
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 =  nums1.length;        
        int len2 = nums2.length;
        int size = len1 + len2;
        if(size % 2 == 1){
            return finfK(nums1, 0, len1, nums2, 0, len2, size / 2 + 1);
        }else{
            return (finfK(nums1, 0, len1, nums2, 0, len2, size / 2 + 1) + finfK(nums1, 0, len1, nums2, 0, len2, size / 2)) / 2;
        }
    }
    
    //定义方法，在两个有序数组中查找第K个数
    public double finfK(int[] nums1, int start1, int len1, int[] nums2, int start2, int len2, int k){
        //规定短的数组为nums1
        if((len1 - start1) > (len2 - start2)){
            return finfK(nums2, start2, len2, nums1, start1, len1, k);
        }
        //如果短的数组为空，直接在长的数组中返回下标K-1就是第K个元素
        if(len1 - start1 == 0){
            return nums2[k - 1];
        }
        //两个有序数组中第1个数就是二个数组中两个下标1的数的较小一个
        if(k == 1){
            return Math.min(nums1[start1], nums2[start2]);
        }
        //较短的数组可能越界，p表示该数组应该查找到的位置
        int p = start1 + Math.min(len1 - start1, k / 2);
        //较长数组中查找K- 1个数的剩余部分，查找到下标为q的位置
        int q = start2 + k - p + start1;
        //较小的部分被丢弃
        if(nums1[p - 1] < nums2[q - 1]){
            return finfK(nums1, p , len1, nums2, start2, len2, k - p + start1);
        }else if(nums1[p - 1] > nums2[q - 1]){
            return finfK(nums1, start1 , len1, nums2, q, len2, k - q + start2);
        }else{
            return nums1[p - 1];
        }
    }
}

15.第十五题：三数之和
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //定义数组，每个数组里面存放一个List放置相加为0的三个元素
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        //将数组排序，相同的元素连续出现，这样容易排除重复情况
        Arrays.sort(nums);
        //固定一个元素，另外两个元素在其后部分查找，在固定元素之后只剩一个元素时停止查找
        for(int i = 0; i < nums.length - 1; i ++){
            //第一个元素遇见重复的元素直接往后走
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            //定义左右两个元素下标作为查找剩余两个数的索引
            int left = i + 1;
            int right = nums.length - 1;
            //当左小于右说明后面的元素还没走完
            while(left < right){
                //首元素固定，有序队列中，相加大于0，右下标左移，如果小于0，坐下标右移
                if(nums[i] + nums[left] + nums[right] > 0){
                    right --;
                }else if(nums[i] + nums[left] + nums[right] < 0){
                    left ++;
                }else{
                    //放入数组中
                    //Arrays调用asList将参数线性存放返回一个List
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left ++;
                    right --;
                    //判断
                    while(left < right && nums[left] == nums[left - 1]){
                        left ++;
                    }
                    while(left < right && nums[right] == nums[right + 1]){
                        right --;
                    }
                }
            }
        }
        return list;
    }
}

16.第十六题：最接近的三数之和
class Solution {
    public int threeSumClosest(int[] nums, int target) {
         // 先排序，这样固定一个数，另外两个数采用头尾指针法会更快
        Arrays.sort(nums);
        // 定义一个数，用于不断刷新保存最接近目标的值
        int closeNum = nums[0] + nums[1] + nums[2];
        //固定第一个数
        for (int i = 0; i < nums.length - 2; i++) {
            //剩下两个数一个从固定数的下一位往后，一个从数组最后往前
            int l = i + 1, r = nums.length - 1;
            while (l < r){
                int threeSum = nums[l] + nums[r] + nums[i];
                //刷新closeNum
                if (Math.abs(threeSum - target) < Math.abs(closeNum - target)) {
                    closeNum = threeSum;
                }
                //当最接近目标值的数大于目标数，那么数组尾部指针前移找更小的，反之则前面的指针往后移动找更大的组合
                if (threeSum > target) {
                    r--;
                } else if (threeSum < target) {
                    l++;
                } else {
                    // 如果已经等于target的话, 肯定是最接近的，直接输出
                    return target;
                }

            }

        }
        return closeNum;
    }
}

147.第一百四十七题：对链表进行插入排序
class Solution {
    public ListNode insertionSortList(ListNode head) {
    //空链表或只有一个结点时不用排序直接返回
        if(head == null || head.next == null){
            return head;
        }
        //定义一个新的链表头部
        ListNode pre = new ListNode(-1);
        //用临时变量存放新链表的头部
        ListNode ans = pre;
        //cur在原链表向后遍历作为每次即将新插入的节点
        ListNode cur = head;
        //内次取出原链表中一个节点插入新的链表
        while(cur != null){
            //每次循环将pre重置为头结点，保证每次从前往后遍历
            pre = ans;
            //当pre.next.val大于等于cur.val或者pre.next为null时结束这一趟遍历，否则pre要不断后移
            while(pre.next != null && pre.next.val < cur.val){
                pre= pre.next;
            }
            //此时pre要么走到了最后，要么找到了val大于等于cur的节点，不管如何都应该把cur插入到pre后
            //先保存cur的下一个节点，保证原链表走到哪里被记住
            ListNode tmp = cur.next;
            //将cur插入到pre后面
            cur.next = pre.next;
            pre.next = cur;
            //cur回归原链表
            cur = tmp;
        }
        return ans.next;
    }
}

396.第三百九十六题：旋转函数
class Solution {
    public int maxRotateFunction(int[] A) {
        //这个题主要从数学角度，找规律
        //arr={a,b,c,d}
        //F(0) = 0a+1b+2c+3d
        //F(1) = 0d+1a+2b+3c
        //F(2) = 0c+1d+2a+3b
        //F(3) = 0b+1c+2d+3a
        //sum = a+b+c+d
        //F(1) = F(0)+a+b+c-3d = F(0)+sum-4d
        //F(2) = F(1)+d+a+b-3c = F(1)+sum-4c
        //F(3) = F(2)+c+d+a-3b = F(2)+sum-4b
        //得出F(k) = F(k-1)+sum-arr.length*arr[a.length-k]
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        //先计算F(0)
        int data = 0;
        for (int i = 0; i < A.length; i++) {
            data += i * A[i];
        }
        //默认max = F(0)
        int max = data;
        for (int k = 1; k < A.length; k++) {
            data = data + sum - (A.length) * A[A.length - k];
            //max取较大一个
            max = (max > data) ? max : data;
        }
        return max;
    }
}

543.第五百四十三题：二叉树的直径
class Solution {
    //全局变量保留最大的直径值
    private int res =0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter(root);
        return res;
    }

    public int maxDiameter(TreeNode root)
    {
        if (root == null){
            return 0;
        }
      //递归左字数和右子树
        int r = maxDiameter(root.right);
        int l = maxDiameter(root.left);
        //更新直径
        res = Math.max(res,l+r);
        //返回的是该节点所在的层数，由下往上，左右子树层数大的一个再加一是当前节点层数
        return Math.max(l,r)+1;
    }
}

763.第七百六十三题：划分字母区间
class Solution {
    public List<Integer> partitionLabels(String S) {
        //当字符串未复制时直接返回空的List
        if (S == null || S.length() == 0) {
            return Collections.emptyList();
        }
        //index维护各字母的最大索引位置
        int[] index = new int[26];
        for (int i = 0; i < S.length(); i++) {
            //同一个字母减'a'的值相等，所以会映射到index数组的相同位置，然后index存入刷新的i，那么index中保存的是每个字母在字符串中最靠后的索引位置
            index[S.charAt(i) - 'a'] = i;
        }
        //保存当前搜索区间的最大索引
        int maxIndex = 0;
        //保存当前搜索区间的开始索引
        int start = 0;
        //结果集
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < S.length(); i++) {
            //第一个字母最后出现的位置之前所有字母在字符串中最靠后位置就是一个完整的分隔
            //maxIndex保存本此搜索区间的最大索引
            maxIndex = Math.max(maxIndex, index[S.charAt(i) - 'a']);
            //如果当前位置就是索引区间最大值，则将当前索引减去本区间开始位置再+1就是本区间字母个数
            if (i == maxIndex) {
                list.add(maxIndex - start + 1);
                //当前位置后移成为新的搜索期间
                start = i + 1;
            }
        }
        return list;
    }
}

837.第八百三十七题：新21点
class Solution {
    public double new21Game(int N, int K, int W) {
        if(K == 0) {
            return 1;
        }
        //1-W每个选择的概率
        double everOne = 1.f / W;
        //其中满足<=N的数量是
        int lessNCount = N - K + 1;
        //我们记录算出来的所有开始分数的概率
        double[] probability = new double[K];
        probability[K - 1] = lessNCount * everOne;
        for (int currK = K - 2; currK >= 0; currK --) {
            double currValue = probability[currK + 1];
            //也就是说currK是在currK-1的基础上减去currK+W+1，加上currK+1，其中currK+1或者currK+W+1都是我们已经计算过的
            currValue += (everOne * currValue);
            //满足这个条件说明减去的数是在<=n范围内，>n的数不会加到结果概率中的，内部为什么要乘everOne?因为你选到这个数的概率就是这么多，我们当前需要乘了。
            if(currK + W + 1 <= N) {
                //满足这个条件说明减去的数是递归获得的，因为分数<k会继续抽取
                if(currK + W + 1 < K) {
                    currValue -= everOne * probability[currK + W + 1];
                }
                //否则就是>=k，也就是不需要继续抽取的情况，那么概率是一个固定值
                else {
                    currValue -= everOne * 1;
                }
            }
            probability[currK] = currValue;
        }
        return probability[0];
    }
}

 
921.第九百二十一题：使括号有效的最少添加
class Solution {
    public int minAddToMakeValid(String S) {
        char[] c = S.toCharArray();
        //left记录需要与'('匹配的')'数
        int left = 0;
        //left记录需要与')'匹配的'('数
        int right = 0;
        for (int i = 0; i < c.length; i++) {
            //出现一个左括号需要一个右括号相配，left++
            if ('(' == c[i]) {
                left++;
            } else {
                //出现右括号时判断左括号此时需要的右括号数是否为0，不为0真好出现了右括号，给left--就好，否则需要一个与右括号相配的左括号，right要++
                if(left > 0){
                    left--;
                }else{
                    right++;
                }
            }
        }
        //返回需要的左括号数加需要的右括号数
        return left + right;
    }
}

989.第九百八十九题：数组形式的整数加法
class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        //定义新的数组存储返回值
        List<Integer> list=new ArrayList<>();
        int num=A.length-1;
        int jinwei=0;
        //当K为0，数组A无效且进位为0时直接返回空的数组list，list为空，是否翻转无所谓
        //但凡K不为0或者A数组有效或者当前还有进位时，都要再次进入循环
        while(K!=0||num>=0||jinwei!=0){
            int temp=0;
            //tmp从后往前存储A数组当前位置的值
            if(num>=0){
                temp+=A[num];
                num--;
            }
            //K不为0表示要和数组去加
            if(K!=0){
                //用数组A当前位加上K对10取余即得到K对应位的值
                temp+=K%10;
                //K对10取整抛去已经合并过的最低位
                K=K/10;
            }
            //先判断当前是否有上次进位的值，有的话加到tmp
            if(jinwei==1){
                temp+=jinwei;
                jinwei=0;
            }
            //要不要向下一次计算
            if(temp>=10){
                //进位，大于10进位，list保存个位值
                list.add(temp-10);
                jinwei=1;
            }else{
                //不进位
                list.add(temp);
                jinwei=0;
            }
        }
        //因为list将A数组和K的合并结果后往保存，所以翻转
        Collections.reverse(list);
        return list;
    }
}

//生产者
class Producer implements Runnable{
    private Goods good;

    public Producer(Goods good) {
        this.good = good;
    }

    @Override
    public void run() {
        try {
            this.good.set("红旗拖拉机一辆");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//消费者
class Consumer implements Runnable{
    private Goods good;

    public Consumer(Goods good) {
        this.good = good;
    }

    @Override
    public void run() {
        try {
            this.good.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Goods goods = new Goods();
        // 存储生产、消费者线程
        List<Thread> threadList = new ArrayList<>();
        // 10个生产者线程
        for (int i = 0; i < 10; i++) {
            Thread produceThread = new Thread(new Producer(goods));
            produceThread.setName("生产者线程 "+i);
            threadList.add(produceThread);
        }
        // 6个消费者线程
        for (int i = 0; i < 6; i++) {
            Thread consumeThread = new Thread(new Consumer(goods));
            consumeThread.setName("消费者线程 "+i);
            threadList.add(consumeThread);
        }
        // 启动所有线程
        for (Thread thread : threadList) {
            thread.start();
        }
    }
}

