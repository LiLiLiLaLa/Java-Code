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

