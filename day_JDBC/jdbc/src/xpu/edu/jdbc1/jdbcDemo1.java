package xpu.edu.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC快速入门
 */
public class jdbcDemo1 {
    public static void main(String[] args) throws Exception {
        //1.导入jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","1234");
        //4.定义SQL语句
        String sql = "update student set math = 100 where name = '张三'";
        //5.获取执行SQL的对象
        Statement stmt = conn.createStatement();
        //6.执行SQL
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        conn.close();
    }
}
