package bit.reflect;

import java.lang.reflect.Method;

class Person {
     private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Test {
    public static void main(String[] args) throws Exception{
//        Person per = new Person();
//        per.setName("张三");
//        System.out.println(per.getName());
        // 1.取得Class对象
        Class<Person> cls = Person.class;
        // 2.组装方法名称
        String setMethodName = "set"+initCap(args[0]);
        String getMethodName = "get"+initCap(args[0]);
        // 3.取得Method对象
        Method setMethod = cls.getMethod(setMethodName,String.class);
        Method getMethod = cls.getMethod(getMethodName);
        // 4.取得Person类实例化对象而后调用方法
        Person per = cls.newInstance();
        setMethod.invoke(per,"张三");
        System.out.println(getMethod.invoke(per));
    }
    private static String initCap(String str) {
        return str.substring(0,1).toUpperCase()+
                str.substring(1);
    }
}


BeanUtil.java
package bit.reflect;

import java.lang.reflect.Method;

/**
 * 操作简单类属性设置的工具类
 * @author yuisama
 * @date 2018/12/2 15:19
 */
public class BeanUtil {
    private BeanUtil(){}
    /**
     *
     * @param actionObj 拿到提供给用户使用的xxAction类
     * @param beanValue 要设置的具体值
     *"emp.name:dange|emp.job:Coder"
     */
    public static void setBeanValue(Object actionObj,String beanValue) throws Exception{
         String[] temp = beanValue.split("\\|");
         for(int i = 0;i < temp.length;i++) {
             // emp.name:dange
             String[] result = temp[i].split(":");
             // emp.name
             // dange
             String realValue = result[1];
             // emp.name
             String className = result[0].split("\\.")[0];
             String attrName = result[0].split("\\.")[1];
             Object realObj = getRealObject(actionObj,className);
             // TODO
             // 调用真正类的setter方法设置属性值
             // 取得真正主题类的class对象
             Class<?> cls = realObj.getClass();
             // 拼装setter方法名
             String setName  = "set" + initCap(attrName);
             // 取得setter方法的method对象
             Method setMethod = cls.getMethod(setName,String.class);
             // 调用invoke通过反射设置值
             setMethod.invoke(realObj,realValue);
         }
    }
    /**
     * 取得真正操作的对象
     * @param actionObj
     * @param className 要操作的类名称
     * @return
     */
    private static Object getRealObject(Object actionObj,
                                        String className) throws Exception{
        // 1.取得xxAction Class对象
        Class<?> cls = actionObj.getClass();
        // 2.拼装getXX()方法名称
        String methodName = "get"+initCap(className);
        // 3.取得该方法名称的Method对象
        Method method = cls.getMethod(methodName);
        // 4.通过反射调用该方法
        // 等同于empAction.getEmp();
        return method.invoke(actionObj);
    }
    private static String initCap(String str) {
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}




//这里的IntDemo实际上就是int数据类型的包装类
class IntDemo{
    private int num;
    public IntDemo(int num){
        this.num = num;
    }
    public int intValue(){
        return this.num;
    }
}

public class test{
    public static void main(String[] args) {
        //子类对象向上转型
        Object obj = new IntDemo(55);
        //向下转型
        IntDemo temp = (IntDemo)obj;
        //取出里面的基本数据类型操作
        System.out.println(temp.intValue());
    }
}
//输出
//55

//class HelloA {
//    //构造方法
//    public HelloA(){
//        System.out.println("Hello A!父类构造方法");
//    }
//    //非静态代码块
//    {
//        System.out.println("i'm A class.父类非静态代码块");
//    }
//    //静态代码块
//    static{
//        System.out.println("static A 父类静态代码块");
//    }
//}
//
//public class Test extends HelloA {
//    //构造方法
//    public Test(){
//        System.out.println("Hello B! 构造方法");
//    }
//    //非静态代码块
//    {
//        System.out.println("i'm B class.非静态代码块");
//    }
//    //静态代码块
//    static{
//        System.out.println("static B 静态代码块");
//    }
//    public static void main(String[] args) {
//        System.out.println("---start---");
//        new Test();
//        new Test();
//        System.out.println("---end---");
//    }
//}

//public class Test{
//    public static void main(String[] args) {
//        {//直接使用{}定义，普通方法块
//            int x = 10;
//            System.out.println("x = " + x);//10
//        }
//        int x = 100;
//        System.out.println("x = " + x);//100
//    }
//}

//class Person{
//    {//定义在类中，不加任何修饰符，构造块
//        System.out.println("1.Person类的构造块");
//    }
//    public Person(){
//        System.out.println("2.Person类的构造方法");
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        new Person();
//        new Person();
//    }
//}
////1.Person类的构造块
////2.Person类的构造方法
////1.Person类的构造块
////2.Person类的构造方法

//class Person{
//    {//定义在类中，不加任何修饰，构造块
//        System.out.println("1.Person类的构造块");
//    }
//    public Person(){
//        System.out.println("2.Person类的构造方法");
//    }
//    static{//用static修饰，定义在非主类中，是非主类的静态代码块
//        System.out.println("3.非主类的静态代码块");
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        System.out.println("start");
//        new Person();
//        new Person();
//        System.out.println("end");
//    }
//}
////start
////3.非主类的静态代码块
////1.Person类的构造块
////2.Person类的构造方法
////1.Person类的构造块
////2.Person类的构造方法
////end

//public class Test{
//    {//没有任何修饰，构造块
//        System.out.println("1.构造块");
//    }
//    public Test(){
//        System.out.println("2.构造方法");
//    }
//    static{//static修饰，定义在主类中的静态代码块
//        System.out.println("3.主类静态块");
//    }
//
//    public static void main(String[] args) {
//        System.out.println("start");
//        new Test();
//        new Test();
//        System.out.println("end");
//    }
//}
////3.主类静态块
////start
////1.构造块
////2.构造方法
////1.构造块
////2.构造方法
////end

//abstract class Person{
//    private String name;
//    public String getName(){
//        return this.name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    //{}为方法体，所有抽象方法上不包含方法体
//    public abstract void getPersonInfo();//抽象方法
//}
//
//class Student extends Person{
//    public void getPersonInfo(){
//        System.out.println("叫我小可爱！");
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        //子类向上转型获得实例化对象
//        Person per = new Student();
//        //调用被子类覆写的方法
//        per.getPersonInfo();
//    }
//}
////叫我小可爱！

abstract class Person{
    private String name ; // 属性
    public String getName(){ // 普通方法
        return this.name;
    }
    public void setName(String name){
        this.name = name ;
    }
    // {}为方法体，所有抽象方法上不包含方法体
    public abstract void getPersonInfo() ; //抽象方法

