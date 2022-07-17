package Test01;

import java.sql.*;

public class JDBCTest01 {
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        try {
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","333");
            stmt=conn.createStatement();
            String sql="delete from student where id=1007 ";
            int num=stmt.executeUpdate(sql);
            System.out.println(num==1?"删除成功":"删除失败");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
