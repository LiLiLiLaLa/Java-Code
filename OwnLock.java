import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

class Mutex implements Lock {
    private Sync sync = new Sync();

    //------------------------------------
    static class Sync extends AbstractQueuedSynchronizer {
        protected boolean tryAcquire(int arg) {
            if (arg != 1) {
                throw new RuntimeException("信号量不为1！");
            }
            if (compareAndSetState(0, 1)) {
                //当前线程成功获取锁
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        protected boolean tryRelease(int arg) {
            if (getState() == 0) {
                throw new IllegalMonitorStateException();
            }
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }
        protected boolean isHeldExclusively(){
            return getState() == 1;
        }
        Condition newCondition(){
            return new ConditionObject();
        }
    }
    //------------------------------------------
    //Lock接口实现方法
    public void lock(){
        sync.acquire(1);
    }
    public void lockInterruptibly() throws InterruptedException{
        sync.acquireInterruptibly(1);
    }
    public boolean tryLock(){
        return sync.tryAcquire(1);
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }


    public void unlock(){
        sync.release(1);
    }
    public Condition newCondition(){
        return sync.newCondition();
    }
}

public class OwnLock{
    private static Mutex mutex = new Mutex();
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            Thread thread = new Thread(()->{
                mutex.lock();
                try{
                    Thread.sleep(3000);
                }catch(Exception e){
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }
}