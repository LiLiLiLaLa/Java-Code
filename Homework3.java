import javax.swing.text.DateFormatter;

// 1.定义一个Father和Child类，并进行测试。 
// 要求如下： 
// 1）Father类为外部类，类中定义一个私有的String类型的属性name，name的值为“zhangjun”。
// 2）Child类为Father类的内部类，其中定义一个introFather()方法，方法中调用Father类的name属性。 
// 3）定义一个测试类Test，在Test类的main()方法中，创建Child对象，并调用introFather ()方法。 
// class Father{
//     private String name  = "Zhangjun";
//     public class Child{
//         public void introFather(){
//             System.out.println(Father.this.name);
//         }
//     }
// }
// class Homework3{
//     public static void main(String[] args){
//         //外部类.内部类 内部类引用 = new 外部类().new 内部类()；
//         Father.Child c = new Father().new Child();
//         c.introFather();
//     }
// }

//////////////////////////////////////////////////////////////////////
// 2.简述下列程序运行结果: 
// class A{ 
//     int y = 6; 
//     class Inner{ 
//     static int y = 3; 
//     void show(){ 
//         System.out.println(y); 
//         } 
//     } 
// } 
// class Homework3{ 
//     public static void main(String [] args){ 
//         A.Inner inner=new A().new Inner(); 
//         inner.show(); 
//     } 
// } 
//普通内部类不能拥有静态属性，内部类对象必须通过实例化产生，而静态变量可以直接通过类名访问，无需实例化，因而该程序会报错

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 3.写出下面程序运行结果: 
// class A{ 
//     public A(){ 
//        System.out.println("A");
//     }      
// }
// public class B extends A{ 
//     public B(){ 
//         System.out.println("B");
//     } 
//     public static void main(String[] args){ 
//         //构造子类对象必须先走父类构造，默认访问父类无参构造
//         B b = new B(); 
//     } 
// } 

//////////////////////////////////////////////////////////////////
// 4.编程题： 
// 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
//例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。 
// public class Homework3{
//     public static void main(String[] args){
//         DaffodilsNumber();
//     }
//     public static void DaffodilsNumber(){
//         for(int i = 100; i < 1000; i++){
//             int a = i / 100;
//             int b = (i % 100) / 10;
//             int c = i % 10;
//             if((a * a * a + b * b * b + c * c * c) == i){
//                 System.out.println(i);
//             }
//         }
//     }
// }
// 153
// 370
// 371
// 407

/////////////////////////////////////////////////////////////
// 5.编程题： 
// 定义一个抽象的"Role"类，有姓名，年龄，性别等成员变量 
// 1）要求尽可能隐藏所有变量(能够私有就私有,能够保护就不要公有)， 
// 再通过GetXXX()和SetXXX()方法对各变量进行读写。具有一个抽象的play()方法， 
// 该方法不返回任何值，同时至少定义两个构造方法。Role类中要体现出this的几种用法。 
// 2）从Role类派生出一个"Employee"类，该类具有Role类的所有成员（构造方法除外）， 
// 并扩展salary成员变量，同时增加一个静态成员变量“职工编号（ID）”。 
// 同样要有至少两个构造方法，要体现出this和super的几种用法，还要求覆盖play()方法， 
// 并提供一个final sing()方法。 
// 3）"Manager"类继承"Employee"类，有一个final成员变量"vehicle" 
// 在main()方法中制造Manager和Employee对象,并测试这些对象的方法
abstract class Role{
    private String name;
    private String sex;
    private int age;
    public abstract void play();
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Role(){
        System.out.println("默认无参构造：邹长林是个瓜娃子");
    }
    public Role(int age,String name, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("有参构造：邹长林依旧是个瓜娃子");
    }
}
class Employee extends Role{
    private int salary;
    static int ID;

    public Employee(int salary, String name,String sex,int age){
        super(age,name,sex);
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void play(){
        System.out.println("邹狗狗吃粑粑");
    }
    public final void sing(){
        System.out.println("邹狗狗汪汪叫");
    }
    public Employee(){
        System.out.println("无参构造：邹长林是个大傻蛋");
    }
    public Employee(int salary){
        super();
        this.salary = salary;
        System.out.println("有参构造：邹狗子是个蠢蛋");
    }
}
class Manager extends Employee{
     final String vehicle = "拉拉车";
}
public class Homework3{
    public static void main(String[] args){
        Manager m = new Manager();
        System.out.println(m.vehicle);
        int a = 20;
        Employee e = new Employee();
        e.play();
        e.sing();
    }
}