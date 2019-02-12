public class Sort{
    //冒泡排序
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
    //直接插入排序
    public static void insertSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] >= arr[i]){
                    break;
                }else{
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                    i = i - 1;
                }
            }
        }
    }
    //简单选择排序
    public static void chooseSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
    }
    //归并排序
    public static void mergeSort(int[] arr, int low, int high){
        int mid = (low + high) / 2;
        if(low < high){
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void merge(int[] arr, int low, int mid, int high){
        int i = low;
        int j = mid + 1;
        int k = 0;
        int[] a = new int[high - low + 1];
//        //注意数组长度
//        int[] a = new int[high - low + 1];
        while(i <= mid && j <= high){
            if(arr[i] < arr[j]){
                a[k++] = arr[i++];
            }else{
                a[k++] = arr[j++];
            }
        }
        //此时必定有一边排完，把剩下的写在其后
        while(i <= mid){
            a[k++] = arr[i++];
        }
        while(j <= high){
            a[k++] = arr[j++];
        }
        //此时把排好的数组写会原数组
        for(int x = 0; x < a.length; x++){
            arr[x + low] = a[x];
        }
    }
    //希尔排序
    
    //堆排序
    
    //快速排序
    
    //基数排序
    

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,1,6,8};
        mergeSort(arr, 0, 4);
        print(arr);
    }
}
