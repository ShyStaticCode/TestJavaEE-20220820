package JDBC_TXT.com.PowerCode.java;

import java.sql.*;

/**
 * jdbc的事物机制（执行DML语句）是自动提交的
 */
public class Transaction_test {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","123456");
            //String sql = "delete from student where deptno=?";
            String sql = "update student set age=? where id=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,99);
            ps.setInt(2,1);
            int count = ps.executeUpdate();
            System.out.println(count==1 ? "SUCCESS" : "FAIL");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally{
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
    }
}
