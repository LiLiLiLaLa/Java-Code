package xpu.edu;//package xpu.edu;
//
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.locks.AbstractQueuedSynchronizer;
//import java.util.concurrent.locks.Condition;
//import java.util.concurrent.locks.Lock;
//
//class Mutex implements Lock {
//    private Sync sync = new Sync();
//
//    static class Sync extends AbstractQueuedSynchronizer{
//        @Override
//        protected boolean tryAcquire(int arg) {
//            if (arg != 1) {
//                throw new RuntimeException("信号量不为1!");
//            }
//            if (compareAndSetState(0,1)) {
//            // 当前线程成功获取锁
//                setExclusiveOwnerThread(Thread.currentThread());
//                return true;
//            }
//            return false;
//        }
//
//        @Override
//        protected boolean tryRelease(int arg) {
//            if (getState() == 0) {
//                throw new IllegalMonitorStateException();
//            }
//            setExclusiveOwnerThread(null);
//            setState(0);
//            return true;
//        }
//        @Override
//        protected boolean isHeldExclusively() {
//            return getState()==1;
//        }
//        Condition newCondition() {
//            return new ConditionObject();
//        }
//    }
//// Lock接口实现方法
//    @Override
//    public void lock() {
//        sync.acquire(1);
//    }
//    @Override
//    public void lockInterruptibly() throws InterruptedException {
//        sync.acquireInterruptibly(1);
//    }
//    @Override
//    public boolean tryLock() {
//        return sync.tryAcquire(1);
//    }
//    @Override
//    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
//        return false;
//    }
//    @Override
//    public void unlock() {
//        sync.release(1);
//    }
//    @Override
//    public Condition newCondition() {
//        return sync.newCondition();
//    }
//}
//
//public class Test{
//    private static Mutex mutex = new Mutex();
//    public static void main(String[] args){
//        for (int i = 0; i < 10;i++){
//            Thread thread = new Thread(()-> {
//                mutex.lock();
//                try {
//                    Thread.sleep(3000);
//                }catch (Exception e) {
//                    e.printStackTrace();
//                }finally {
//                    mutex.unlock();
//                }
//            });
//            thread.start();
//        }
//    }
//}



//public final void signal() {
//    //1. 先检测当前线程是否已经获取lock
//    if (!isHeldExclusively())
//        throw new IllegalMonitorStateException();
//    //2. 获取等待队列中第一个节点，之后的操作都是针对这个节点
//    Node first = firstWaiter;
//    if (first != null)
//        doSignal(first);
//}

//private void doSignal(Node first) {
//    do {
//        if ( (firstWaiter = first.nextWaiter) == null)
//            lastWaiter = null;
//        //1. 将头结点从等待队列中移除
//        /first.nextWaiter = null;
//        //2. while中transferForSignal方法对头结点做真正的处理
//    } while (!transferForSignal(first) && (first = firstWaiter) != null);
//}
//


//private void doSignalAll(Node first) {
//    lastWaiter = firstWaiter = null;
//    do {
//        Node next = first.nextWaiter;
//        first.nextWaiter = null;
//        transferForSignal(first);
//        first = next;
//    } while (first != null);
//}

//import java.util.Date;
//public class Test {
//    public static void main(String[] args) {
//        Date date = new Date() ;
//    }
//}

//import java.util.Date;
//public class Test {
//    public static void main(String[] args) {
//        Date date = new Date() ;
//        System.out.println(date.getClass());
//    }
//}

//public class Test {
//    public static void main(String[] args) throws ClassNotFoundException {
//        Class<?> cls = Class.forName("java.util.Date") ;
//        System.out.println(cls.getName());
//    }
//}

//public class Test {
//    public static void main(String[] args) throws ClassNotFoundException,
//            InstantiationException, IllegalAccessException {
//        Class<?> cls = Class.forName("java.util.Date") ;
//        Object obj = cls.newInstance() ; // 实例化对象，等价于 new java.util.Date() ;
//        System.out.println(obj);
//    }
//}

//interface IFruit {
//    public void eat() ;
//}
//class Apple implements IFruit {
//    @Override
//    public void eat() {
//        System.out.println("[Apple] 吃苹果 ");
//    }
//}
//
//class Orange implements IFruit {
//    @Override
//    public void eat() {
//        System.out.println("[Orange] 吃橘子 ");
//    }
//}
//
//class FruitFactory {
//    private FruitFactory() {}
//    public static IFruit getInstance(String className) {
//        IFruit fruit = null ;
//        try {
//            fruit = (IFruit) Class.forName(className).newInstance() ;
//        } catch (InstantiationException | IllegalAccessException |
//                ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        return fruit ;
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        IFruit fruit = FruitFactory.getInstance("xpu.edu.Orange") ;
//        fruit.eat() ;
//    }
//}
////[Orange] 吃橘子

//interface IFruit {}
//interface IMessage{}
//class CLS implements IFruit,IMessage{}
//public class Test {
//    public static void main(String[] args) {
//        // 取得类对象
//        Class<?> cls = CLS.class ;
//        System.out.println(cls.getPackage().getName());
//    }
//}

interface IFruit {}
interface IMessage{}
class CLS implements IFruit,IMessage{}
public class Test {
    public static void main(String[] args) {
        // 取得类对象
        Class<?> cls = CLS.class ;
        // 取得Package名称
        System.out.println(cls.getPackage().getName());
        // 取得父类名称
        System.out.println(cls.getSuperclass().getName());
        // 取得实现的父接口对象
        Class<?>[] iClass = cls.getInterfaces() ;
        for (Class<?> class1 : iClass) {
            System.out.println(class1.getName());
        }
    }
}
//xpu.edu
//java.lang.Object
//xpu.edu.IFruit
//xpu.edu.IMessage