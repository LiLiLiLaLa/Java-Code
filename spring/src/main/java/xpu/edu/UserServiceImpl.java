package xpu.edu;

/**
 *  用户管理业务层实现类
 */
public class UserServiceImpl implements UserService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void save() {
        System.out.println("UserService" + name);
    }
}
