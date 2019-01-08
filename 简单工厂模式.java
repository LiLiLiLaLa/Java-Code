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
