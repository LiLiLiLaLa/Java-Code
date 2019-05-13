package LinkedList;

/**
 * LinkedList：相当于火车，具体连接每个节点，客户端使用此类
 * Node：相当于火车车厢，存放数据
 */
public class LinkedList {
    //火车头
    private Node head;
    //长度
    private int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    //客户端不能直接使用Node节点，客户端只关心数据的存储而不关心节点间的关系，因此将Node结点作为内部类隐藏起来
    private class Node{
        Object data;
        Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(Object data) {
            this.data = data;
        }
    }

    /**
     * 头插
     * @param data 插入的数据
     */
    public void addFirst(Object data){
        //创建新节点
        Node newNode = new Node(data);
        //将当前节点的下一个节点指向链表的头结点
        newNode.next = head;
        //l链表的头结点变成当前节点
        head = newNode;
        size ++;
    }

    //插入第index节点的后面
    public void add(int index, Object data){
        //判断index是否合法
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index Illegal");
        }
        //头插
        if(index == 0){
            addFirst(data);
        }
        //找到index的前驱节点
        Node prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }
        Node newNode = new Node(data);
        newNode.next = prev.next;
        prev.next = newNode;
        size ++;
    }

    //尾插
    public void addLast(Object data){
        add(size, data);
    }
}