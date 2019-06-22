package xpu.edu.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 添加一条记录
 */
public class jdbcDemo2 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        //1.注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = null;
            //2.定义sql
            String sql = "insert into student values(10,'邹鸡儿',18,'女','西安',22,13)";
            //3.获得Connection对象
           conn = DriverManager.getConnection("jdbc:mysql:///db", "root", "1234");
            //4.获取执行sql的对象
            stmt = conn.createStatement();
            //5.执行sql
            int count = stmt.executeUpdate(sql);
            //6.处理结果
            System.out.println(count);
            if(count > 0){
                System.out.println("添加成功");
            }else{
                System.out.println("添加失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
          e.printStackTrace();
    }finally {
            //stmt.close();
            //如果获取Connection对象时出错，这时statement还是null，那么调用close会出现空指针异常
            //避免空指针异常
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
}
}
