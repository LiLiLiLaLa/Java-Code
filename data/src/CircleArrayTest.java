class CircleArray{
    //数组最大元素个数
    private int maxSize;
    //队列头
    private int head;
    //队列尾
    private int tail;
    //用于存放数据
    private int[] arr;

    public CircleArray(int arrayMaxSize){
        maxSize = arrayMaxSize;
        arr = new int[maxSize];
        //指向队列头部的前一个位置
        head = 0;
        //指向队列最后一个数据即队尾
        tail = 0;
    }

    //判断队列是否满
    //满返回true，没满返回false
    public boolean isFull(){
        return (tail + 1) % maxSize == head;
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
        //直接将数据加入
        arr[tail] = data;
        //将tail后移
        tail = (tail + 1) % maxSize;
    }

    //出队获取数据
    public int getData(){
        //判空
        if(isEmpty()){
            //通过抛出异常来处理,throw本身会导致代码return
            throw new RuntimeException("队列为空");
        }
        //这里要分析出head是指向队列的第一个元素
        //先把head对应的值保留到一个临时变量
        //head后移
        //返回临时变量
      int value = arr[head];
        head = (head + 1) % maxSize;
        return value;
    }

    //求出当前队列有效数据个数
    public int size(){
        return (tail + maxSize - head) % maxSize;
    }

    //显示队列所有数据
    public void showQueue(){
        //遍历
        if(isEmpty()){
            System.out.println("队列为空");
            return;
        }
        //从head开始遍历
        for (int i = head; i < head + size(); i++) {
            System.out.printf("%d ",arr[i % maxSize]);
        }
    }

    //显示队列的头
    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        return arr[head];
    }
}

public class CircleArrayTest {
    public static void main(String[] args) {
        CircleArray arrayQueue = new CircleArray(3);
        arrayQueue.showQueue();
        arrayQueue.addQueue(5);
        arrayQueue.addQueue(4);
        arrayQueue.addQueue(3);
        arrayQueue.showQueue();
        System.out.println(arrayQueue.headQueue());
        System.out.println(arrayQueue.getData());
    }
}
