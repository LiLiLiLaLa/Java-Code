abstract class Person{
    private String name;
    public String getname(){
        return name;
    }
    public abstract void home();
}

class Student extends Person{
    public void home(){
        System.out.println("邹鸡儿吃狗屎");
    }
}

public class Test{
    public static void main(String[] args){
        // Person  per1 = new Person();
        // per1.name = "邹二狗";
        // per1.age = 20;
        // per1.eat();
        // per1.sleep();
        // per1.work();
        Person per = new Student();
        per.home();
    }
}