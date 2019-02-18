import java.util.Scanner;
//定义的产品抽象类
abstract class Computer{
	public abstract void fun();
}
//具体产品子类
class SufeBook extends Computer{
	public void fun(){
		System.out.println("This is SufeBook");
	}
}
//具体产品子类
class MacBookPro extends Computer{
	public void fun(){
		System.out.println("This is MacBookPro");
	}
}
//工厂类
class ComputerFactory{
	private ComputerFactory(){}
	public static Computer getComuter(String pcType){
		Computer ret = null;
		if(pcType.equals("mac")){
			ret = new MacBookPro();
		}else if(pcType.equals("sufe")){
			ret = new SufeBook();
		}
		return ret;
	}
}

public class Demo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入笔记本");
		Computer  ret = ComputerFactory.getComuter(sc.next());
		ret.fun();
	}
}

//interface Computer{
//    void printComputer();
//}
//
//class MackbookProComputer implements Computer{
//    @Override
//    public void printComputer() {
//        System.out.println("MacbookPro");
//    }
//}
//
//class SurfaceBookComputer implements Computer{
//    @Override
//    public void printComputer() {
//        System.out.println("SurfaceBook");
//    }
//}
//
//interface ComputerFactory{
//    Computer createComputer();
//}
//
//class AppleFactory implements ComputerFactory{
//    @Override
//    public Computer createComputer() {
//        return new MackbookProComputer();
//    }
//}
//
//class MsFactory implements ComputerFactory{
//    @Override
//    public Computer createComputer() {
//        return new SurfaceBookComputer();
//    }
//}
//
//public class Client{
//    public void buyComputer(Computer computer){
//        computer.printComputer();;
//    }
//
//    public static void main(String[] args) {
//        Client c = new Client();
//        ComputerFactory f = new AppleFactory();
//        c.buyComputer(f.createComputer());
//    }
//}

interface Computer{
    void printComputer();
}

class MacbookProComputer implements Computer{
    @Override
    public void printComputer() {
        System.out.println("MackbookPro");
    }
}

class SurfaceBookComputer implements Computer{
    @Override
    public void printComputer() {
        System.out.println("SurfeceBook");
    }
}

interface OperatingSystem{
    void printSystem();
}

class MacOsSystem implements OperatingSystem{
    @Override
    public void printSystem() {
        System.out.println("This is mac os");
    }
}

class Windows8System implements OperatingSystem{
    @Override
    public void printSystem() {
        System.out.println("This is window8");
    }
}

interface ProdectionFactory{
    Computer createComputer();
    OperatingSystem createSystem();
}

class AppleFactory implements ProdectionFactory{
    @Override
    public Computer createComputer() {
        return new MacbookProComputer();
    }

    @Override
    public OperatingSystem createSystem() {
        return new MacOsSystem();
    }
}

class MsFactory implements ProdectionFactory{
    @Override
    public Computer createComputer() {
        return new MacbookProComputer();
    }

    @Override
    public OperatingSystem createSystem() {
        return new MacOsSystem();
    }
}

public class Client{
    public void buyComputer(Computer computer){
        computer.printComputer();
    }
    public void use(OperatingSystem s){
        s.printSystem();
    }
    public static void main(String[] args) {
        Client c = new Client();
        ProdectionFactory factory = new AppleFactory();
        Computer computer = factory.createComputer();
        OperatingSystem system = factory.createSystem();
        c.buyComputer(computer);
        c.use(system);
    }
}
