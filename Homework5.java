// 2.编程题: 
// 要求: 
// 1).Person类有name,age,salary属性，要求实现至少两个构造方法，并且属性私有，提供对应的getter、setter。 
// 2).覆写toString方法，要求在System.out.println()函数中传递Person对象能打印出三个属性值而不是对象地址。 
// 3).覆写equals方法，要求两个Person类对象的值相同时返回true。 
// class Person{
//     private String name;
//     private Integer age;
//     private Integer salary;
//     public Person(String name,int age,int salary){
//         this.name = name;
//         this.age = age;
//         this.salary = salary;
//     }
//     public Person(String name,Integer age){
//         this.name = name;
//         this.age = age;
//     }
//     public void setName(String name){
//         this.name = name;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setAge(Integer age){
//         this.age = age;
//     }
//     public Integer getAge(){
//         return age;
//     }
//     public void setSalary(Integer salary){
//         this.salary = salary;
//     }
//     public Integer getSalary(){
//         return salary;
//     }
//     //覆写toString
//     public String toString(){
//         return "姓名为：" + this.name + "\n" + "年龄为：" + this.age + "\n" + "工资为：" + this.salary + "\n";
//     }
//     //覆写equals
//    public boolean equals(Object obj){
//        if(obj == null){
//            return false;
//        }else if(obj == this){
//            return true;
//        }else if(!(obj instanceof Person)){
//            return false;
//        }
//        //此时他们不是同一个对象，并且继承于同一个类
//        //强转为当前类
//        Person per = (Person)obj;
//        //比较当前对象的各属性值与被比较对象的各属性值
//        return per.name.equals(this.name) && per.age.equals(this.age) && per.salary.equals(this.salary);
//    } 
// }
// public class Homework5{
//     public static void main(String[] args) {
//         Person per1 = new Person("邹小狗", 40, 10);
//         Person per2 = new Person("邹大炮",18,20);
//         Person per3 = new Person("邹小狗",40,10);
//         System.out.println(per1);
//         System.out.println(per2);
//         System.out.println(per3);
//         System.out.println(per1.equals(per2));
//         System.out.println(per1.equals(per3));
//     }
// }

//////////////////////////////////////////////////////////
// 3.说出下列程序的执行结果，并说明原因: 
// Integer a = 55; 
// Integer b = 55; 
// System.out.println(a==b);
// true
// System.out.println(a==new Integer(55)); 
// false
// System.out.println(a.equals(new Integer(55))); 
// true
// Integer c= 129; 
// Integer d = 129; 
// System.out.println(c==d); 
// false

// 4.写出懒汉式单例模式 (用时在new)
// class Singleton{
//     public static Singleton s;
//     private Singleton(){}
//     public static Singleton gSingleton(){
//         if(s == null){
//             s = new Singleton();
//         }
//         return s;
//     }
// }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 5.编程: 
// 1).定义一个MulException类继承Exception类，要求两数相乘等于100报错，在主类中定义一个方法，在方法中抛出此异常，在主方法观察结果。 
// 2).定义一个DivException类继承RuntimeException类，要求两数相除等于2报错，在主类中定义一个方法，在方法中抛出此异常，在主方法观察结果。 
// class MulException extends Exception{
//     public MulException(String str){
//         super(str);//super(参数)->继承父类哪一个构造方法
//     }
// }
// class DIvException extends RuntimeException{
//     public DIvException(String str){
//         super(str);
//     }
// }
// public class Homework5{
//     public static void main(String[] args){
//         try{
//             test1();
//         }catch(Exception e){
//             e.printStackTrace();//打印异常信息
//         }
//         test2();
//     }
//     public static void test1() throws Exception{
//         int i = 10;
//         int y = 10;
//         int result = i * y;
//         if(result == 100){
//             throw new MulException("两数相乘不能得100！");
//         }
//     }
//     public static void test2(){
//         int x = 4;
//         int y = 2;
//         int result = x / y;
//         if(result == 2){
//             throw new DIvException("两数相除不能等于2！");
//         }
//     }
// }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 6.(算法) 
// 题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
//以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
public class Homework5{
    public static void main(String[] args){
        int result = 1;
        for(int i = 1; i < 10; i++){
            result = (result + 1) * 2;
        }
        System.out.println(result);
    }
}