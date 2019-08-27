//abstract class Person{
//    private String name;
//    public String getname(){
//        return name;
//    }
//    public abstract void home();
//}

//class Student extends Person{
//    public void home(){
//        System.out.println("邹鸡儿吃狗屎");
//    }
//}

//public class Test{
//    public static void main(String[] args){
//        // Person  per1 = new Person();
//        // per1.name = "邹二狗";
//        // per1.age = 20;
//        // per1.eat();
//        // per1.sleep();
//        // per1.work();
//        Person per = new Student();
//        per.home();
//    }
//}

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLOutput;

//public class Test {
//    public static void main(String[] args){
//        //获取File对象
//        File file = new File("C:" + File.separator + "Users"
//                + File.separator + "15291" + File.separator + "Desktop"
//                + File.separator + "bit");
//        //判断父路径是否存在，不存在创建多级父路径
//        if(!file.getParentFile().exists()){
//            file.getParentFile().mkdirs();
//        }
//        //判断文件是否存在，不存在创建文件
//        if(file.exists()){
//            System.out.println("文件已存在");
//        }else{
//            try{
//                file.createNewFile();
//            }catch(IOException e){
//                e.printStackTrace();
//            }
//        }
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        //获取File对象
//        File file = new File("C:" + File.separator + "Users"
//                + File.separator + "15291" + File.separator + "Desktop");
//        //将IO操作放在子线程中进行
//        new Thread(()->{
//            long start = System.currentTimeMillis();
//            listAllFiles(file);
//            long end = System.currentTimeMillis();
//            System.out.println("桌面文件遍历结束，共耗时：" + (end - start) + "毫秒");
//        }).start();
//        System.out.println("main线程结束");
//    }
//    public static void listAllFiles (File file){
//        if (file.isFile()) {
//            System.out.println(file);
//        } else {
//            if (file.exists() && file.isDirectory()) {
//                File[] files = file.listFiles();
//                for (File file1 : files) {
//                    listAllFiles(file1);
//                }
//            }
//        }
//    }
//}


public class Test{
    public static void main(String[] args) throws Exception{
        //取得终端对象
        File file = new File("C:" + File.separator + "Users"
                + File.separator + "15291" + File.separator + "Desktop"
                + File.separator + "bit");
        //取得指定文件的输出流
        OutputStream out = new FileOutputStream(file,true);
        //进行数据的输出
        String str = "hello world";
        out.write(str.getBytes(),6,5);
        //关闭流
        out.close();
    }
}



//import java.sql.SQLOutput;
//
//class Person{
//    private String name;
//    private int age;
//    public Person(String name,int age){
//        this.name = name;
//        this.age = age;
//    }
//    @Override
//    public String toString(){
//        return "名字：" + this.name + "  年龄：" + this.age;
//    }
//}
//
//public class test{
//    public static void main(String[] args) {
//        fun(new Person("xiaokeai",18));//名字：xiaokeai  年龄：18
//        fun("Hello");//Hello
//    }
//    public static void fun(Object obj){
//        System.out.println(obj.toString());//
默认输出对象调用的就是toString()方法
//    }
//}
//class Person{
//    private String name;
//    private int age;
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//    @Override
//    public String toString(){
//        return "名字：" + this.name + "  年龄：" + this.age;
//    }
//    @Override
//    public boolean equals(Object obj){
//        //对象判空
//        if(obj == null){
//            return false;
//        }
//        //判断是不是当前对象
//        if(this == obj){
//            return true;
//        }
//        //判断是不是Person类对象
//        if(!(obj instanceof Person)){
//            return false;
//        }
//        //是当前类对象
//        //向下转型比较属性值
//        Person person = (Person)obj;
//        return this.name.equals(person.name) && this.age == person.age;
//    }
//}
//
//public class test{
//    public static void main(String[] args) {
//        Person per1 = new Person("zoujier",18);
//        Person per2 = new Person("zoujier",18);
//        System.out.println(per1.equals(per2));
//    }
//}
//public class test{
//    public static void main(String[] args) {
//        //object接收数组对象，向上转型
//        Object obj = new int[]{1,2,3,4,5,6};
//        //向下转型，需要强转
//        int[] data = (int[])obj;
//        for(int i = 0;i < data.length; i ++){
//            System.out.println(data[i]);
//        }
//    }
//}
////1
////2
////3
////4
////5
////6
interface IMessage{
    public void getMessage();
}

