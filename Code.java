interface ISubject{
    public void buyComputer(); //核心功能是买电脑
}

class RealSubject implements ISubject{
    @Override
    public void buyComputer() {
        System.out.println("买一台外星人电脑");
    }
}

class ProxySubject implements ISubject{
    //真实的操作
    private ISubject subject;
    public ProxySubject(ISubject subject){
        this.subject = subject;
    }

    public void prodeceComputer(){
        System.out.println("生产一台外星人电脑");
    }

    public void saleAfter(){
        System.out.println("外星人电脑售后团队");
    }

    @Override
    public void buyComputer() {
        this.prodeceComputer();//真实操作之前的准备
        this.subject.buyComputer();//强调真实业务
        this.saleAfter();//强调收尾工作
    }
}

class Factory{
    public static ISubject getInstance(){
        return new ProxySubject(new RealSubject());
    }
}

public class Code{
    public static void main(String[] args) {
        ISubject subject = Factory.getInstance();
        subject.buyComputer();
    }
}