/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author yhy
 */
public class Delete {
     public static void main(String[] args) {
        //初始化数据
        Connection conn = null; //连接对象
        Statement stmt = null;//执行对象
        int result = 0; //判断执行结果（判断执行影响行数）
        String sql = "update product set state=0 where pid=1";
        
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
             //4执行
             result = stmt.executeUpdate(sql);//发sql语句给数据库服务器
             
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
        }
        //验证
        if(result>0){
            System.out.println("执行成功");
        }else{
            System.out.println("执行失败");
        }
     }
}