class MessageImpl implements IMessage{
    @Override
    public String toString(){
        return "i am father";
    }
    public void getMessage(){
        System.out.println("我是大帅哥");
    }
}

public class test{
    public static void main(String[] args) {
        //子类向父接口转型
        IMessage msg = new MessageImpl();
        //接口向Object转型
        Object obj = msg;
        System.out.println(obj);
        //强制转换类型
        IMessage temp = (IMessage) obj;
        temp.getMessage();
    }
}
//i am father
//我是大帅哥

////这里的IntDemo实际上就是int数据类型的包装类
//class IntDemo{
//    private int num;
//    public IntDemo(int num){
//        this.num = num;
//    }
//    public int intValue(){
//        return this.num;
//    }
//}
//
//public class test{
//    public static void main(String[] args) {
//        //子类对象向上转型
//        Object obj = new IntDemo(55);
//        //向下转型
//        IntDemo temp = (IntDemo)obj;
//        //取出里面的基本数据类型操作
//        System.out.println(temp.intValue());
//    }
//}
////输出
////55

//public boolean equals(Object obj){
//    //自反性
//        if(obj == this){
//            return true;
//        }
//        //非空性
//        else if(obj == null){
//            return false;
//        }
//        else if(!(obj instanceof Person)){
//            return false;
//        }
//        //比较属性
//        Person per = (Person)obj;
//        return per.age.equals(this.age) && per.name.equals(this.name);
//        }

//import java.util.*;
//
//public class test{
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("My");
//        list.add("Son");
//        //取得ArrayList的双向迭代器
//        ListIterator<String> iterator = list.listIterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println("------------------------");
//        while(iterator.hasPrevious()){
//            System.out.println(iterator.previous());
//        }
//    }
//}

import java.util.*;

public class test{
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Hello");
        vector.add("My");
        vector.add("Son");
        Enumeration<String> enumeration = vector.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
//输出
//Hello
//My
//Son

