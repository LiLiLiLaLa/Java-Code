package xpu.edu;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

class Mutex implements Lock {
    private Sync sync = new Sync();

    static class Sync extends AbstractQueuedSynchronizer{
        @Override
        protected boolean tryAcquire(int arg) {
            if (arg != 1) {
                throw new RuntimeException("信号量不为1!");
            }
            if (compareAndSetState(0,1)) {
            // 当前线程成功获取锁
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        @Override
        protected boolean tryRelease(int arg) {
            if (getState() == 0) {
                throw new IllegalMonitorStateException();
            }
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }
        @Override
        protected boolean isHeldExclusively() {
            return getState()==1;
        }
        Condition newCondition() {
            return new ConditionObject();
        }
    }
// Lock接口实现方法
    @Override
    public void lock() {
        sync.acquire(1);
    }
    @Override
    public void lockInterruptibly() throws InterruptedException {
        sync.acquireInterruptibly(1);
    }
    @Override
    public boolean tryLock() {
        return sync.tryAcquire(1);
    }
    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }
    @Override
    public void unlock() {
        sync.release(1);
    }
    @Override
    public Condition newCondition() {
        return sync.newCondition();
    }
}

public class Test{
    private static Mutex mutex = new Mutex();
    public static void main(String[] args){
        for (int i = 0; i < 10;i++){
            Thread thread = new Thread(()-> {
                mutex.lock();
                try {
                    Thread.sleep(3000);
                }catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    mutex.unlock();
                }
            });
            thread.start();
        }
    }
}



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