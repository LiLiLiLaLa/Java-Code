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

/**
 * 定义一个USB标准
 */
interface USB{
    /**
     * 安装驱动
     */
    public void setUp();

    /**
     * 进行工作
     */
    public void work();
}
/**
 * 定义电脑类
 */
class Computer{
    /**
     * 插入USB设备
     * @param usb
     */
    public void plugin(USB usb){
        usb.setUp();//安装
        usb.work();//工作
    }
}

/**
 * 定义一个USB设备
 */
class UDisk implements USB{
    @Override
    public void setUp() {
        System.out.println("安装打印机驱动");
    }

    @Override
    public void work() {
        System.out.println("打印机开始工作");
    }
}

