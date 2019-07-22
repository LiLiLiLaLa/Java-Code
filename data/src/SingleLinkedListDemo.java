//单链表

//定义HeroNode，每个HeroNode对象就是一个节点
class HeroNode{
    public int no;
    public String name;
    public String nichname;
    public HeroNode next;

    public HeroNode(int no, String name, String nichname) {
        this.no = no;
        this.name = name;
        this.nichname = nichname;
    }

    //为了显示方便，我们重新toString

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nichname='" + nichname + '\'' +
                ", next=" + next +
                '}';
    }
}

//定义SingleLinkedList
class SingleLinkedList {
    //先初始化一个头结点，头结点不要动，不存放具体数据
    private HeroNode head = new HeroNode(0,"","");

    //添加节点到单链表：当不考虑编号时，添加到当前链表的最后节点，将最后这个节点的next指向新的节点
    public void add(HeroNode heroNode){
        //因为头结点不能动，所以需要一个辅助变量
        HeroNode temp = head;
        //遍历链表，找到最后一个节点
        while(true){
            if(temp.next == null){
                break;
            }
            //如果没有找到
            temp = temp.next;
        }
        temp.next = heroNode;
    }

    //显示链表
    public void list(){
        //判空
        if(head.next == null){
            return;
        }
        //因为头结点不能动，因此需要辅助变量遍历
        HeroNode temp = head.next;
        while(true){
            //判断是否到链表最后了
            if(temp == null){
                break;
            }
            //输出节点信息
            System.out.println(temp);
            //将temp后移
            temp = temp.next;
        }
    }


    //添加节点时添加到指定位置
    public void addByOrder(HeroNode heroNode){
        //头节点不能动，所以需要一个临时变量，要找到添加位置的前一个节点
        HeroNode temp = head;
        boolean flag = false;//要添加的位置是否存在
        while(true) {
            if (temp.next == null) {
                //说明temp已经在链表最后
                break;
            }
            if (temp.next.no > heroNode.no) {
                //位置找到
                break;
            } else if (temp.next.no == heroNode.no) {
                //编号存在
                flag = true;
                break;
            }
            temp = temp.next;
        }
        //判断flag
        if (flag) {
            //不能添加，已存在
            System.out.println("已存在");
        }else {
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }
}

public class SingleLinkedListDemo {
}
