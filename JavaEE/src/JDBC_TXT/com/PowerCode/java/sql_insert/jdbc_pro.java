package JDBC_TXT.com.PowerCode.java.sql_insert;
/*
比较Statement和PreparedStatement
        前者会存在sql注入的问题，但是有时会因为业务需要对他进行使用，就比如说需要升序，降序排列的时候，
        也就是说，当我们需要从外部传入sql关键字，并且让程识别并序运行的时候，我们一般会采用Statement；
        -----------------------------------------------------------------------------
        后者就主要用于外部验证，大多是条件等的信息，做判断，输入的不是sql关键字，他有通配符？，会自动添加单引号''

 */
import java.sql.*;
import java.util.Scanner;

public class jdbc_pro {
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        String keyWords = null;
        System.out.print("请输入1表示降序，2表示升序:");
        int a = sc.nextInt();
        if(a == 1) {
            keyWords="DESC";
        }else if(a == 2){
            keyWords="ASC";
        }else {
            System.out.println("您的输入有误!");
        }
        //执行SQL六步骤
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","123456");
            String sql = "select ename from emp order by ename ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,keyWords);
            rs = ps.executeQuery();
            while (rs.next()){
                String ename = rs.getString("ename");
                System.out.println(ename);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            te.printStackTrace();
        } finally {
            try {
                if(rs != null){
                    rs.close();
                }
                if(ps != null){
                    rs.close();
                }
                if(conn != null){
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }*/


        Scanner sc = new Scanner(System.in);
        String keyWords = null;
        System.out.print("请输入1表示降序，2表示升序:");
        int a = sc.nextInt();
        if(a == 1) {
            keyWords="DESC";
        }else if(a == 2){
            keyWords="ASC";
        }else {
            System.out.println("您的输入有误!");
        }
        //执行SQL六步骤
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","123456");
            String sql = "select ename from emp order by ename "+keyWords;
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()){
                String ename = rs.getString("ename");
                System.out.println(ename);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if(rs != null){
                    rs.close();
                }
                if(stmt != null){
                    rs.close();
                }
                if(conn != null){
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


    }
}
