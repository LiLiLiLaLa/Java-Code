class Person{};
class Student{};
public class P1 {
    public static void main(String[] args) {
        fun(new Person());
        fun(new Student());
    }
    public static void fun(Object obj){
        System.out.println(obj);
    }
}


//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//
//@SuppressWarnings("serial")
//class Person implements Serializable{
//    private String name ;
//    private int age ;
//    public Person(String name, int age) {
//        super();
//        this.name = name;
//        this.age = age;
//    }
//    @Override
//    public String toString() {
//        return "Person [name=" + name + ", age=" + age + "]";
//    }
//}
//public class P1{
//    public static final File FILE = new File("/Users/yuisama/Desktop/testSer.txt") ;
//    public static void main(String[] args) throws Exception {
//        ser(new Person("yuisama", 25)) ;
//    }
//    public static void ser(Object obj) throws FileNotFoundException, IOException {
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE)) ;
//        oos.writeObject(obj ) ;
//        oos.close() ;
//    }
//}

import java.lang.ref.WeakReference;

public class P1{
    private Object instance;
    private static int _1MB =  1024 * 1024;
    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) {
        P1 test = new P1();
        WeakReference w = new WeakReference(test);
        test = null;
        System.gc();
    }
}

//interface IMessage{
//    public static final String MSG = "我是靓仔";//全局常量
//    public abstract void print();//抽象方法
//}
//
//interface INews{
//    public abstract String getName();
//}
//
//abstract class New{
//    //抽象类中方法前面的abstract不能省略，否则就是普通方法
//    public abstract void setName();
//}
//
//class MessageImpl extends New implements IMessage,INews{
//    @Override
//    public void setName() {
//        System.out.println("我是靓仔！");
//    }
//
//    @Override
//    public String getName() {
//        return IMessage.MSG;//访问常量都建议加上类名称
//    }
//
//    @Override
//    public void print() {
//        System.out.println(getName());
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        IMessage m = new MessageImpl();//子类向上转型
//        m.print();//调用被子类覆写过的方法
//        INews n = (INews) m;
//        System.out.println(n.getName());
//        New news = (New) m ;
//        news.setName();
//    }
//}
////我是靓仔
////我是靓仔
////我是靓仔！

//interface A{
//    public void printA();
//    static interface D{
//        public void print();
//    }
//}
//
//interface B{
//    public void printB();
//}
//
//interface C extends A,B{
//    //接口多继承
//    public void print();
//}
//
//class Impl implements A.D{
//    @Override
//    public void print(){}
//}

///**
// * 定义一个USB标准
// */
//interface USB{
//    /**
//     * 安装驱动
//     */
//    public void setUp();
//
//    /**
//     * 进行工作
//     */
//    public void work();
//}
///**
// * 定义电脑类
// */
//class Computer{
//    /**
//     * 插入USB设备
//     * @param usb
//     */
//    public void plugin(USB usb){
//        usb.setUp();//安装
//        usb.work();//工作
//    }
//}
//
///**
// * 定义一个USB设备
// */
//class UDisk implements USB{
//    @Override
//    public void setUp() {
//        System.out.println("安装打印机驱动");
//    }
//
//    @Override
//    public void work() {
//        System.out.println("打印机开始工作");
//    }
//}

//interface Computer{
//    void printComputer();
//}
//
//class MackbookProComputer implements Computer{
//    @Override
//    public void printComputer() {
//        System.out.println("MackbookPro");
//    }
//}
//
//class SuferaceBookComputer implements Computer{
//    @Override
//    public void printComputer() {
//        System.out.println("SufaceBook");
//    }
//}
//
//public class Test{
//    public void buyComputer(Computer computer){
//        computer.printComputer();
//    }
//
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.buyComputer(new MackbookProComputer());
//    }
//}

import java.util.Scanner;

interface Computer{
    void printComputer();
}

class MacbookProComputer implements Computer{
    @Override
    public void printComputer() {
        System.out.println("MackbookPro");
    }
}

class SurfaceBookComputer implements Computer{
    @Override
    public void printComputer() {
        System.out.println("SurfaceBook");
    }
}

interface ComputerFactory{
    Computer createComputer();
}

class MsFactory implements ComputerFactory{
    @Override
    public Computer createComputer() {
        return new SurfaceBookComputer();
    }
}

class AppleFactory implements ComputerFactory{
    @Override
    public Computer createComputer() {
        return new MacbookProComputer();
    }
}

public class Test{
    public void buyComputer(Computer computer){
        computer.printComputer();
    }

