//import java.io.File;
//import java.io.FileInputStream;
//import java.io.InputStream;
//
//public class Test{
//    public static void main(String[] args) {
//        int age = 18;
//        String name = "邹狗子";
//        Dog dog = new Dog(name,age);
//        int x = age - 1;
//        if(x > 10){
//            dog.play();
//        }else{
//            dog.bark();
//        }
//        int[] numList = new int[]{1,2,3,4};
//        //这是一段注释
//
//        //JDK8新增的lambda表达式
//        //new Thread(()-> System.out.println("Hello dog")).start();
//    }
//}
//class Dog{
//    private String name;
//    private Integer age;
//    public Dog(String name,Integer age){
//        this.name = name;
//        this.age = age;
//    }
//    public void play(){
//        System.out.println(this.name + "和我一起玩");
//    }
//    public void bark(){
//        System.out.println(this.name + "汪汪叫");
//    }
//}


//import java.io.File;
//import java.io.FileInputStream;
//import java.io.InputStream;
//
//public class Test{
//    public static void main(String[] args) {
//        int age = 18;
//        String name = "邹狗子";
//        Dog dog = new Dog(name,age);
//        int x = age - 1;
//        if(x > 10){
//            dog.play();
//        }else{
//            dog.bark();
//        }
//        int[] numList = new int[]{1,2,3,4};
//        //这是一段注释
//
//        //JDK8新增的lambda表达式
//        //new Thread(()-> System.out.println("Hello dog")).start();
//    }
//}
//class Dog{
//    private String name;
//    private Integer age;
//    public Dog(String name,Integer age){
//        this.name = name;
//        this.age = age;
//    }
//    public void play(){
//        System.out.println(this.name + "和我一起玩");
//    }
//    public void bark(){
//        System.out.println(this.name + "汪汪叫");
//    }
//}
public class Test{
    public static void main(String[] args) {
        if(1<2||(10/0==0)){
            System.out.println("条件满足");
        }else{
            System.out.println("条件不满足");
        }
//        char a = 'a';
//        int num = 100;
//        System.out.println(a>num);//false
//        int x = 3;
//        int y = 4;
//        int z = 3>4?x+y:x-y;
//        System.out.println(z);//-1

//        System.out.println("邹大炮\n\t是我的\"小可爱\"啦啦啦啦");

//        int numA = 10 ;
//        double numB = 10.5 ;
//        //String result = "计算结果:" +numA + numB ; // 此时“+”不是数学运算而是字符连接。
//        String result = "计算结果:" + (numA + numB ) ;
//        System.out.println(result) ;//20.5
//        String name = "邹大炮" ;
//        String note = "学生" ;
//        System.out.println(name);//邹大炮
//        System.out.println(note);//学生

//        char c = 'A';
//        int num = c + 32;
//        char x = (char)num;
//        System.out.println(x);//a
//        char c = 'A' ;
//        int num = c ;
//        System.out.println(num);//65

//        //10是int，int范围大于byte范围，理论上要进行强转，可是这里没有，因为数据在byte保存范围内
//        byte data = 10;//10是int型，在byte范围内
//        System.out.println(data);//10
//        //同时必须注意，如果要将int变量赋值给byte类型，必须强转
//        int num = 10;
//        byte t = (byte)num;
//        System.out.println(t);//10
//        //注意如下代码输出
//        byte d = (byte)300;
//        System.out.println(d);//44

//        //double定义小数
//        double num = 10.2;//这是一个小数
//        System.out.println(num * 2);//num是double型，2是int型，输出20.4
//
//        //定义float变量
//        float f1 = 1.1f;
//        System.out.println(f1);//1.1
//
//        System.out.println(1.1*1.1);//精度不够导致输出1.2100000000000002
//
//        int numA = 10 ;
//        int numB = 4 ;
//        // int/int型还是int型
//        System.out.println(numA/numB) ;//2
//        // 如果要想准确计算，必须将其中一个变量变为double类型
//        System.out.println(numA/(double) numB) ;//2.5

    }
}

