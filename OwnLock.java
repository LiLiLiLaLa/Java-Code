import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

class Mutex implements Lock {
    private Sync sync = new Sync();

    //------------------------------------
    static class Sync extends AbstractQueuedSynchronizer {
        protected boolean tryAcquire(int arg) {
            if (arg != 1) {
                throw new RuntimeException("信号量不为1！");
            }
            if (compareAndSetState(0, 1)) {
                //当前线程成功获取锁
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        protected boolean tryRelease(int arg) {
            if (getState() == 0) {
                throw new IllegalMonitorStateException();
            }
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }
        protected boolean isHeldExclusively(){
            return getState() == 1;
        }
        Condition newCondition(){
            return new ConditionObject();
        }
    }
    //------------------------------------------
    //Lock接口实现方法
    public void lock(){
        sync.acquire(1);
    }
    public void lockInterruptibly() throws InterruptedException{
        sync.acquireInterruptibly(1);
    }
    public boolean tryLock(){
        return sync.tryAcquire(1);
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }


    public void unlock(){
        sync.release(1);
    }
    public Condition newCondition(){
        return sync.newCondition();
    }
}

public class OwnLock{
    private static Mutex mutex = new Mutex();
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            Thread thread = new Thread(()->{
                mutex.lock();
                try{
                    Thread.sleep(3000);
                }catch(Exception e){
                    e.printStackTrace();
                }
            });
            thread.start();
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