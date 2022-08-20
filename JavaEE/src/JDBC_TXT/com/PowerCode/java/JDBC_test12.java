package JDBC_TXT.com.PowerCode.java;

import JDBC_TXT.com.PowerCode.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 1.测试DBUtil是否好用
 * 2.锻炼like查询的书写
 */
public class JDBC_test12 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            //模糊查询错误写法
            /*String sql = "select ename from emp where ename like '_?%'";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"A");*/
            //正确写法
            String sql = "select ename from emp where ename like ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"_A%");
            rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("ename"));
            }

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtil.close(conn,ps,rs);
        }
    }
}
