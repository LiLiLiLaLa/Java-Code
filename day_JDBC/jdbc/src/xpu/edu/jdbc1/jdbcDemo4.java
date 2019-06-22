package xpu.edu.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 删除记录
 */
public class jdbcDemo4 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        //1.注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///db","root","1234");
            //3.定义SQL语句
            String sql = "delete from student where id = 2";
            //4.获取执行sql对象
            stmt = conn.createStatement();
            //5.执行SQL
            int count = stmt.executeUpdate(sql);
            //6.处理结果集
            System.out.println(count);
            if(count > 0){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //7.释放资源
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
