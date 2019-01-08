import java.util.ArrayList;
import java.util.List;

public class P1 {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(3);
//        list.add(5);
//        list.add(9);
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.contains(3));
//        System.out.println(list.remove(3));
//        System.out.println(list);
//        System.out.println(list.get(2));
//        System.out.println(list.set(1,2));
//        System.out.println(list);
    }
    public class Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }else if(obj == null){
            return false;
        }else if(!(obj instanceof Person)){
            return false;
        }
        //向下转型还原为Person对象
        Person per = (Person) obj;
        return this.age.equals(per.age) && this.name.equals(per.name);
    }



}