    public static Person getInstance(){
        //定义抽象类的子类（内部类）
        class Student extends Person{
            //覆写抽象方法
            public void getPersonInfo(){
                System.out.println("我是靓仔");
            }
        }
        return new Student();
    }
}
public class Test{
    public static void main(String[] args) {
        Person per = Person.getInstance();
        per.getPersonInfo();
    }
}
//我是靓仔

//abstract class Person{
//    private String name;
//    public Person(){
//        System.out.println("Person");
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    // {}为方法体，所有抽象方法上不包含方法体
//    public abstract void getPersonInfo() ; //抽象方法
//}
//
//class Studet extends Person{
//    public Studet(){
//        System.out.println("Student");
//    }
//    public void getPersonInfo(){
//        //空实现。
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        new Studet();
//    }
//}
////Person
////Student
//
//abstract class A{
//    public A(){//4.调用父类构造
//        this.print();//5.子类已经覆写的抽象方法
//    }
//    public abstract void print();
//}
//
//class B extends A{
//    private int num = 100;
//    public B(int num){//2.调用子类构造方法
//        super();//3.首先要调用父类构造
//        this.num = num;//8.此时num被赋值
//    }
//    public void print(){//6.此时num还没被赋值但是被调用
//        System.out.println(this.num);//7.打印出num数据类型默认值
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        B b = new B(28);//1.实现子类实例化
//        b.print();//10.打印出赋值后的num
//    }
//}
////0
////28

//abstract class A{
//    //其中没有抽象方法
//    public void print(){
//        //空实现，普通方法
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        A a = new A() ; // 错误: A是抽象的;，依旧无法实例化
//    }
//}

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