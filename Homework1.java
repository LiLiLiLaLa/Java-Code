import java.util.Arrays;

public class Homework1{
    public static void main(String[] args) {
        //multiplicationTable();
        //long ret = factorial(20);
        //System.out.println(ret);
        int[] data = new int[]{1,3,2,9,7,4,6,8,20,17,25,21};
        quickSort(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
        //staticInitArray();

    }

    //使用数组静态初始化方式初始化一个大小为10的整型数组并输出。
    public static void staticInitArray(){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        //System.out.println(Arrays.toString(arr));
        for (int var : arr) {//用for each读取，又叫增强for循环
            System.out.print(var+" ");
        }
    }

    //使用递归实现快速排序(Java实现) 
    public static int Partition(int[] arr, int start, int end) {
        int key = arr[start];
        while (start < end) {
            while (arr[end] >= key && end > start)
                end--;
            arr[start] = arr[end];
            while (arr[start] <= key && end > start)
                start++;
            arr[end] = arr[start];
        }
        arr[start] = key;
        return start;
    }
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int index = Partition(arr, start, end);
            quickSort(arr, start, index - 1);
            quickSort(arr, index + 1, end);
        }
    }

    //20的阶乘
    private static long factorial(int i){
        if(i <= 1){
            return 1L;
        }else{
            return i*factorial(i-1);
        }
    }

    //九九乘法表
    public static void multiplicationTable(){
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}