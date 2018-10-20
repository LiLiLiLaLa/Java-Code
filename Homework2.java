// 1.创建一个Test类，包含有一个public权限的int型成员变量与一个char类型的成员变量，观察在main方法中的初始值。 
class Test{
    public int age;
    public char name;
}
// 2.编写一个程序，展示无论你创建了某个特定类的多少个对象，这个类的某个特定的static成员变量只有一个属性。 
class Test1{
    public int a;
    public  char b;
    public static int x = 8;
    public void Test1(int a,char b){
        this.a = a;
        this.b = b;
    }
}
// 3.一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，其中每一个数字(从第三个数字起)都是前两个数字的和。创建一个方法，接受一个整数参数，并显示从第一个元素开始总共由该参数指定的个数所构成的所有斐波那契数字。例如，如果运行 java Fibonacci 5(Fibonacci为类名)，那么输出应该是1、1、2、3、5。 
class Fibonacci{
    public static int Fibonacci(int i){
        if((i == 1)||(i == 2)){
            return 1;
        }else{
            return Fibonacci(i - 1)+Fibonacci(i - 2);
        }
    }
}
// 4.创建一个带默认构造方法（即无参构造）的类，在构造方法中打印一条消息"Hello Constructor";再为这个类添加一个重载构造方法，令其接收一个字符串参数，并在这个有参构造方法中把"Hello Constructor"和接收的参数一起打印出来。 
class Test2{
    public Test2(){
        System.out.println("Hello Constructor");
    }
    public Test2(String hahaha){
        this();
        System.out.println(hahaha);
    }
}

public class Homework2{
    public static void main(String[] args){
        // Test test = new Test();
        // System.out.print(test.age + "\n" + test.name);
        //// Test1 test1 = new Test1(54,'a');
        //// Test1 test2 = new Test1(55,'b');
        //// System.out.println("Test1:" + test1.a + " " + test1.b + " " + test1.x);
        //// System.out.println("Test2:" + test2.a + " " + test2.b + " " + test2.x);
        ////// int num = 6;
        ////// Fibonacci f = new Fibonacci();
        ////// if(num <= 0){
        //////     System.out.println("empty");
        ////// }else{
        //////     for(int i = 1; i <= num; i++)
        //////     {
        //////         System.out.print(f.Fibonacci(i) + "  ");
        //////     }
        ////// }
        Test2 t = new Test2("hahaha");//实例化
    }
}