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

//public class Test {
//    public static void main(String[] args) {
//        System.out.println(Color.getInstance(Color.BLUE_FLAG ));
//    }
//}
//
//class Color {
//    private String title;
//    public static final int RED_FLAG = 1;
//    public static final int GREEN_FLAG = 2;
//    public static final int BLUE_FLAG = 3;
//    private static final Color RED = new Color("RED");
//    private static final Color GREEN = new Color("GREEN");
//    private static final Color BLUE = new Color("BLUE");
//    public Color(String title) {
//        this.title = title;
//    }
//    public static Color getInstance(int ch) {
//        switch(ch){
//            case RED_FLAG:
//                return RED;
//            case GREEN_FLAG:
//                return GREEN;
//            case BLUE_FLAG:
//                return BLUE;
//            default:
//                return null;
//        }
//    }
//
//    @Override
//    public String toString() {
//        return this.title;
//    }
//}
//enum Color {
//    RED,BLUE,GREEN
//}
//
//public class Test {
//    public static void main(String[] args) {
//        //System.out.println(Color.BLUE.ordinal() + "=" + Color.BLUE.name());
//        for (Color temp:Color.values()) {
//            System.out.println(temp.ordinal() + "=" + temp.name());
//        }
//    }
//}
////0=RED
////1=BLUE
////2=GREEN

//enum Color {
//    RED("红色"),GREEN("绿色"),BLUE("蓝色");
//    private String title;
//    Color(String color) {
//        this.title = color;
//    }
//    @Override
//    public String toString() {
//        return this.title;
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        System.out.println(Color.BLUE);
//    }
//}
////蓝色

////枚举类实现接口
//interface IColor {
//    public String getColor();
//}
//enum Color implements IColor {
//    RED("红色"),GREEN("绿色"),BLUR("蓝色");
//    private String title;
//    //构造方法私有化
//    private Color(String title) {
//        this.title = title;
//    }
//
//    @Override
//    public String toString() {
//        return this.title;
//    }
//
//    @Override
//    public String getColor() {
//        return this.title;
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        IColor iColor = Color.RED;
//        System.out.println(iColor.getColor());
//    }
//}
////红色

//enum Sex {
//    MALE("男"),FEMALE("女");
//    private String title;
//    private Sex(String title) {
//        this.title = title;
//    }
//    @Override
//    public String toString() {
//        return this.title;
//    }
//}
//
//class Person {
//    private String name;
//    private int age;
//    private Sex sex;
//    public Person(String name, int age, Sex sex){
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }
//
//    @Override
//    public String toString() {
//        return "Person [name = " + name + ",age = " + age + ",sex = " + sex + "]";
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Person per = new Person("邹鸡儿", 20, Sex.MALE);
//        System.out.println(per);
//    }
//}
////Person [name = 邹鸡儿,age = 20,sex = 男]

enum Sex {
    MALE, FEMALE
}

public class Test {
    public static void main(String[] args) {
        switch(Sex.MALE){
            case MALE :
                System.out.println("男");
                break;
            case FEMALE :
                System.out.println("女");
                break;
        }
    }
}
//男
