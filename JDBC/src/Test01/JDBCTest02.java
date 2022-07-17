package Test01;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JDBCTest02 {
    public static void main(String[] args) {
        while (true) {
            //初始化界面
            Map<String, String> userLogInfo = loginUI();
            //验证用户名和密码
            boolean loginSuccess = login(userLogInfo);
            System.out.println(loginSuccess ? "登录成功" : "登录失败");
        }
    }

    private static boolean login(Map<String, String> userLogInfo) {
        boolean flag=false;
        Connection conn=null;
//        Statement stmt=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","333");
//            stmt=conn.createStatement();
//            String sql="select * from student where name='"+userLogInfo.get("loginName")+"' and id='"+userLogInfo.get("loginPwd")+"'";
//            rs=stmt.executeQuery(sql);
            String sql="select * from student where name= ? and id= ?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,userLogInfo.get("loginName"));
            ps.setString(2,userLogInfo.get("loginPwd"));
            rs= ps.executeQuery();
            if (rs.next()){
                 flag=true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
//            if (stmt!=null){
//                try {
//                 stmt.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
            if (ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return flag;
        }
    }

    private static Map<String ,String > loginUI() {
        Scanner s=new Scanner(System.in);

        System.out.println("请输入用户名：");
        String loginName=s.nextLine();
        System.out.println("请输入密码：");
        String loginPwd=s.nextLine();
        Map<String ,String > loginInfo=new HashMap<>();
        loginInfo.put("loginName",loginName);
        loginInfo.put("loginPwd",loginPwd);
        return loginInfo;
    }
}
