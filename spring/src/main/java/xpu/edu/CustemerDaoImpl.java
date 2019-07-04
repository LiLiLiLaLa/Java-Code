package xpu.edu;

public class CustemerDaoImpl implements CustemerDao {
    public void init2(){
        System.out.println("custemerDaoImpl被初始化了");
    }

    @Override
    public void save() {
        System.out.println("CustemerDaoImpl的save方法执行了");
    }

    public void destroy(){
        System.out.println("CustemerDaoImpl被销毁了");
    }
}
