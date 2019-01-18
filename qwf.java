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