//public class Test{
//    public static void main(String[] args) {
//        int[] data = new int[]{1,4,3,4,55,77,6,9,8};
//        //假定第一个元素为最大值
//        int max = data[0];
//        //假定第一个元素为最小值
//        int min = data[0];
//        int sum = 0;
//        double avg = 0d;
//        for (int i = 0; i < data.length; i++) {
//            sum += data[i];
//            if(data[i] > max){
//                max = data[i];
//            }
//            if(data[i] < min){
//                min = data[i];
//            }
//        }
//        avg = (double)sum / data.length;
//        System.out.println("最大值为：" + max);
//        System.out.println("最小值为：" + min);
//        System.out.println("总和为：" + sum);
//        System.out.println("平均值为：" + avg);
//    }
//}
////最大值为：77
////最小值为：1
////总和为：167
////平均值为：18.555555555555557

//public class Test{
//    public static void main(String[] args) {
//        processData(new int[]{1,4,3,4,55,77,6,9,8});
//    }
//    public static void processData(int[] data){
//        double[] result = new double[4];
//        //最大值
//        result[0] = data[0];
//        //最小值
//        result[1] = data[0];
//        //总和
//        result[2] = 0d;
//        //平均值
//        result[3] = data[0];
//        for (int i = 0; i < data.length; i++) {
//            result[2] += data[i];
//            if(data[i] > result[0]){
//                result[0] = data[i];
//            }
//            if(data[i] < result[1]){
//                result[1] = data[i];
//            }
//        }
//        result[3] = result[2]/data.length;
//        System.out.println("最大值为：" + result[0]);
//        System.out.println("最小值为：" + result[1]);
//        System.out.println("总和为：" + result[2]);
//        System.out.println("平均值为：" + result[3]);
//    }
//}
////最大值为：77.0
////最小值为：1.0
////总和为：167.0
////平均值为：18.555555555555557

//public class Test {
//    public static void main(String[] args) {
//        processData(new int[]{1,4,3,4,55,77,6,9,8});
//    }
//    public static void processData(int[] temp){
//        double[] result = new double[4] ;
//        result[0] = temp[0] ; // result[0] means the max of the array
//        result[1] = temp[0] ; // result[1] means the min of the array
//        result[2] = temp[0] ; // result[2] means the sum of the array
//        result[3] = temp[0] ; // result[3] means the avg of tha array
//        for (int i =0 ; i < temp.length;i++){
//            result[2] += temp[i] ;
//            if (temp[i]>result[0]){
//                result[0] = temp[i] ;
//            }
//            if (temp[i]<result[1]){
//                result[1] = temp[i] ;
//            }
//        }
//        result[3] = result[2]/temp.length ;
//        System.out.println("最大值为:" +result[0]);
//        System.out.println("最小值为:"+result[1]);
//        System.out.println("总和为："+result[2]);
//        System.out.println("平均值为："+result[3]);
//    }
//}

//class Person{
//    private String name;
//    private int age;
//    public Person(String name,int age){
//        this.name = name;
//        this.age = age;
//    }
//    public void getInfo(){
//        System.out.println("姓名：" + name + "、年龄：" + age);
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        //数组动态初始化，每个元素都是其对应数据类型的默认值
//        Person[] per = new Person[3];
//        per[0] = new Person("邹大宝",6);
//        per[1] = new Person("邹二宝",4);
//        per[2] = new Person("邹小宝",2);
//        for(int i = 0; i < per.length; i ++){
//            per[i].getInfo();
//        }
//    }
//}
////姓名：邹大宝、年龄：6
////姓名：邹二宝、年龄：4
////姓名：邹小宝、年龄：2

class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void getInfo(){
        System.out.println("姓名：" + name + "、年龄：" + age);
    }
}

public class Test{
    public static void main(String[] args) {
        //数组动态初始化，每个元素都是其对应数据类型的默认值
        Person[] per = new Person[]{
            new Person("邹大宝",6),
            new Person("邹二宝",4),
            new Person("邹小宝",2)
        };
        for(int i = 0; i < per.length; i ++){
            per[i].getInfo();
        }
    }
}
//姓名：邹大宝、年龄：6
//姓名：邹二宝、年龄：4
//姓名：邹小宝、年龄：2