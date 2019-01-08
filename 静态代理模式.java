public interface BuyHouse {
    void buyHouse();
}

class BuyHouseImpl implements BuyHouse {
    @Override
    public void buyHouse() {
        System.out.println("��Ҫ��");
    }
}


/**
 * �������ӵĴ�����
 */
class BuyHouseProxy implements BuyHouse{
    private BuyHouse buyHouse;


    public BuyHouseProxy(BuyHouse buyHouse){
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        System.out.println("��ǰ׼��");
        buyHouse.buyHouse();//�����Ĳ��軹���ɿͻ������
        System.out.println("�򷿺�װ��");
    }
}