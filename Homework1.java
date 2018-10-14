import java.util.Arrays;

public class Homework1{
    public static void main(String[] args) {
        //multiplicationTable();
        //long ret = factorial(20);
        //System.out.println(ret);
        // int[] arr = new int[]{6, 7, 2, 6, 11, 9, 10};
        // quiceSort(arr, 0, arr.length-1);
        // System.out.println(Arrays.toString(arr));
        //使用数组静态初始化方式初始化一个大小为10的整型数组并输出。
        staticInitArray();

    }

    public static void staticInitArray(){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        //System.out.println(Arrays.toString(arr));
        for (int var : arr) {
            System.out.print(var+" ");
        }
    }

    //使用递归实现快速排序(Java实现) 
    public static int PartSort(int[] arr, int left, int right){
        int key = arr[right];
        int start = left;
        int end = right-1;

        while(start < end){
            while(start < end && arr[start] <= key){
                start++;
            }
            while(start < end && arr[end] >= key){
                end--;
            }
            if(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        //最后别忘记把基准值和相遇点交换
	    if (start != right - 1){
            int temp = arr[start];
            arr[start] = arr[right-1];
            arr[right-1] = temp;
        }
        return start;
    }
    public static void quiceSort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }
        int ret = PartSort(arr, left, right);
        quiceSort(arr, left, ret);
        quiceSort(arr, ret+1, right);
    }

    //20的阶乘
    private static long factorial(int i){
        if(i <= 1){
            return 1;
        }else{
            return i*factorial(i-1);
        }
    }

    //九九乘法表
    public static void multiplicationTable(){
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}