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
                throw new RuntimeException("�ź�����Ϊ1��");
            }
            if (compareAndSetState(0, 1)) {
                //��ǰ�̳߳ɹ���ȡ��
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
    //Lock�ӿ�ʵ�ַ���
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

1.��һ�⣺����֮��
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //HashMap�ļ�ֵ�ԣ�ǰһλΪ������ʵֵ��Ϊkey�����������±���Ϊvalue����
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        //��ǰ����Ԫ����ָ��ֵ���������ȶ�HashMap���Ƿ��ж�ӦԪ�أ��еĻ������û�м���������
        for(int i = 0; i < nums.length; i ++){
            //�ж�HashMap���Ƿ������num[i]��Ӧ��Ԫ��
            if(map.containsKey(target - nums[i])){
                //�������
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            //��������ڣ�����ǰԪ�ط���HashMap
            map.put(nums[i], i);
        }
        return result;
    }
}

2.�ڶ��⣺�������
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
        //�ų�������Ӱ��
        if(l1 == null){
            l1 = new ListNode(0);
        }
        if(l2 == null){
            l2 = new ListNode(0);
        }
        //ǡ����������һ�����
        if(l1.next == null && l2.next == null){
            int val = l1.val + l2.val;
            //���������λ
            if(val > 9){
                //�������
                ListNode node = new ListNode(val % 10);
                node.next = new ListNode(val / 10);
                return node;
            }else{
                //�����������λ
                return new ListNode(val);
            }
        }else{
            //l1��Ϊ��l2��Ϊ��l1l2����Ϊ��
            int val = l1.val + l2.val;
            //�����Ҫ��λ
            if(val > 9){
                val = val % 10;
                //��l1����һ��ֵ��Ϊ�ջ�l1l2����һ��ֵ����Ϊ��ʱ��λֵ�Ӹ�l1����һλ
                if(l1.next != null){
                    l1.next.val ++;
                }else if(l2.next != null){
                    //��l1����һ��ֵΪ�գ�����λ��ֵ�Ӹ�l2����һ��ֵ
                    l2.next.val ++;
                }
            }
            //�������Ҫ��λ
            ListNode node = new ListNode(val);
            //������Ϊ����������кϲ�
            node.next = addTwoNumbers(l1.next, l2.next);
            return node;
        }
    }
}

3.�����⣺���ظ��ַ�����Ӵ�
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        int left = 0;
        int right = 0;
        //ת������
        char[] chars = s.toCharArray();
        //����HashMap�����ĸ���������е�����
        Map<Character,Integer> map = new HashMap<>();
        while(right < chars.length && left < chars.length){
            //�������ظ�Ԫ��
            if(map.containsKey(chars[right])){
                //�ж��µ��ظ��ǲ������ϴ��ظ���Χ֮��
                if(left < map.get(chars[right]) + 1){
                    left = map.get(chars[right]) + 1;
                }
            }
            //û�����ظ�Ԫ��
            map.put(chars[right], right ++);
            len = Math.max(len, right - left);
        }
        return len;
    }
}

4.�����⣺�������������������λ��
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
    
    //���巽�������������������в��ҵ�K����
    public double finfK(int[] nums1, int start1, int len1, int[] nums2, int start2, int len2, int k){
        //�涨�̵�����Ϊnums1
        if((len1 - start1) > (len2 - start2)){
            return finfK(nums2, start2, len2, nums1, start1, len1, k);
        }
        //����̵�����Ϊ�գ�ֱ���ڳ��������з����±�K-1���ǵ�K��Ԫ��
        if(len1 - start1 == 0){
            return nums2[k - 1];
        }
        //�������������е�1�������Ƕ��������������±�1�����Ľ�Сһ��
        if(k == 1){
            return Math.min(nums1[start1], nums2[start2]);
        }
        //�϶̵��������Խ�磬p��ʾ������Ӧ�ò��ҵ���λ��
        int p = start1 + Math.min(len1 - start1, k / 2);
        //�ϳ������в���K- 1������ʣ�ಿ�֣����ҵ��±�Ϊq��λ��
        int q = start2 + k - p + start1;
        //��С�Ĳ��ֱ�����
        if(nums1[p - 1] < nums2[q - 1]){
            return finfK(nums1, p , len1, nums2, start2, len2, k - p + start1);
        }else if(nums1[p - 1] > nums2[q - 1]){
            return finfK(nums1, start1 , len1, nums2, q, len2, k - q + start2);
        }else{
            return nums1[p - 1];
        }
    }
}

