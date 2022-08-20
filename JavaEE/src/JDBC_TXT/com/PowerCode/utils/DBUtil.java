package JDBC_TXT.com.PowerCode.utils;

import java.sql.*;

/**
 * JDBC工具类
 * 封装JDBC
 */
public class DBUtil{

    /**
     * 工具类方法，一般情况下构造方法私有，不用new对象，直接采用类名去调用
     */
    private DBUtil() {}
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接对象
     * @return Connection 对象
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/db1",
                    "root","123456");
    }

    /**
     * 关闭数据库连接对象
     * @param conn 数据库连接对象
     * @param stmt 数据库操作对象
     * @param rs   获取结果集对象
     */
    public static void close(Connection conn, Statement stmt, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
