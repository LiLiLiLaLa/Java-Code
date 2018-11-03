/**
 * @author L
 * 覆写接口中的方法，实现双链表功能
 */
public class LinkImpl implements ILink{
    //链表的头部
    private Node head;
    //链表的尾部
    private Node last;
    //链表长度
    private int size;
    /**
     * 定义链表节点
     */
    private class Node{
        //上一个结点
        private Node prev;
        //下一个结点
        private Node next;
        //存放的数据
        private Object data;
        public Node(Node prev, Node next, Object data){
            this.prev = prev;
            this.next = next;
            this.data = data;
        }
    }

    @Override
    public void add(Object obj) {
        //获取到尾结点
        Node lastNode = this.last;
        Node newNode = new Node(lastNode,null,obj);
        this.last = newNode;
        if(this.head == null){
            this.head = newNode;
        }else{
            lastNode.next = newNode;
        }
        this.size++;
    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }

    @Override
    public Object set(int index, Object newData) {
        return null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int contains(Object data) {
        int i = 0;
        //如果要查找的数据为null，null不能调用equals进行比较，所以分两种情况
        //如果要查找的元素是null
        //如果要查找的元素不是null
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void linkPrint() {

    }
}
