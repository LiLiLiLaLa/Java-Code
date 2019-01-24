//public class Test{
//    public static void main(String[] args) {
//        int line = 10;
//        for(int x = 0; x < line; x ++){
//            for (int y = 0; y < line; y ++){
//                System.out.print(" ");
//            }
//            for(int z = 0; z < x; z ++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//
//if(布尔表达式){
//    //条件满足时执行代码
//        }else{
//    条件不满足时执行代码
//        }
//
//
//if(布尔表达式1){
//    //条件1满足时执行代码
//        }else if(布尔表达式2){
//    //条件2满足时执行代码
//        }....
//         else{
//             //以上条件均不满足时执行代码
//        }

//switch(数字|枚举|字符|字符串){
//    case 内容1:{
//        内容1满足时执行代码;
//        break;
//        }
//    case 内容2:{
//        内容2满足时执行代码;
//        break;
//        }
//    case 内容3:{
//        内容3满足时执行代码;
//        break;
//        }
//    .....
//    default:{
//         以上内容均不满足时执行语句;
//         break;
//         }
//}

//import java.io.IOException;
//
//public class Test{
//    public static void main(String[] args) throws IOException {
//        System.out.println("请输入字符：");
//        char x = (char) System.in.read();
//        switch(x){
//            case 'a':{
//                System.out.println("邹大炮是猪");
//                break;
//            }
//            case 'b':{
//                System.out.println("邹大炮不是猪");
//                break;
//            }
//            default:{
//                System.out.println("邹大炮原来是瓜娃子");
//                break;
//            }
//        }
//    }
//}
////请输入字符：
////a
////邹大炮是猪
//
////请输入字符：
////b
////邹大炮不是猪
////邹大炮原来是瓜娃子

//while(控制循环的条件判断){
//    循环语句;
//    修改条件内容;
//        }
//
//do{
//   循环语句;
//   修改条件内容;
//        }while(控制循环的条件判断);

//for(循环初始化;循环结束的条件判断;修改条件内容){
//    循环体;
//        }

//public class Test{
//    public static void main(String[] args) {
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + "*" + i + "=" + i*j + "\t");
//            }
//            System.out.println();
//        }
//    }
//}
//输出
//1*1=1
//1*2=2	2*2=4
//1*3=3	2*3=6	3*3=9
//1*4=4	2*4=8	3*4=12	4*4=16
//1*5=5	2*5=10	3*5=15	4*5=20	5*5=25
//1*6=6	2*6=12	3*6=18	4*6=24	5*6=30	6*6=36
//1*7=7	2*7=14	3*7=21	4*7=28	5*7=35	6*7=42	7*7=49
//1*8=8	2*8=16	3*8=24	4*8=32	5*8=40	6*8=48	7*8=56	8*8=64
//1*9=9	2*9=18	3*9=27	4*9=36	5*9=45	6*9=54	7*9=63	8*9=72	9*9=81

//public static 方法返回值类型 方法名称(参数类型 参数1，参数类型 参数2....参数类型 参数n){
//    方法体代码;
//    return 返回值;
//}

//public class Test{
//    public static void main(String[] args) {
//        System.out.println(add(5,5));
//        System.out.println(add(5,5,555));
//    }
//    public static int add(int x,int y){
//        return x + y;
//    }
//    public static int add(int x,int y,int z){
//        return x + y + z;
//    }
//}
////10
////565

//public class Test{
//    public static void main(String[] args) {
//        myPrint(1);
//        myPrint(2);
//        myPrint(3);
//        myPrint(4);
//    }
//    public static void myPrint(int x){
//        if(x == 2){
//            return;//若执行此语句，则此语句后面的代码不能被执行，方法调用结束
//        }else{
//            System.out.println(x);
//        }
//    }
//    //输出
//    //1
//    //3
//    //4
//}

////递归实现1到100的叠加
//public class Test{
//    public static void main(String[] args) {
//        System.out.println(sum(100));
//    }
//    public static int sum(int num){
//        if(num == 1){
//            return 1;
//        }else{
//            return num + sum(num - 1);
//        }
//    }
//}
////5050

////数据类型[] 数组名称 = new 数据类型[长度];
//
//public class Test{
//    public static void main(String[] args) {
//        //开辟一个长度为3的整型数组
//        //int[] x = new int[3];
//        int[] x = null;
//        x = new int[3];
//        System.out.println(x.length);
//        //给数组放入值
//        x[0] = 1;
//        x[1] = 3;
//        x[2] = 5;
//        for (int i = 0; i < x.length; i++) {
//            //通过循环控制索引访问数组元素
//            System.out.println(x[i]);
//        }
//    }
//}
////输出
////3
////1
////3
////5

