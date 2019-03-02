class Node{
    private Object data;//存储内容
    private Node next;//定义下一个节点
    public Node(Object data){
        this.data = data;
    }
    public void setData(Object data){
        this.data = data;
    }

    public Object getData(){
        return this.data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }
}

public class Test{
    public static void main(String[] args) throws Exception{
        //封装节点
        Node root = new Node("火车头");
        Node n1 = new Node("车厢1");
        Node n2 = new Node("车厢2");
        Node n3 = new Node("车厢3");
        //将新节点挂上去
        root.setData(n1);
        n1.setNext(n2);
        n2.setNext(n3);
        //依次取出节点的数据
        getNodeData(root);
    }

    public static void getNodeData(Node node){
        if(node != null){
            System.out.println(node.getData());
            getNodeData(node.getNext());
        }
    }
}




interface Link{
    void add(Object obj);
    boolean remove(int index);
    boolean set(int index,Object obj);
    Object get(int index);
    int contain(Object obj);
    void clear();
    void printLink();
    int length();
    Object[] toArray();
}

class LinkImpl implements Link{
    private Node first;
    private Node last;
    private int size = 0;

    //封装Node类
    private class Node{
        private Node prev;
        private Object data;
        private Node next;
        public Node(Node prev, Object data, Node next){
            super();
            this.prev = prev;
            this.next = next;
            this.data = data;
        }

    }

    //添加节点
    @Override
    public void add(Object obj){
        Node tmp = this.last;
        Node newNode = new Node(tmp,obj,null);
        this.last = newNode;
        if(this.first == null){
            this.first = newNode;
        }else{
            tmp.next = newNode;
        }
        this.size ++;
    }

    //判断索引是否合法
    private boolean isLinkElement(int index){
        return index >= 0 && index < this.size;
    }

    //找到目标索引对应的节点
    private Node node(int index){
        //目的索引在链表前段
        if(index < (size >> 1)){
            Node result = this.first;
            for(int i = 0; i < index; i ++){
                result = result.next;
            }
            return result;
        }
        //目的索引在链表后段
        Node result = this.last;
        for(int i = size -1; i > index;i --){
            result = result.prev;
        }
        return result;
    }

    //移除指定索引的元素
    @Override
    public boolean remove(int index) {
        //索引非法
        if(!isLinkElement(index)){
            return false;
        }
        Node node = node(index);
        if(node == this.first){
            //链表中只有一个节点
            if(node == this.last){
                node = null;
                this.size --;
                return true;
            }else{
                //此时要删掉的是头节点
                Node tmp = this.first;
                this.first = node.next;
                tmp.next = null;
                this.size --;
                return true;
            }
        }else if(node == this.last){
            Node tmp = this.last;
            this.last = node.prev;
            tmp.prev = null;
            this.last.next = null;
            this.size --;
            return true;
        }
        node.next.prev = node.prev;
        node.prev.next = node.next;
        node.prev = node.next = null;
        this.size --;
        return true;
    }

    //替换指定索引节点存储内容
    @Override
    public boolean set(int index, Object obj) {
        if (!isLinkElement(index)) {
            return false;
        }
        Node node = node(index);
        node.data = obj;
        return true;
    }

    //返回指定索引对应的节点存储的数据
    @Override
    public Object get(int index) {
        //索引非法返回空
        if (!isLinkElement(index)) {
            return null;
        }
        return node(index).data;
    }

    //判读链表中该数据存在的index，不存在返回-1
    @Override
    public int contain(Object obj) {
        //节点可能存储空值
        if(obj == null){
            int index = 0;
            for(Node x = this.first; x != null;x = x.next){
                if (x.data == null){
                    return index;
                }
                index ++;
            }
            //没找到返回-1
            return -1;
        }else{
            //待查找的值不是null
            int index = 0;
            for(Node x = this.first; x != null;x = x.next){
                if(obj.equals(x.data)){
                    return index;
                }
                index ++;
            }
            return -1;
        }
    }

    //清空链表
    @Override
    public void clear() {
        //从头到尾挨个置为空
        for(Node x = this.first; x != null;){
            Node temp = x.next;
            x.prev = null;
            x.next = null;
            x = temp;
        }
        //将头尾指针置空
        this.first = this.last = null;
        this.size = 0;
    }

    //打印链表
    @Override
    public void printLink() {
        Object[] result = this.toArray();
        for(Object object : result){
            System.out.println(object);
        }
    }

    @Override
    public int length() {
        return this.size;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for(Node x = this.first; x != null;x = x.next){
            result[i ++] = x.data;
        }
        return result;
    }
}

public class Test {
    public static void main(String[] args) {
        LinkImpl link = new LinkImpl();
        link.add("火车头");
        link.add("车厢1");
        link.add("车厢2");
        System.out.println(link.contain("车厢1"));
        System.out.println(link.contain("test"));
        System.out.println(link.length());
    }
}

