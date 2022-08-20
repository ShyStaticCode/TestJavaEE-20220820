package JDBC_TXT.com.PowerCode.java.pro;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;

public class pro {
    public static void main(String[] args) {
        //初始化用户界面
        Map<String,String> LoginMapUser = initUI();
        //登录
        boolean loginSuccess = login(LoginMapUser);
        //结果
        System.out.println(loginSuccess ? "登录成功" : "登录失败");
    }

    /**
     * 用户登录验证
     * @param loginMapUser
     * @return false表示失败，true表示成功
     */
    private static boolean login(Map<String, String> loginMapUser) {
        boolean loginSucess = false;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String UserName = bundle.getString("UserName");
        String PassWord = bundle.getString("PassWord");
        String loginName = loginMapUser.get("loginName");
        String loginPwd = loginMapUser.get("loginPwd");
        String sql = "SELECT * FROM t_user WHERE loginName='"+loginName+"' and loginPwd='"+loginPwd+"'";
        try {
            //1.注册驱动
            Class.forName(driver);
            //2.建立数据库连接
            conn = DriverManager.getConnection(url,UserName,PassWord);
            //3.获取数据库连接对象
            stmt = conn.createStatement();
            //4.执行SQL
            rs = stmt.executeQuery(sql);
            //5.处理结果集
            if(rs.next()){
                return loginSucess=true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            //6.释放资源
            try {
                if(rs != null) {
                    rs.close();
                }
                if(stmt != null) {
                    rs.close();
                }
                if(conn != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return loginSucess;
    }

    /**
     * 初始化用户界面
     * @return 用户输入的用户名和密码等的登录信息
     */
    private static Map<String, String> initUI() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String LoginName = sc.nextLine();
        System.out.println("请输入密码：");
        String LoginPwd = sc.nextLine();
        Map<String,String> LoginMap = new HashMap<String, String>();
        LoginMap.put("loginName",LoginName);
        LoginMap.put("loginPwd",LoginPwd);
        return LoginMap;
    }
}
