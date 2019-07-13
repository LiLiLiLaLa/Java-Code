package xpu.edu1;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("Dao中保存用户的方法执行了");
    }
}
