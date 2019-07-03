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

