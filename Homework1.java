import java.util.Arrays;

public class Homework1{
    public static void main(String[] args) {
        //multiplicationTable();
        //long ret = factorial(20);
        //System.out.println(ret);
        int[] data = new int[]{1,3,2,9,7,4,6,8,20,17,25,21};
        quickSort(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
        //staticInitArray();

    }

    //使用数组静态初始化方式初始化一个大小为10的整型数组并输出。
    public static void staticInitArray(){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        //System.out.println(Arrays.toString(arr));
        for (int var : arr) {//用for each读取，又叫增强for循环
            System.out.print(var+" ");
        }
    }

    //使用递归实现快速排序(Java实现) 
    public static int Partition(int[] arr, int start, int end) {
        int key = arr[start];
        while (start < end) {
            while (arr[end] >= key && end > start)
                end--;
            arr[start] = arr[end];
            while (arr[start] <= key && end > start)
                start++;
            arr[end] = arr[start];
        }
        arr[start] = key;
        return start;
    }
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int index = Partition(arr, start, end);
            quickSort(arr, start, index - 1);
            quickSort(arr, index + 1, end);
        }
    }

    //20的阶乘
    private static long factorial(int i){
        if(i <= 1){
            return 1L;
        }else{
            return i*factorial(i-1);
        }
    }

    //九九乘法表
    public static void multiplicationTable(){
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}

//interface IMessage{
//    public static final String MSG = "我是靓仔";//全局常量
//    public abstract void print();//抽象方法
//}
//
//interface INews{
//    public abstract String getName();
//}
//
//abstract class New{
//    //抽象类中方法前面的abstract不能省略，否则就是普通方法
//    public abstract void setName();
//}
//
//class MessageImpl extends New implements IMessage,INews{
//    @Override
//    public void setName() {
//        System.out.println("我是靓仔！");
//    }
//
//    @Override
//    public String getName() {
//        return IMessage.MSG;//访问常量都建议加上类名称
//    }
//
//    @Override
//    public void print() {
//        System.out.println(getName());
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        IMessage m = new MessageImpl();//子类向上转型
//        m.print();//调用被子类覆写过的方法
//        INews n = (INews) m;
//        System.out.println(n.getName());
//        New news = (New) m ;
//        news.setName();
//    }
//}
////我是靓仔
////我是靓仔
////我是靓仔！

//interface A{
//    public void printA();
//    static interface D{
//        public void print();
//    }
//}
//
//interface B{
//    public void printB();
//}
//
//interface C extends A,B{
//    //接口多继承
//    public void print();
//}
//
//class Impl implements A.D{
//    @Override
//    public void print(){}
//}

/**
 * 定义一个USB标准
 */
interface USB{
    /**
     * 安装驱动
     */
    public void setUp();

    /**
     * 进行工作
     */
    public void work();
}
/**
 * 定义电脑类
 */
class Computer{
    /**
     * 插入USB设备
     * @param usb
     */
    public void plugin(USB usb){
        usb.setUp();//安装
        usb.work();//工作
    }
}

/**
 * 定义一个USB设备
 */
class UDisk implements USB{
    @Override
    public void setUp() {
        System.out.println("安装打印机驱动");
    }

    @Override
    public void work() {
        System.out.println("打印机开始工作");
    }
}

//class MyThread extends Thread{
//    private String title ;
//    public MyThread(String title) {
//        this.title = title;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(this.title + ",i = " + i);
//        }
//    }
//}

//class MyThread implements Runnable {
//    private String title ;
//    public MyThread(String title) {
//        this.title = title;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10 ; i++) {
//            System.out.println(this.title+",i = " + i);
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello World");
//            }
//        }).start();
//    }
//}

//public class TestDemo {
//    public static void main(String[] args) {
//        Runnable runnable = () -> System.out.println("Hello World");
//        new Thread(runnable).start();
//    }
//}

//        MyThread myThread1 = new MyThread("thread1") ;
//        MyThread myThread2 = new MyThread("thread2") ;
//        MyThread myThread3 = new MyThread("thread3") ;
//        new Thread(myThread1).start();
//        new Thread(myThread2).start();
//        new Thread(myThread3).start();

//输出
//thread1,i = 0
//thread1,i = 1
//thread1,i = 2
//thread1,i = 3
//thread1,i = 4
//thread1,i = 5
//thread2,i = 0
//thread2,i = 1
//thread2,i = 2
//thread2,i = 3
//thread2,i = 4
//thread2,i = 5
//thread2,i = 6
//thread2,i = 7
//thread2,i = 8
//thread2,i = 9
//thread1,i = 6
//thread1,i = 7
//thread1,i = 8
//thread1,i = 9
//thread3,i = 0
//thread3,i = 1
//thread3,i = 2
//thread3,i = 3
//thread3,i = 4
//thread3,i = 5
//thread3,i = 6
//thread3,i = 7
//thread3,i = 8
//thread3,i = 9

//输出
//thread1,i = 0
//thread3,i = 0
//thread2,i = 0
//thread2,i = 1
//thread2,i = 2
//thread3,i = 1
//thread1,i = 1
//thread1,i = 2
//thread1,i = 3
//thread1,i = 4
//thread3,i = 2
//thread2,i = 3
//thread3,i = 3
//thread1,i = 5
//thread3,i = 4
//thread2,i = 4
//thread3,i = 5
//thread1,i = 6
//thread3,i = 6
//thread3,i = 7
//thread3,i = 8
//thread3,i = 9
//thread2,i = 5
//thread2,i = 6
//thread2,i = 7
//thread1,i = 7
//thread2,i = 8
//thread2,i = 9
//thread1,i = 8
//thread1,i = 9

