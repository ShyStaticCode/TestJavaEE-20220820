package JDBC_TXT.com.PowerCode;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * author ：mating
 * sql脚本
 * drop table if exists t_act;
 * create table t_act(
 *      actno int,
 *      balance double(7,2)
 *      );
 * insert into t_act(actno,balance) values(111,20000);
 * insert into y_act(actno,balance) values(222,0);
 *** 初始化数据库**
 */
public class JDBCtest10 {
    public static void main(String[] args) {

        //转账
        int money=10000;
        int start=111;
        int end=222;
        System.out.println(transfer(money,start,end) ? "转账成功" : "转账失败");


    }
    private static boolean transfer(int money,int start,int end) {

        boolean Success= false;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String UserName = bundle.getString("UserName");
        String PassWord = bundle.getString("PassWord");
        String sql = bundle.getString("sql");
        try {
            //1.注册驱动
            Class.forName(driver);
            //2.建立数据库连接
            conn = DriverManager.getConnection(url,UserName,PassWord);

            conn.setAutoCommit(false);//开启事务
            //3.获取数据库连接对象
            ps = conn.prepareStatement(sql);
            //传值
            ps.setDouble(1,money);
            ps.setInt(2,start);
            //4.执行SQL
            int count = ps.executeUpdate();

            //传值
            ps.setDouble(1,money);
            ps.setInt(2,end);
            //4.执行SQL
            count += ps.executeUpdate();

            //5.处理结果集
            if(count==2){
                conn.commit();//手动提交
                return Success=true;
            }

        } catch (Exception e) {
            if(conn != null){
                try {
                    conn.rollback();//回滚事物
                } catch (SQLException q) {
                    q.printStackTrace();
                }
            }e.printStackTrace();
        } finally {
            //6.释放资源
            try {
                if(rs != null) {
                    rs.close();
                }
                if(ps != null) {
                    ps.close();
                }
                if(conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return Success;
    }
}