    final void checkForComodification(){
        if(modCout != expectedModCount)
            throw new ConcurrentModificationExeption();
    }
	
	
//public class test{
//    public static void main(String[] args) {
//        Integer num = new Integer(55);//装箱
//        int data = num.intValue();//拆箱
//        System.out.println(data);
//    }
//}
////输出
////55
//public class test{
//    public static void main(String[] args) {
//        //自动装箱
//        Integer x = 55;
//        //可以直接利用包装类对象操作
//        System.out.println(++x);
//    }
//}
////输出
////56
public class test{
    public static void main(String[] args) {
//        Integer num1 = new Integer(10);
//        Integer num2 = new Integer(10);
//        System.out.println(num1 == num2);//false
//        System.out.println(num1 == new Integer(10));//false
//        System.out.println(num1.equals(num2));//true
//        System.out.println(num1.equals(new Integer(10)));//true
//        String str = "123";//String类型
//        int num = Integer.parseInt(str);
//        System.out.println(num);//123
//        String str = "123" ; // String类型
//        double num = Double.parseDouble(str) ;
//        System.out.println(num);//123.0
//        String str = "123aassa" ; // String类型
//        double num = Double.parseDouble(str) ;
//        System.out.println(num);
//        String str = "346" ; // String类型
//        boolean num = Boolean.parseBoolean(str) ;
//        System.out.println(num);//false
        String str = String.valueOf(100) ;
        System.out.println(str);//100
    }
}
//Exception in thread "main" java.lang.NumberFormatException: For input string
: "123aassa"

//class Outer{
//    private String msg = "Hello World";
//    //定义一个内部类
//    class Inner{
//        //在内部类中定义一个普通方法
//        public void print(){
//            //调用msg属性
//            System.out.println(msg);
//        }
//    }
//    //在外部类中定义一个方法，该方法负责产生内部类对象并且调用print()方法
//    public void fun(){
//        Inner in = new Inner();
//        in.print();
//    }
//}

//class Outer{
//    private String msg = "Hello World";
//    //定义如下方法取得私有属性msg
//    public String getMsg(){
//        return msg;
//    }
//    //定义当前对象的fun方法获得一个Inner的对象并调用print()方法
//    public void fun(){
//        Inner in = new Inner(this);
//        in.print();
//    }
//}
//
//class Inner{
//    private Outer out = new Outer();
//    public Inner(Outer out){
//        this.out = out;
//    }
//    public void print(){
//        System.out.println(out.getMsg());
//    }
//}
//
//public class Test{
//    public static void main(String[] args){
//        Outer out = new Outer();
//        out.fun();
//    }
//}
//////Hello World

//class Outter{
//    private static String msg = "Hello World";
//    //定义一个静态内部类
//    static class Inner{
//        public void print(){
//            System.out.println(msg);
//        }
//    }
//    //在外部类中定义一个方法，该方法负责产生内部类对象并且调用print()方法
//    public void fun(){
//        Inner in = new Inner();
//        in.print();
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        Outter.Inner in = new Outter.Inner();
//        in.print();
//    }
//}
////Hello World

class Outter{
    private static String msg = "Hello World";
    public void fun(int num){
        class Inner{
            public void print(){
                System.out.println("num:" + num);
                System.out.println("msg:" + msg);
            }
        }
        //产生内部类并调用方法
        new Inner().print();
    }
}

public class Test{
    public static void main(String[] args) {
        Outter out = new Outter();
        out.fun(22);
    }
}
//num:22
//msg:Hello World

//import java.util.Stack;
//
//public class Test {
//    Stack<Integer> stack1 = new Stack<>();
//    Stack<Integer> stack2 = new Stack<>();
//
//    public void push(int node) {
//        //入栈压入第一个栈
//        stack1.push(node);
//    }
//
//    public int pop() {
//        Integer re = null;
//        //如果栈二不为空，要把里面的元素先弹出
//        if(!stack2.empty()){
//            re = stack2.pop();
//        }else{
//            //栈二为空时，把栈一中的元素全部弹入栈二，然后再出栈
//            while(!stack1.empty()){
//                re = stack1.pop();
//                stack2.push(re);
//            }
//            //栈二中有数了就直接弹出栈二的元素
//            if(!stack2.empty()){
//                re = stack2.pop();
//            }
//        }
//        //如果栈一此时也为空，直接返回re(null)，否则返回re
//        return re;
//    }
//
//
//    public static void main(String[] args) {
//        Test s = new Test();
//        for (int i = 0; i < 100; i++) {
//            s.push(i);
//        }
//        for (int i = 0; i < 100; i++) {
//            int pop = s.pop();
//            System.out.println(pop);
//        }
//    }
//}

import java.util.Stack;
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

}

public class Test{

    public void Mirror(TreeNode root) {
        //头结点为空直接退出
        if(root == null){
            return;
        }
        //创建栈存放结点
        Stack<TreeNode> stack = new Stack<>();
        //将头节点入栈
        stack.push(root);
        //栈不为空就找栈的第一个节点
        while(!stack.isEmpty()){
            TreeNode root1 = stack.pop();
            //交换左右节点
            TreeNode tmp = root1.right;
            root1.right = root1.left;
            root1.left = tmp;
            //如果左右节点不为空就在入栈，此时左右节点已经交换，先入右节点相当于先入左节点，后出放到右节点位置
            if(root1.right != null){
                stack.push(root1.right);
            }
            if(root1.left != null){
                stack.push(root1.left);
            }
        }
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

16.第十六题：最接近的三数之和
class Solution {
    public int threeSumClosest(int[] nums, int target) {
         // 先排序，这样固定一个数，另外两个数采用头尾指针法会更快
        Arrays.sort(nums);
        // 定义一个数，用于不断刷新保存最接近目标的值
        int closeNum = nums[0] + nums[1] + nums[2];
        //固定第一个数
        for (int i = 0; i < nums.length - 2; i++) {
            //剩下两个数一个从固定数的下一位往后，一个从数组最后往前
            int l = i + 1, r = nums.length - 1;
            while (l < r){
                int threeSum = nums[l] + nums[r] + nums[i];
                //刷新closeNum
                if (Math.abs(threeSum - target) < Math.abs(closeNum - target)) {
                    closeNum = threeSum;
                }
                //当最接近目标值的数大于目标数，那么数组尾部指针前移找更小的，反之则前面的指针往后移动找更大的组合
                if (threeSum > target) {
                    r--;
                } else if (threeSum < target) {
                    l++;
                } else {
                    // 如果已经等于target的话, 肯定是最接近的，直接输出
                    return target;
                }

            }

        }
        return closeNum;
    }
}

35.第三十五题：搜索插入位置
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) >> 1;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
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

182.第一百八十二题：查找重复的电子邮箱
# having后面可以跟聚合函数作为分组条件，不符合条件的不显示
select Email from person group by Email having count(Email) > 1;

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

539.第五百三十九题：最小时间差
class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] times=new int[timePoints.size()];
        int idx=0;
        //将时间都转为分钟存储起来
        for (String s:timePoints)
        {
            times[idx++]=getMinute(s);
        }
        //将时间从小到大排列，那么时差最小的两个时间必定相邻，注意第一个和最后一个
        Arrays.sort(times);
        //第一个和最后一个时间差
        int res=times[0]+24*60-times[times.length-1];
        //从前往后每两个时间点时差与res比较取小的
        for (int i=1;i<times.length;i++)
        {
            res=Math.min(times[i]-times[i-1],res);
        }
        return res;
    }

    //将时间转化为分钟
    private int getMinute(String s) {
        String[] strs=s.split(":");
        return Integer.parseInt(strs[0])*60+Integer.parseInt(strs[1]);
    }
}

