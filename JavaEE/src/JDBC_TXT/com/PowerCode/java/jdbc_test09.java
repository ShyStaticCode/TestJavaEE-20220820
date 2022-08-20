package JDBC_TXT.com.PowerCode.java;

import java.sql.*;

public class jdbc_test09 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","123456");
            /*String sql = "insert into dept(deptno,dname,loc) values (?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,70);
            ps.setString(2,"外卖");
            ps.setString(3,"乌苏");*/
            String sql = "delete from dept where deptno=?";
            ps = conn.prepareStatement(sql);

            /*ps.setString(1,"accounting");
            ps.setString(2,"new york");*/
            ps.setInt(1,99);

            int count = ps.executeUpdate();
            System.out.println(count);
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
