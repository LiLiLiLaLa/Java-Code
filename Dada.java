import java.util.Scanner;

abstract class Computer{
    public void fun(){}
}

class MacBook extends Computer{
    public void fun(){
        System.out.println("I an a MacBook!");
    }
}

class MacBookPro extends Computer{
    public void fun(){
        System.out.println("I am a MacBookPro!");
    }
}

class ComputerFactory{
    private ComputerFactory(){}
    static Computer com;
    public static Computer getComputer(String ty){
        if(ty.equals("MacBook")){
            com = new MacBook();
        }else if(ty.equals("MacBookPro")){
            com = new MacBookPro();
        }
        return com;
    }
}

public class Dada{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入笔记本");
    Computer com = ComputerFactory.getComputer(sc.next());
    com.fun();
    }
}