15.��ʮ���⣺����֮��
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //�������飬ÿ������������һ��List�������Ϊ0������Ԫ��
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        //������������ͬ��Ԫ���������֣����������ų��ظ����
        Arrays.sort(nums);
        //�̶�һ��Ԫ�أ���������Ԫ������󲿷ֲ��ң��ڹ̶�Ԫ��֮��ֻʣһ��Ԫ��ʱֹͣ����
        for(int i = 0; i < nums.length - 1; i ++){
            //��һ��Ԫ�������ظ���Ԫ��ֱ��������
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            //������������Ԫ���±���Ϊ����ʣ��������������
            int left = i + 1;
            int right = nums.length - 1;
            //����С����˵�������Ԫ�ػ�û����
            while(left < right){
                //��Ԫ�ع̶�����������У���Ӵ���0�����±����ƣ����С��0�����±�����
                if(nums[i] + nums[left] + nums[right] > 0){
                    right --;
                }else if(nums[i] + nums[left] + nums[right] < 0){
                    left ++;
                }else{
                    //����������
                    //Arrays����asList���������Դ�ŷ���һ��List
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left ++;
                    right --;
                    //�ж�
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

147.��һ����ʮ���⣺��������в�������
class Solution {
    public ListNode insertionSortList(ListNode head) {
    //�������ֻ��һ�����ʱ��������ֱ�ӷ���
        if(head == null || head.next == null){
            return head;
        }
        //����һ���µ�����ͷ��
        ListNode pre = new ListNode(-1);
        //����ʱ��������������ͷ��
        ListNode ans = pre;
        //cur��ԭ������������Ϊÿ�μ����²���Ľڵ�
        ListNode cur = head;
        //�ڴ�ȡ��ԭ������һ���ڵ�����µ�����
        while(cur != null){
            //ÿ��ѭ����pre����Ϊͷ��㣬��֤ÿ�δ�ǰ�������
            pre = ans;
            //��pre.next.val���ڵ���cur.val����pre.nextΪnullʱ������һ�˱���������preҪ���Ϻ���
            while(pre.next != null && pre.next.val < cur.val){
                pre= pre.next;
            }
            //��ʱpreҪô�ߵ������Ҫô�ҵ���val���ڵ���cur�Ľڵ㣬������ζ�Ӧ�ð�cur���뵽pre��
            //�ȱ���cur����һ���ڵ㣬��֤ԭ�����ߵ����ﱻ��ס
            ListNode tmp = cur.next;
            //��cur���뵽pre����
            cur.next = pre.next;
            pre.next = cur;
            //cur�ع�ԭ����
            cur = tmp;
        }
        return ans.next;
    }
}

396.�����پ�ʮ���⣺��ת����
class Solution {
    public int maxRotateFunction(int[] A) {
        //�������Ҫ����ѧ�Ƕȣ��ҹ���
        //arr={a,b,c,d}
        //F(0) = 0a+1b+2c+3d
        //F(1) = 0d+1a+2b+3c
        //F(2) = 0c+1d+2a+3b
        //F(3) = 0b+1c+2d+3a
        //sum = a+b+c+d
        //F(1) = F(0)+a+b+c-3d = F(0)+sum-4d
        //F(2) = F(1)+d+a+b-3c = F(1)+sum-4c
        //F(3) = F(2)+c+d+a-3b = F(2)+sum-4b
        //�ó�F(k) = F(k-1)+sum-arr.length*arr[a.length-k]
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        //�ȼ���F(0)
        int data = 0;
        for (int i = 0; i < A.length; i++) {
            data += i * A[i];
        }
        //Ĭ��max = F(0)
        int max = data;
        for (int k = 1; k < A.length; k++) {
            data = data + sum - (A.length) * A[A.length - k];
            //maxȡ�ϴ�һ��
            max = (max > data) ? max : data;
        }
        return max;
    }
}