//public class Test{
//    public static void main(String[] args) {
//        int[] x = null;
//        int[] temp = null;
//        x = new int[3];
//        //System.out.println(x.length);
//        x[0] = 1;
//        x[1] = 3;
//        x[2] = 5;
//        //如果要出现引用传递，不要出现[]
//        temp = x;
//        //修改数据
//        temp[0] = 99;
//        System.out.println(x[0]);//99
//    }
//}

//public class Test{
//    public static void main(String[] args) {
//        int[] x = new int[]{1,2,5,55};
//        System.out.println(x.length);
//        for (int i = 0; i < x.length; i++) {
//            System.out.println(x[i]);
//        }
//    }
//}
////输出
////4
////1
////2
////5
////55

public class Test{
    public static void main(String[] args) {
        //数组并不是等列数组
        int[][] data = new int[][]{
                {1,2,3},{4,5},{6,7,8,9}
        };
        //在进行输出时要使用双循环
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("data["+i+"]["+j+"]="+data[i][j]);
            }
        }
    }
}
//输出
//data[0][0]=1
//data[0][1]=2
//data[0][2]=3
//data[1][0]=4
//data[1][1]=5
//data[2][0]=6
//data[2][1]=7
//data[2][2]=8
//data[2][3]=9

public class Test{
    public static void main(String[] args) {
        int[] data = init();
        printArray(data);
    }

    public static int[] init(){
        return new int[]{1,2,3,4};
    }

    public static void printArray(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
//输出
//1
//2
//3
//4

//public class Test{
//    public static void main(String[] args) {
//        int[] data = init();
//        printArray(data);
//    }
//
//    public static int[] init(){
//        return new int[]{1,2,3,4};
//    }
//
//    public static void printArray(int[] data){
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
//    }
//}
////输出
////1
////2
////3
////4
//public class Test{
//    public static void main(String[] args) {
//        int[] data = new int[]{1,2,3,4};
//        printArray(data);
//    }
//    public static void printArray(int[] data){
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
//    }
//}
////1
////2
////3
////4
//public class Test{
//    public static void main(String[] args) {
//        int[] data = init();
//        bigger(data);
//        printArray(data);
//    }
//    //定义一个数组返回方法
//    public static int[] init(){
//        return new int[]{1,2,3,4};
//    }
//    //定义一个数组打印方法
//    public static void printArray(int[] data){
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
//    }
//    //定义方法将数组中每个值扩大5倍
//    public static void bigger(int[] data){
//        for (int i = 0; i < data.length; i++) {
//            data[i] = data[i] * 5;
//        }
//    }
//}
////5
////10
////15
////20
public class Test{
    public static void main(String[] args) {
        int[] intData = new int[]{1,62,31,24};
        char[] charData = new char[]{'a','z','b','d'};
        java.util.Arrays.sort(intData);
        java.util.Arrays.sort(charData);
        printArray(intData);
        printArray(charData);
    }
    public static void printArray(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
    //方法重载
    public static void printArray(char[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
//1
//24
//31
//62
//a
//b
//d
//z

//public class Test{
//    public static void main(String[] args) {
//        int[] data = init();
//        printArray(data);
//    }
//
//    public static int[] init(){
//        return new int[]{1,2,3,4};
//    }
//
//    public static void printArray(int[] data){
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
//    }
//}
////输出
////1
////2
////3
////4
//public class Test{
//    public static void main(String[] args) {
//        int[] data = new int[]{1,2,3,4};
//        printArray(data);
//    }
//    public static void printArray(int[] data){
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
//    }
//}
////1
////2
////3
////4
//public class Test{
//    public static void main(String[] args) {
//        int[] data = init();
//        bigger(data);
//        printArray(data);
//    }
//    //定义一个数组返回方法
//    public static int[] init(){
//        return new int[]{1,2,3,4};
//    }
//    //定义一个数组打印方法
//    public static void printArray(int[] data){
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
//    }
//    //定义方法将数组中每个值扩大5倍
//    public static void bigger(int[] data){
//        for (int i = 0; i < data.length; i++) {
//            data[i] = data[i] * 5;
//        }
//    }
//}
////5
////10
////15
////20
//public class Test{
//    public static void main(String[] args) {
//        int[] intData = new int[]{1,62,31,24};
//        char[] charData = new char[]{'a','z','b','d'};
//        java.util.Arrays.sort(intData);
//        java.util.Arrays.sort(charData);
//        printArray(intData);
//        printArray(charData);
//    }
//    public static void printArray(int[] data){
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
//    }
//    //方法重载
//    public static void printArray(char[] data){
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
//    }
//}
////1
////24
////31
////62
////a
////b
////d
////z
import java.util.Arrays;

public class Test{
    public static void main(String[] args){
        int[] original = new int[]{1,3,5,7,9};
        int[] result = Arrays.copyOf(original,10);
        for (int temp : result) {
            System.out.println(temp);
        }
    }
}
//1
//3
//5
//7
//9
//0
//0
//0
//0
//0

//1
//55
//66
//77
//5
//6
//7
//8
//9