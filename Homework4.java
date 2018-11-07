// 1.说出下面程序的执行结果: 
//interface InterfaceA { 
//     String S = "good "; 
//     void f(); 
// } 
// abstract class ClassA extends Object{
//     abstract void g(); 
// } 
// class ClassB extends ClassA implements InterfaceA { 
//     void g() {
//         System.out.print(S);
//     } 
//     public void f() { 
//         System.out.print(" "+ S); 
//     } 
// } 
// public class Homework4{ 
//     public static void main(String[] args) { 
//         ClassA a = new ClassB(); 
//         InterfaceA b = new ClassB(); 
//         a.g(); 
//         b.f(); 
//     } 
// } 
//结果：good  good

///////////////////////////////////////////////////////////////////////////////////////
// 2.编程题: 
// 利用接口做参数，写个计算器，能完成加减乘除运算。 
// （1）定义一个接口Compute含有一个方法int computer(int n, int m)。 
// （2）设计四个类分别实现此接口，完成加减乘除运算。 
// （3）设计一个类UseCompute，类中含有方法：public void useCom(Compute com, int one, int two)，
//  此方法能够用传递过来的对象调用computer方法完成运算，并输出运算的结果。 
// （4）设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算。 
// public class Homework4{
//     public static void main(String[] args) {
//     UseCompute use = new UseCompute();
//     Add a = new Add();
//     Sub s = new Sub();
//     Mul m = new Mul();
//     Div d = new Div();
//     System.out.println("求和：");
//     use.useCompute(a,2,4);
//     System.out.println("求差：");
//     use.useCompute(s,2,4);
//     System.out.println("求积：");
//     use.useCompute(m,2,4);
//     System.out.println("求商：");
//     use.useCompute(d,2,0);
//     }
// }
// interface Compute{
//     int compute(int m,int n);
// }
// class Add implements Compute{
//     public int compute(int m,int n){
//         return m + n;
//     }
// }
// class Sub implements Compute{
//     public int compute(int m,int n){
//         return m - n;
//     }
// }
// class Mul implements Compute{
//     public int compute(int m,int n){
//         return m * n;
//     }
// }
// class Div implements Compute{
//     public int compute(int m,int n){
//         if(n == 0){
//             return 0;
//         }else{
//             return m / n;
//         }
//     }
// }
// class UseCompute{
//     public void useCompute(Compute com,int m,int n){
//        System.out.println(com.compute(m,n));
//     }
// }

//////////////////////////////////////////////////////////////////////////////////
// 3.按如下要求编写Java程序： 
// （1）定义接口A，里面包含值为3.14的常量PI和抽象方法double area()。 
// （2）定义接口B，里面包含抽象方法void setColor(String c)。 
// （3）定义接口C，该接口继承了接口A和B，里面包含抽象方法void volume()。 
// （4）定义圆柱体类Cylinder实现接口C，该类中包含三个成员变量：底圆半径radius、 
// 圆柱体的高height、颜色color。 
// （5）创建主类来测试类Cylinder。 
// interface Ia{
//     public final static double PI = 3.14;
//     public abstract double area();
// }
// interface Ib{
//     public abstract void getColor();
// }
// interface Ic extends Ia,Ib{
//     public abstract void volume();
// }
// class Cylinder implements Ic{
//     private double radius;
//     private double height;
//     private String color;
//     public Cylinder(double radius,double height,String color){
//         this.radius = radius;
//         this.height = height;
//         this.color = color;
//     }
//     public double area(){
//         System.out.println(PI);
//         return PI * radius * radius;//底面积
//     }
//     public void getColor(){
//         System.out.println(color);
//     }
//     public void volume(){
//         System.out.println("圆柱体体积：" + PI * radius * radius * height);//圆柱体体积
//     }
// }
// public class Homework4{
//     public static void main(String[] args){
//         Cylinder a = new Cylinder(1,2,"red");
//         a.area();
//         a.getColor();
//         a.volume();
//     }
// }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 4.(附加题-算法) 
// 一个数如果恰好等于它的所有（不是部分因子）因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程 找出1000以内的所有完数。
public class Homework4{
    public static void main(String[] args){
        System.out.println(isCompleteNumber(24));
    }
    public static int sum(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static boolean isCompleteNumber(int num){
        while(sum(num) == num){
            return true;
        }
        return false;
    }
}