    public static void main(String[] args) {
        Test t = new Test();
        ComputerFactory factory = new AppleFactory();
        t.buyComputer(factory.createComputer());
    }
}

1.第一题：两数之和
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //HashMap的键值对，前一位为数组真实值作为key，数组索引下标作为value存入
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        //从前往后将元素与指定值做减法，比对HashMap中是否有对应元素，有的话输出，没有继续往后走
        for(int i = 0; i < nums.length; i ++){
            //判断HashMap中是否存在与num[i]对应的元素
            if(map.containsKey(target - nums[i])){
                //如果存在
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            //如果不存在，将当前元素放入HashMap
            map.put(nums[i], i);
        }
        return result;
    }
}

2.第二题：两数相加
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //排除空链表影响
        if(l1 == null){
            l1 = new ListNode(0);
        }
        if(l2 == null){
            l2 = new ListNode(0);
        }
        //恰好两个链表一起加完
        if(l1.next == null && l2.next == null){
            int val = l1.val + l2.val;
            //如果发生进位
            if(val > 9){
                //逆序放入
                ListNode node = new ListNode(val % 10);
                node.next = new ListNode(val / 10);
                return node;
            }else{
                //如果不发生进位
                return new ListNode(val);
            }
        }else{
            //l1不为空l2不为空l1l2均不为空
            int val = l1.val + l2.val;
            //如果需要进位
            if(val > 9){
                val = val % 10;
                //当l1的下一个值不为空或l1l2的下一个值均不为空时进位值加给l1的下一位
                if(l1.next != null){
                    l1.next.val ++;
                }else if(l2.next != null){
                    //当l1的下一个值为空，将进位的值加给l2的下一个值
                    l2.next.val ++;
                }
            }
            //如果不需要进位
            ListNode node = new ListNode(val);
            //链表还不为空则继续进行合并
            node.next = addTwoNumbers(l1.next, l2.next);
            return node;
        }
    }
}

3.第三题：无重复字符的最长子串
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        int left = 0;
        int right = 0;
        //转成数组
        char[] chars = s.toCharArray();
        //定义HashMap存放字母和在数组中的索引
        Map<Character,Integer> map = new HashMap<>();
        while(right < chars.length && left < chars.length){
            //当遇到重复元素
            if(map.containsKey(chars[right])){
                //判断新的重复是不是在上次重复范围之外
                if(left < map.get(chars[right]) + 1){
                    left = map.get(chars[right]) + 1;
                }
            }
            //没遇到重复元素
            map.put(chars[right], right ++);
            len = Math.max(len, right - left);
        }
        return len;
    }
}

4.第四题：查找两个有序数组的中位数
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 =  nums1.length;        
        int len2 = nums2.length;
        int size = len1 + len2;
        if(size % 2 == 1){
            return finfK(nums1, 0, len1, nums2, 0, len2, size / 2 + 1);
        }else{
            return (finfK(nums1, 0, len1, nums2, 0, len2, size / 2 + 1) + finfK(nums1, 0, len1, nums2, 0, len2, size / 2)) / 2;
        }
    }
    
    //定义方法，在两个有序数组中查找第K个数
    public double finfK(int[] nums1, int start1, int len1, int[] nums2, int start2, int len2, int k){
        //规定短的数组为nums1
        if((len1 - start1) > (len2 - start2)){
            return finfK(nums2, start2, len2, nums1, start1, len1, k);
        }
        //如果短的数组为空，直接在长的数组中返回下标K-1就是第K个元素
        if(len1 - start1 == 0){
            return nums2[k - 1];
        }
        //两个有序数组中第1个数就是二个数组中两个下标1的数的较小一个
        if(k == 1){
            return Math.min(nums1[start1], nums2[start2]);
        }
        //较短的数组可能越界，p表示该数组应该查找到的位置
        int p = start1 + Math.min(len1 - start1, k / 2);
        //较长数组中查找K- 1个数的剩余部分，查找到下标为q的位置
        int q = start2 + k - p + start1;
        //较小的部分被丢弃
        if(nums1[p - 1] < nums2[q - 1]){
            return finfK(nums1, p , len1, nums2, start2, len2, k - p + start1);
        }else if(nums1[p - 1] > nums2[q - 1]){
            return finfK(nums1, start1 , len1, nums2, q, len2, k - q + start2);
        }else{
            return nums1[p - 1];
        }
    }
}

