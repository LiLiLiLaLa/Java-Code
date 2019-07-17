//数组实现队列
class ArrayQueue{
    //数组最大元素个数
    private int maxSize;
    //队列头
    private int head;
    //队列尾
    private int tail;
    //用于存放数据
    private int[] arr;

    //创建队列的构造器
    public ArrayQueue(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        //指向队列头部的前一个位置
        head = -1;
        //指向队列最后一个数据即队尾
        tail = -1;
    }

    //判断队列是否满
    //满返回true，没满返回false
    public boolean isFull(){
        return tail == maxSize - 1;
    }

    //判断队列是否为空他，头尾相等为空
    //空返回true，非空返回false
    public boolean isEmpty(){
        return tail == head;
    }

    //添加数据到队列
    public void addQueue(int data){
        //判满
        if(isFull()){
            System.out.println("队列已满");
            return;
        }
        //tail后移
        tail ++;
        arr[tail] = data;
    }

    //出队获取数据
    public int getData(){
        //判空
        if(isEmpty()){
            //通过抛出异常来处理,throw本身会导致代码return
            throw new RuntimeException("队列为空");
        }
        head ++;
        return arr[head];
    }

    //显示队列所有数据
    public void showQueue(){
        //遍历
        if(isEmpty()){
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }
    }

    //显示队列的头
    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        return arr[head + 1];
    }
}

public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        arrayQueue.showQueue();
        arrayQueue.addQueue(5);
        arrayQueue.addQueue(4);
        arrayQueue.addQueue(3);
        arrayQueue.showQueue();
        System.out.println(arrayQueue.headQueue());
        System.out.println(arrayQueue.getData());
    }
}
