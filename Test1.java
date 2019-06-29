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


interface Computer{
    void printComputer();
}

class MacbookProComputer implements Computer{
    @Override
    public void printComputer() {
        System.out.println("MackbookPro");
    }
}

class SurfaceBookComputer implements Computer{
    @Override
    public void printComputer() {
        System.out.println("SurfeceBook");
    }
}

interface OperatingSystem{
    void printSystem();
}

class MacOsSystem implements OperatingSystem{
    @Override
    public void printSystem() {
        System.out.println("This is mac os");
    }
}

class Windows8System implements OperatingSystem{
    @Override
    public void printSystem() {
        System.out.println("This is window8");
    }
}

interface ProdectionFactory{
    Computer createComputer();
    OperatingSystem createSystem();
}

class AppleFactory implements ProdectionFactory{
    @Override
    public Computer createComputer() {
        return new MacbookProComputer();
    }

    @Override
    public OperatingSystem createSystem() {
        return new MacOsSystem();
    }
}

class MsFactory implements ProdectionFactory{
    @Override
    public Computer createComputer() {
        return new MacbookProComputer();
    }

    @Override
    public OperatingSystem createSystem() {
        return new MacOsSystem();
    }
}

public class Client{
    public void buyComputer(Computer computer){
        computer.printComputer();
    }
    public void use(OperatingSystem s){
        s.printSystem();
    }
    public static void main(String[] args) {
        Client c = new Client();
        ProdectionFactory factory = new AppleFactory();
        Computer computer = factory.createComputer();
        OperatingSystem system = factory.createSystem();
        c.buyComputer(computer);
        c.use(system);
    }
}

package xpu.edu;

//class MyThread implements Runnable{
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("当前线程：" + Thread.currentThread().getName() + ",i=" + i);
//        }
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        MyThread mt = new MyThread();
//        new Thread(mt).start();//没设置名字
//        new Thread(mt).start();//没设置名字
//        new Thread(mt,"小靓仔").start();//设置名字
//    }
//}
////当前线程：Thread-0,i=0
////当前线程：Thread-0,i=1
////当前线程：Thread-0,i=2
////当前线程：小靓仔,i=0
////当前线程：小靓仔,i=1
////当前线程：Thread-1,i=0
////当前线程：Thread-1,i=1
////当前线程：Thread-1,i=2
////当前线程：Thread-1,i=3
////当前线程：Thread-1,i=4
////当前线程：小靓仔,i=2
////当前线程：Thread-0,i=3
////当前线程：Thread-0,i=4
////当前线程：Thread-0,i=5
////当前线程：Thread-0,i=6
////当前线程：Thread-0,i=7
////当前线程：Thread-0,i=8
////当前线程：Thread-0,i=9
////当前线程：小靓仔,i=3
////当前线程：Thread-1,i=5
////当前线程：Thread-1,i=6
////当前线程：Thread-1,i=7
////当前线程：Thread-1,i=8
////当前线程：Thread-1,i=9
////当前线程：小靓仔,i=4
////当前线程：小靓仔,i=5
////当前线程：小靓仔,i=6
////当前线程：小靓仔,i=7
////当前线程：小靓仔,i=8
////当前线程：小靓仔,i=9

//class MyThread implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("当前线程：" + Thread.currentThread().getName());
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        MyThread mt = new MyThread();
//        mt.run(); // 直接通过对象调用run()方法
//        new Thread(mt).start(); // 通过线程调用
//    }
//}
////当前线程：main
////当前线程：Thread-0

//class MyThread implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 0; i < 1000 ; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("当前线程：" + Thread.currentThread().getName()+" ,i = "
//                    +i);
//        }
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        MyThread mt = new MyThread();
//        new Thread(mt).start();
//        new Thread(mt).start();
//        new Thread(mt).start();
//    }
//}