15.第十五题：三数之和
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //定义数组，每个数组里面存放一个List放置相加为0的三个元素
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        //将数组排序，相同的元素连续出现，这样容易排除重复情况
        Arrays.sort(nums);
        //固定一个元素，另外两个元素在其后部分查找，在固定元素之后只剩一个元素时停止查找
        for(int i = 0; i < nums.length - 1; i ++){
            //第一个元素遇见重复的元素直接往后走
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            //定义左右两个元素下标作为查找剩余两个数的索引
            int left = i + 1;
            int right = nums.length - 1;
            //当左小于右说明后面的元素还没走完
            while(left < right){
                //首元素固定，有序队列中，相加大于0，右下标左移，如果小于0，坐下标右移
                if(nums[i] + nums[left] + nums[right] > 0){
                    right --;
                }else if(nums[i] + nums[left] + nums[right] < 0){
                    left ++;
                }else{
                    //放入数组中
                    //Arrays调用asList将参数线性存放返回一个List
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left ++;
                    right --;
                    //判断
                    while(left < right && nums[left] == nums[left - 1]){
                        left ++;
                    }
                    while(left < right && nums[right] == nums[right + 1]){
                        right --;
                    }
                }
            }
        }
        return list;
    }
}

147.第一百四十七题：对链表进行插入排序
class Solution {
    public ListNode insertionSortList(ListNode head) {
    //空链表或只有一个结点时不用排序直接返回
        if(head == null || head.next == null){
            return head;
        }
        //定义一个新的链表头部
        ListNode pre = new ListNode(-1);
        //用临时变量存放新链表的头部
        ListNode ans = pre;
        //cur在原链表向后遍历作为每次即将新插入的节点
        ListNode cur = head;
        //内次取出原链表中一个节点插入新的链表
        while(cur != null){
            //每次循环将pre重置为头结点，保证每次从前往后遍历
            pre = ans;
            //当pre.next.val大于等于cur.val或者pre.next为null时结束这一趟遍历，否则pre要不断后移
            while(pre.next != null && pre.next.val < cur.val){
                pre= pre.next;
            }
            //此时pre要么走到了最后，要么找到了val大于等于cur的节点，不管如何都应该把cur插入到pre后
            //先保存cur的下一个节点，保证原链表走到哪里被记住
            ListNode tmp = cur.next;
            //将cur插入到pre后面
            cur.next = pre.next;
            pre.next = cur;
            //cur回归原链表
            cur = tmp;
        }
        return ans.next;
    }
}

396.第三百九十六题：旋转函数
class Solution {
    public int maxRotateFunction(int[] A) {
        //这个题主要从数学角度，找规律
        //arr={a,b,c,d}
        //F(0) = 0a+1b+2c+3d
        //F(1) = 0d+1a+2b+3c
        //F(2) = 0c+1d+2a+3b
        //F(3) = 0b+1c+2d+3a
        //sum = a+b+c+d
        //F(1) = F(0)+a+b+c-3d = F(0)+sum-4d
        //F(2) = F(1)+d+a+b-3c = F(1)+sum-4c
        //F(3) = F(2)+c+d+a-3b = F(2)+sum-4b
        //得出F(k) = F(k-1)+sum-arr.length*arr[a.length-k]
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        //先计算F(0)
        int data = 0;
        for (int i = 0; i < A.length; i++) {
            data += i * A[i];
        }
        //默认max = F(0)
        int max = data;
        for (int k = 1; k < A.length; k++) {
            data = data + sum - (A.length) * A[A.length - k];
            //max取较大一个
            max = (max > data) ? max : data;
        }
        return max;
    }
}

-- 查询年龄大于32的人
SELECT * FROM student WHERE age > 32;
-- 查询年龄大于等于32的人
SELECT * FROM student WHERE age >= 32;
-- 查询年龄等于32的人
SELECT * FROM student WHERE age = 32;
-- 查询年龄不等于32的人
SELECT * FROM student WHERE age != 32;
SELECT * FROM student WHERE age <> 32;

-- 查询年龄大于32小于56的人
SELECT * FROM student WHERE age > 32 && age < 56;
SELECT * FROM student WHERE age > 32 AND age < 56;

-- 查询年龄大于32小于56的人（包含32和56）
SELECT * FROM student WHERE age BETWEEN 32 AND 56;

--年龄为32,56,44的
SELECT * FROM student WHERE age = 32 OR age = 56 OR age = 44;
SELECT * FROM student WHERE age = 32 || age = 56 || age = 44;
SELECT * FROM student WHERE age IN (32,56,44);

-- 查询没有英语成绩的人
SELECT * FROM student WHERE english = NULL;
SELECT * FROM student WHERE english IS NULL;
SELECT * FROM student WHERE english IS NOT NULL;

-- 查询名字以小开头的
SELECT * FROM student WHERE NAME LIKE '小%';