543.第五百四十三题：二叉树的直径
class Solution {
    //全局变量保留最大的直径值
    private int res =0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter(root);
        return res;
    }

    public int maxDiameter(TreeNode root)
    {
        if (root == null){
            return 0;
        }
      //递归左字数和右子树
        int r = maxDiameter(root.right);
        int l = maxDiameter(root.left);
        //更新直径
        res = Math.max(res,l+r);
        //返回的是该节点所在的层数，由下往上，左右子树层数大的一个再加一是当前节点层数
        return Math.max(l,r)+1;
    }
}

763.第七百六十三题：划分字母区间
class Solution {
    public List<Integer> partitionLabels(String S) {
        //当字符串未复制时直接返回空的List
        if (S == null || S.length() == 0) {
            return Collections.emptyList();
        }
        //index维护各字母的最大索引位置
        int[] index = new int[26];
        for (int i = 0; i < S.length(); i++) {
            //同一个字母减'a'的值相等，所以会映射到index数组的相同位置，然后index存入刷新的i，那么index中保存的是每个字母在字符串中最靠后的索引位置
            index[S.charAt(i) - 'a'] = i;
        }
        //保存当前搜索区间的最大索引
        int maxIndex = 0;
        //保存当前搜索区间的开始索引
        int start = 0;
        //结果集
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < S.length(); i++) {
            //第一个字母最后出现的位置之前所有字母在字符串中最靠后位置就是一个完整的分隔
            //maxIndex保存本此搜索区间的最大索引
            maxIndex = Math.max(maxIndex, index[S.charAt(i) - 'a']);
            //如果当前位置就是索引区间最大值，则将当前索引减去本区间开始位置再+1就是本区间字母个数
            if (i == maxIndex) {
                list.add(maxIndex - start + 1);
                //当前位置后移成为新的搜索期间
                start = i + 1;
            }
        }
        return list;
    }
}

