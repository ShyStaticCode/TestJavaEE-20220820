package JDBC_TXT.com.PowerCode;

import JDBC_TXT.com.PowerCode.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 行级锁
 * 负责锁住
 */
public class TEST_01 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            //正确写法
            conn.setAutoCommit(false);//开启事务
            String sql = "select ename,job,sal from emp where job = ? for update ";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"SALESMAN");
            rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("ename")+","+rs.getString("job")+","+rs.getDouble("sal"));
            }

            conn.commit();//提交事务
        } catch (Exception e) {
            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException q) {
                    q.printStackTrace();
                }
            }
            e.printStackTrace();
        }finally {
            DBUtil.close(conn,ps,rs);
        }
    }
}
