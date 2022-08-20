package JDBC_TXT.com.PowerCode;

import JDBC_TXT.com.PowerCode.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 行级锁
 * 负责修改数据
 */
public class TEST_02 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DBUtil.getConnection();
            conn.setAutoCommit(false);
            String sql = "update emp set sal=sal*1.1 where job=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"SALESMAN");
            int count = ps.executeUpdate();
            System.out.println(count);

            conn.commit();
        } catch (Exception throwables) {
            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            throwables.printStackTrace();
        }finally {
            DBUtil.close(conn,ps,null);
        }
    }
}
