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