//public class Test {
//    public static void main(String[] args) {
//        MyThread myThread1 = new MyThread("thread1") ;
//        MyThread myThread2 = new MyThread("thread2") ;
//        MyThread myThread3 = new MyThread("thread3") ;
//        myThread1.run();
//        myThread2.run();
//        myThread3.run();
//    }
//}
//
////输出
////thread1,i = 0
////thread1,i = 1
////thread1,i = 2
////thread1,i = 3
////thread1,i = 4
////thread1,i = 5
////thread1,i = 6
////thread1,i = 7
////thread1,i = 8
////thread1,i = 9
////thread2,i = 0
////thread2,i = 1
////thread2,i = 2
////thread2,i = 3
////thread2,i = 4
////thread2,i = 5
////thread2,i = 6
////thread2,i = 7
////thread2,i = 8
////thread2,i = 9
////thread3,i = 0
////thread3,i = 1
////thread3,i = 2
////thread3,i = 3
////thread3,i = 4
////thread3,i = 5
////thread3,i = 6
////thread3,i = 7
////thread3,i = 8
////thread3,i = 9

//class MyThread extends Thread {
//    private int ticket = 10 ; // 一共10张票
//        private String title ;
//    public MyThread(String title) {
//        this.title = title;
//    }
//
//    @Override
//    public void run() {
//        while(this.ticket>0){
//            System.out.println(title + "剩余票数："+this.ticket -- );
//        }
//    }}
//public class Test {
//    public static void main(String[] args) {
//        new MyThread("一号").start();
//        new MyThread("二号").start();
//        new MyThread("三号").start();
//    }
//}
////三号剩余票数：10
////三号剩余票数：9
////三号剩余票数：8
////三号剩余票数：7
////三号剩余票数：6
////三号剩余票数：5
////二号剩余票数：10
////三号剩余票数：4
////一号剩余票数：10
////二号剩余票数：9
////二号剩余票数：8
////二号剩余票数：7
////二号剩余票数：6
////二号剩余票数：5
////二号剩余票数：4
////一号剩余票数：9
////一号剩余票数：8
////三号剩余票数：3
////三号剩余票数：2
////三号剩余票数：1
////一号剩余票数：7
////二号剩余票数：3
////二号剩余票数：2
////二号剩余票数：1
////一号剩余票数：6
////一号剩余票数：5
////一号剩余票数：4
////一号剩余票数：3
////一号剩余票数：2
////一号剩余票数：1

import java.util.concurrent.*;

//class MyThread implements Runnable {
//    private int ticket = 10 ; // 一共10张票
//    private String title ;
//    public MyThread(String title) {
//        this.title = title;
//    }
//
//    @Override
//    public void run() {
//        while(this.ticket>0){
//            System.out.println(title + "剩余票数："+this.ticket -- );
//        }
//    }
//}
//class MyThread implements Callable<String> {
//    private int ticket = 10 ; // 一共10张票
//    @Override
//    public String call() throws Exception {
//        while(this.ticket>0){
//            System.out.println("剩余票数："+this.ticket -- );
//        }
//        return "票卖完了，下次吧。。。" ;
//    }
//}
//
//
//
//public class Test {
//    public static void main(String[] args) throws Exception {
//        FutureTask<String> task = new FutureTask<String >(new MyThread()) ;
//        new Thread(task).start();
//        new Thread(task).start();
//        System.out.println(task.get());
//    }
//}
//剩余票数：10
//剩余票数：9
//剩余票数：8
//剩余票数：7
//剩余票数：6
//剩余票数：5
//剩余票数：4
//剩余票数：3
//剩余票数：2
//剩余票数：1
//票卖完了，下次吧。。。

//public class Test {
//    public static void main(String[] args) {
//        MyThread mt = new MyThread() ;
//        new Thread(mt).start();
//        new Thread(mt).start();
//    }
//}
////一号剩余票数：10
////一号剩余票数：8
////一号剩余票数：7
////一号剩余票数：6
////一号剩余票数：9
////一号剩余票数：4
////一号剩余票数：3
////一号剩余票数：5
////一号剩余票数：2
////一号剩余票数：1

//class RunnableThread implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 0; i < 50; i++) {
//            System.out.println(Thread.currentThread().getName() + "、" + i);
//        }
//    }
//}
//public class Test {
//    public static void main(String[] args){
//        RunnableThread runnableThread = new RunnableThread();
//        ThreadPoolExecutor threadPoolExecutor =
//                new ThreadPoolExecutor(4,5,2000,TimeUnit.MILLISECONDS,
//                        new LinkedBlockingDeque<Runnable>());
//        for (int i = 0; i < 5; i++) {
//            threadPoolExecutor.execute(runnableThread);
//        }
//    }
//}

class CallableThread implements Callable<String> {
    @Override
    public String call() throws Exception {
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread().getName() + "、" + i);
            }
            return Thread.currentThread().getName()+"任务执行完毕";
     }
}
public class Test {
    public static void main(String[] args){
        CallableThread callableThread = new CallableThread();
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(3,5,2000,TimeUnit.MILLISECONDS,
                        new LinkedBlockingDeque<Runnable>());
        for (int i = 0; i < 5; i++) {
            Future<String> future = threadPoolExecutor.submit(callableThread);
            try {
                String str = future.get();
                System.out.println(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}