//class MyThread implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 0; i < 3 ; i++) {
//            Thread.yield();
//            System.out.println("当前线程：" + Thread.currentThread().getName()+" ,i = "
//                    +i);
//        }
//    }
//}
//public class Test {
//    public static void main(String[] args){
//        MyThread mt = new MyThread();
//        new Thread(mt).start();
//        new Thread(mt).start();
//        new Thread(mt).start();
//    }
//}

//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//class MyThread implements Runnable {
//    @Override
//    public void run() {
//        try {
//            System.out.println("主线程睡眠前的时间");
//            Test.printTime();
//            Thread.sleep(2000);
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("睡眠结束的时间");
//            Test.printTime();
//        } catch (InterruptedException e) {
//// TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//}
//public class Test {
//    public static void main(String[] args) throws InterruptedException{
//        MyThread mt = new MyThread();
//        Thread thread = new Thread(mt,"子线程A");
//        thread.start();
//        System.out.println(Thread.currentThread().getName());
//        thread.join();
//        System.out.println("代码结束");
//    }
//    public static void printTime() {
//        Date date=new Date();
//        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String time=format.format(date);
//        System.out.println(time);
//    }
//}

//class MyThread implements Runnable {
//    private boolean flag = true;
//    @Override
//    public void run() {
//        int i = 1;
//        while (flag) {
//            try {
//                Thread.sleep(1000);
//                System.out.println("第"+i+"次执行，线程名称
//                        为:"+Thread.currentThread().getName());
//                i++;
//            } catch (InterruptedException e) {
//// TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//    }
//    public void setFlag(boolean flag) {
//        this.flag = flag;
//    }
//}
//public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        Thread thread1 = new Thread(myThread, "子线程A");
//        thread1.start();
//        Thread.sleep(2000);
//        myThread.setFlag(false);
//        System.out.println("代码结束");
//    }
//}

//MyThread myThread = new MyThread();
//Thread thread1 = new Thread(myThread,"子线程A");
//thread1.start();
//Thread.sleep(3000);
//thread1.stop();
//System.out.println("代码结束");

//class MyThread implements Runnable {
//    private boolean flag = true;
//    @Override
//    public void run() {
//        int i = 1;
//        while (flag) {
//            try {
//                /**
//                 * 这里阻塞之后,线程被调用了interrupte()方法，
//                 * 清除中断标志，就会抛出一个异常
//                 * java.lang.InterruptedException
//                 */
//                Thread.sleep(1000);
//                boolean bool = Thread.currentThread().isInterrupted();
//                if (bool) {
//                    System.out.println("非阻塞情况下执行该操作。。。线程状态" + bool);
//                    break;
//                }
//                System.out.println("第"+i+"次执行，线程名称
//                        为:"+Thread.currentThread().getName());
//                i++;
//            } catch (InterruptedException e) {
//                System.out.println("退出了");
//                /**
//                 * 这里退出阻塞状态，且中断标志被系统会自动清除，
//                 * 并且重新设置为false，所以此处bool为false
//                 */
//                boolean bool = Thread.currentThread().isInterrupted();
//                System.out.println(bool);
//                //退出run方法，中断进程
//                return;
//            }
//        }
//    }
//    public void setFlag(boolean flag) {
//        this.flag = flag;
//    }
//}
//public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        Thread thread1 = new Thread(myThread, "子线程A");
//        thread1.start();
//        Thread.sleep(3000);
//        thread1.interrupt();
//        System.out.println("代码结束");
//    }
//}

