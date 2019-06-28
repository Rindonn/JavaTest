/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author yhy
 */
public class Find {
     public static void main(String[] args) {
        //初始化数据
        Connection conn = null; //连接对象
        Statement stmt = null;//执行对象
        ResultSet rs = null; //结果集对象（专用于查询）
        String sql = "select * from product where state=1";
        ArrayList<Product>  list = new ArrayList<Product>();
        try {
            //1 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2 创建连接对象(连接到哪个数据库)
             String url = "jdbc:mysql://localhost:3306/pss"; //数据库所在位置
             String user = "root";
             String pwd = "admin";
             conn = DriverManager.getConnection(url, user, pwd);
             //测试
             System.out.println(conn);
             //3 根据连接对象创建执行对象
             stmt = conn.createStatement(); //并不是stmt执行sql语句
             //4执行 (增删改：返回int，影响的行数，查询：返回对象或者集合)
            // result = stmt.executeUpdate(sql);//发sql语句给数据库服务器
             rs = stmt.executeQuery(sql);//执行查询
             //将rs中的值转到list集合中
             while(rs.next()){
                 //创建商品对象
                Product p = new Product();
                //给对象赋值(来自于rs)
                p.setPid(rs.getInt("pid")); //pid跟数据表的字段名一致
                p.setPname(rs.getString("pname"));
                p.setSupplier(rs.getString("supplier"));
                p.setPrice(rs.getBigDecimal("price"));
                p.setState(rs.getInt("state"));
                //将对象p添加到集合
                list.add(p);
             }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
        }
        //遍历集合
        for(Product p : list){ //forEach循环，增强for循环
             System.out.println(p);
        }
        
    }
}
