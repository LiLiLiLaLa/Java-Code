public interface BuyHouse {
    void buyHouse();
}

class BuyHouseImpl implements BuyHouse {
    @Override
    public void buyHouse() {
        System.out.println("我要买房");
    }
}


/**
 * 这是买房子的代理类
 */
class BuyHouseProxy implements BuyHouse{
    private BuyHouse buyHouse;


    public BuyHouseProxy(BuyHouse buyHouse){
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        System.out.println("买房前准备");
        buyHouse.buyHouse();//真的买的步骤还是由客户来完成
        System.out.println("买房后装修");
    }
}