837.第八百三十七题：新21点
class Solution {
    public double new21Game(int N, int K, int W) {
        if(K == 0) {
            return 1;
        }
        //1-W每个选择的概率
        double everOne = 1.f / W;
        //其中满足<=N的数量是
        int lessNCount = N - K + 1;
        //我们记录算出来的所有开始分数的概率
        double[] probability = new double[K];
        probability[K - 1] = lessNCount * everOne;
        for (int currK = K - 2; currK >= 0; currK --) {
            double currValue = probability[currK + 1];
            //也就是说currK是在currK-1的基础上减去currK+W+1，加上currK+1，其中currK+1或者currK+W+1都是我们已经计算过的
            currValue += (everOne * currValue);
            //满足这个条件说明减去的数是在<=n范围内，>n的数不会加到结果概率中的，内部为什么要乘everOne?因为你选到这个数的概率就是这么多，我们当前需要乘了。
            if(currK + W + 1 <= N) {
                //满足这个条件说明减去的数是递归获得的，因为分数<k会继续抽取
                if(currK + W + 1 < K) {
                    currValue -= everOne * probability[currK + W + 1];
                }
                //否则就是>=k，也就是不需要继续抽取的情况，那么概率是一个固定值
                else {
                    currValue -= everOne * 1;
                }
            }
            probability[currK] = currValue;
        }
        return probability[0];
    }
}

 
921.第九百二十一题：使括号有效的最少添加
class Solution {
    public int minAddToMakeValid(String S) {
        char[] c = S.toCharArray();
        //left记录需要与'('匹配的')'数
        int left = 0;
        //left记录需要与')'匹配的'('数
        int right = 0;
        for (int i = 0; i < c.length; i++) {
            //出现一个左括号需要一个右括号相配，left++
            if ('(' == c[i]) {
                left++;
            } else {
                //出现右括号时判断左括号此时需要的右括号数是否为0，不为0真好出现了右括号，给left--就好，否则需要一个与右括号相配的左括号，right要++
                if(left > 0){
                    left--;
                }else{
                    right++;
                }
            }
        }
        //返回需要的左括号数加需要的右括号数
        return left + right;
    }
}

931. 第九百三十一题：下降路径最小和
//dp[i][j]表示以A中第i行第j列位置为结束点时，对应的下降路劲最小和
//dp[i][j] = min{dp[i-1][j], dp[i-1][j+1]} + A[i][j], j = 0(前面第一列)
//dp[i][j] = min{dp[i-1][j-1], dp[i-1][j], dp[i-1][j+1]} + A[i][j], 1 < j < A.length-1 (中间列)
//dp[i][j] = min{dp[i-1][j-1], dp[i-1][j]} + A[i][j], j = A.length-1(最后一列)
class Solution {
    public int minFallingPathSum(int[][] A) {
        //行数
        int len = A.length;
        //正方形数组，所以行列相等，该数组每个位置存放的值是到达该位置的最小下降路径
        int[][] dp = new int[len][len];
        //填充第一行
        for(int i = 0; i < len; i++){
            dp[0][i] = A[0][i];
        }
        //从第二行填充所有位置的最小下降路径值
        for(int i = 1; i < len; i++){
            // 第一列计算
            dp[i][0] = Math.min(dp[i-1][0], dp[i-1][1]) + A[i][0];
            // 中间列计算
            for(int j = 1; j < len-1; j++){
                dp[i][j] = Math.min(Math.min(dp[i-1][j-1], dp[i-1][j]), dp[i-1][j+1]) + A[i][j];
            }
            // 最后一列计算
            dp[i][len-1] = Math.min(dp[i-1][len-2], dp[i-1][len-1]) + A[i][len-1];
        }
        int res = Integer.MAX_VALUE;
        // 求最后一行中的最小值
        for(int j = 0; j < len; j++){
            res = Math.min(res, dp[len-1][j]);
        }
        return res;
    }
}



989.第九百八十九题：数组形式的整数加法
class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        //定义新的数组存储返回值
        List<Integer> list=new ArrayList<>();
        int num=A.length-1;
        int jinwei=0;
        //当K为0，数组A无效且进位为0时直接返回空的数组list，list为空，是否翻转无所谓
        //但凡K不为0或者A数组有效或者当前还有进位时，都要再次进入循环
        while(K!=0||num>=0||jinwei!=0){
            int temp=0;
            //tmp从后往前存储A数组当前位置的值
            if(num>=0){
                temp+=A[num];
                num--;
            }
            //K不为0表示要和数组去加
            if(K!=0){
                //用数组A当前位加上K对10取余即得到K对应位的值
                temp+=K%10;
                //K对10取整抛去已经合并过的最低位
                K=K/10;
            }
            //先判断当前是否有上次进位的值，有的话加到tmp
            if(jinwei==1){
                temp+=jinwei;
                jinwei=0;
            }
            //要不要向下一次计算
            if(temp>=10){
                //进位，大于10进位，list保存个位值
                list.add(temp-10);
                jinwei=1;
            }else{
                //不进位
                list.add(temp);
                jinwei=0;
            }
        }
        //因为list将A数组和K的合并结果后往保存，所以翻转
        Collections.reverse(list);
        return list;
    }
}