package JDBC_TXT.com.PowerCode.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class JDBCTest01 {
    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("db");
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            //1.注册Mysql驱动jar包
            String driver = bundle.getString("driver");
            Class.forName(driver);
            //2.建立数据库连接对象
            String url = bundle.getString("url");
            String UserName = bundle.getString("UserName");
            String PassWord = bundle.getString("PassWord");
            conn = DriverManager.getConnection(url,UserName,PassWord);
            //3.获取数据库操作对象
            stmt = conn.createStatement();
            //4.执行sql
            String sql = bundle.getString("sql");
            rs = stmt.executeQuery(sql);
            //5.处理结果集
            if(rs.next()){
                while(rs.next()){
                    String name = rs.getString("username");
                    String password = rs.getString("password");
                    System.out.println(name+" "+password);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
                //6.释放资源
                try{
                    if(rs != null) {
                        rs.close();
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
        }
    }
}