//class MyThread implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 0; i < 5 ; i++) {
//            System.out.println("当前线程：" + Thread.currentThread().getName()+" ,i = "
//                    +i);
//        }
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        MyThread mt = new MyThread();
//        Thread t1 = new Thread(mt,"1") ;
//        Thread t2 = new Thread(mt,"2") ;
//        Thread t3 = new Thread(mt,"3") ;
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t3.setPriority(Thread.MAX_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//}
////当前线程：1 ,i = 0
////当前线程：3 ,i = 0
////当前线程：3 ,i = 1
////当前线程：3 ,i = 2
////当前线程：3 ,i = 3
////当前线程：2 ,i = 0
////当前线程：3 ,i = 4
////当前线程：1 ,i = 1
////当前线程：1 ,i = 2
////当前线程：1 ,i = 3
////当前线程：2 ,i = 1
////当前线程：2 ,i = 2
////当前线程：1 ,i = 4
////当前线程：2 ,i = 3
////当前线程：2 ,i = 4

//public class Test {
//    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getPriority());
//    }
//}
////5

//class A implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("A的优先级为:" + Thread.currentThread().getPriority());
//        Thread thread = new Thread(new B());
//        thread.start();
//    }
//}
//class B implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("B的优先级为:" + Thread.currentThread().getPriority());
//    }
//}
//public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new Thread(new A());
//        thread.setPriority(Thread.MAX_PRIORITY);
//        thread.start();
//    }
//}
////A的优先级为:10
////B的优先级为:10

//class A implements Runnable {
//    private int i;
//    @Override
//    public void run() {
//        try {
//            while (true) {
//                i++;
//                System.out.println("线程名称：" + Thread.currentThread().getName() +
//                        ",i=" + i + ",是否为守护线程:"
//                        + Thread.currentThread().isDaemon());
//                Thread.sleep(1000);
//            }
//        } catch (InterruptedException e) {
//            System.out.println("线程名称：" + Thread.currentThread().getName() + "中断线程了");
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        Thread thread1 = new Thread(new A(),"子线程A");
//        // 设置线程A为守护线程，此语句必须在start方法之前执行
//        thread1.setDaemon(true);
//        thread1.start();
//        Thread thread2 = new Thread(new A(),"子线程B");
//        thread2.start();
//        Thread.sleep(3000);
//        // 中断非守护线程
//        thread2.interrupt();
//        Thread.sleep(10000);
//        System.out.println("代码结束");
//    }
//}

//public static ExecutorService newFixedThreadPool(int nThreads) {
//        return new ThreadPoolExecutor(nThreads, nThreads,0L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>());
//}

//public class Test {
//    public static void main(String[] args){
//        ExecutorService executorService =
//                Executors.newFixedThreadPool(5);
//        for (int i = 0; i < 5; i++) {
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//                    for (int j = 0; j < 10; j++) {
//                        System.out.println(Thread.currentThread().getName()+"、"+j);
//                    }
//                }
//            });
//        }
//        executorService.shutdown();
//    }
//}

//public static ExecutorService newSingleThreadExecutor() {
//        return new FinalizableDelegatedExecutorService(new ThreadPoolExecutor(1, 1,0L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>()));
//}

//public class Test {
//    public static void main(String[] args){
//        ExecutorService executorService =
//                Executors.newSingleThreadExecutor();
//        for (int i = 0; i < 5; i++) {
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//                    for (int j = 0; j < 10; j++) {
//                        System.out.println(Thread.currentThread().getName()+"、"+j);
//                    }
//                }
//            });
//        }
//        executorService.shutdown();
//    }
//}

//public static ExecutorService newCachedThreadPool() {
//        return new ThreadPoolExecutor(0, Integer.MAX_VALUE,60L, TimeUnit.SECONDS,new SynchronousQueue<Runnable>());
//}

//public class Test {
//    public static void main(String[] args){
//        ExecutorService executorService =
//                Executors.newCachedThreadPool();
//        for (int i = 0; i < 5; i++) {
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//                    for (int j = 0; j < 10; j++) {
//                        System.out.println(Thread.currentThread().getName()+"、"+j);
//                    }
//                }
//            });
//        }
//        executorService.shutdown();
//    }
//}

public class Test {
    public static void main(String[] args){
        ScheduledExecutorService executorService =
                Executors.newScheduledThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        System.out.println(Thread.currentThread().getName()+"、"+j);
                    }
                }
            },2,3,TimeUnit.SECONDS);
        }
    }
}