-- 查询名字中第二个字是可的
SELECT * FROM student WHERE NAME LIKE '_可%';

-- 查询名字是三个字的
SELECT * FROM student WHERE NAME LIKE '___';

-- 查询名字带可的
SELECT * FROM student WHERE NAME LIKE '%可%';

-- 按english升序排名
SELECT * FROM student ORDER BY english;
SELECT * FROM student ORDER BY english ASC;

-- 按english降序排名
SELECT * FROM student ORDER BY english DESC;

-- 按english升序排名，如果英语成绩一样按照数学降序排名
SELECT * FROM student ORDER BY english,math DESC ;

-- 一共多少人
SELECT COUNT(*) FROM student;-- 只要该条数据中有一个属性不为空count时就不看做NULL

-- 数学最大值
SELECT MAX(math) FROM student;
-- 数学最小值
SELECT MIN(math) FROM student;
-- 计算数学总和
SELECT SUM(math) FROM student;
-- 计算数学平均分
SELECT AVG(math) FROM student;、

-- 按照性别分组，分别查询男女同学的数学平均分和男女生人数
SELECT sex,AVG(math),COUNT(NAME) FROM student GROUP BY sex;

-- 按照性别分组，分别查询男女同学的数学平均分和男女生人数，数学低于30不参与分组
SELECT sex,AVG(math),COUNT(NAME) FROM student WHERE math > 30 GROUP BY sex;

-- 按照性别分组，分别查询男女同学的数学平均分和男女生人数，数学低于30不参与分组，分组之后人数大于3再显示
SELECT sex,AVG(math),COUNT(NAME) FROM student WHERE math > 30 GROUP BY sex HAVING COUNT(NAME) > 3;

-- 每页显示三条数据
SELECT * FROM student LIMIT 0,3;
SELECT * FROM student LIMIT 3,3;

CREATE TABLE sttu(
	id INT,
	NAME VARCHAR(20) NOT NULL-- name非空
);

-- 去掉表的约束
ALTER TABLE sttu MODIFY NAME VARCHAR(20);

-- 创建完表再添加非空约束
ALTER TABLE sttu MODIFY NAME VARCHAR(20) NOT NULL;

DROP TABLE sttu;

-- 创建表时添加唯一约束
CREATE TABLE sttu(
	id INT,
	NAME VARCHAR(20) UNIQUE-- 唯一约束
);

-- 删除唯一约束
ALTER TABLE sttu DROP INDEX NAME;-- 很多时候唯一约束也叫唯一索引

-- 建成表后添加唯一约束
ALTER TABLE sttu MODIFY NAME VARCHAR(20) UNIQUE;

DROP TABLE sttu;

-- 创建表时添加主键约束
CREATE TABLE sttu(
	id INT PRIMARY KEY,
	NAME VARCHAR(20)-- 唯一约束
);

-- 删除主键约束
ALTER TABLE sttu DROP PRIMARY KEY;

-- 创建表后添加主键约束
ALTER TABLE sttu MODIFY id INT PRIMARY KEY;


DROP TABLE sttu;

-- 创建表时添加主键约束并完成自增长
CREATE TABLE sttu(
	id INT PRIMARY KEY AUTO_INCREMENT,-- 添加主键自增长
	NAME VARCHAR(20)-- 唯一约束
);

INSERT INTO sttu VALUES(NULL,'ddd');

INSERT INTO sttu VALUES(10,'ddd');
INSERT INTO sttu VALUES(NULL,'ddd');

-- 删除自动增长
ALTER TABLE sttu MODIFY id INT;

-- 建表后添加自动增长
ALTER TABLE sttu MODIFY id INT AUTO_INCREMENT;
INSERT INTO sttu VALUES(NULL,'ddd');

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Main{
    //使用信号量，定义三个信号量
    private static Semaphore A = new Semaphore(1);
    private static Semaphore B = new Semaphore(1);
    private static Semaphore C = new Semaphore(1);

    static class ThreadA extends Thread{
        @Override
        public void run() {
            try{
                //A先于B获取
                A.acquire();
                System.out.print("_A");
                B.release();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    static class ThreadB extends Thread{
        @Override
        public void run() {
            try{
                //B先于C获取
                B.acquire();
                System.out.print("_B");
                C.release();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    static class ThreadC extends Thread{
        @Override
        public void run() {
            try{
                //C获取
                C.acquire();
                System.out.print("_C");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        StringBuffer str = new StringBuffer(cin.nextLine());
        cin.close();
        System.out.print(str);
        new ThreadA().start();
        new ThreadB().start();
        new ThreadC().start();
    }
}