package com.hpe.pps.dao;

import java.sql.*;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
/**
 * 负责数据库操作
 * @author yhy
 */
public class BaseDao{
       //获得连接对象
	public Connection getConnection(){
	        Connection conn = null;
                String jdbcDriver = "com.mysql.jdbc.Driver";
	        String jdbcURL = "jdbc:mysql://localhost:3306/pss";
	        String user = "root";
	        String password = "admin";
	        try {
	            DbUtils.loadDriver(jdbcDriver);
	            conn = DriverManager.getConnection(jdbcURL, user, password);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } 
	        return conn;

	}
	/**
     * 查找多个对象
     * @param sql
     * @param clazz
     * @return
     */
    public List query(String sql, Class clazz) {
        List beans = null;
        Connection conn = null;
        try {
            conn = getConnection();
            //QueryRunner类是DBUtils中主要的操作数据的类
            QueryRunner qRunner = new QueryRunner();
            beans =
                (List) qRunner.query(
                    conn,
                    sql,
                    new BeanListHandler(clazz));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return beans;
    }
 
    /**
     * 查找对象
     * @param sql
     * @param clazz
     * @return
     */
    public Object get(String sql, Class clazz) {
        List beans = null;
        Object obj = null;
        Connection conn = null;
        try {
            conn = getConnection();
            QueryRunner qRunner = new QueryRunner();
            beans =
                (List) qRunner.query(
                    conn,
                    sql,
                    new BeanListHandler(clazz));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        if(beans!=null && !beans.isEmpty()){ //注意这里
             obj=beans.get(0);
        }
        return obj;
    }
 
    /**
     * 执行更新的sql语句,插入,修改,删除
     * @param sql
     * @return
     */
    public boolean update(String sql,Object[] params) {
        Connection conn = null;
        boolean flag = false;
        try {
            conn = getConnection();
            QueryRunner qRunner = new QueryRunner();
            int i = qRunner.update(conn,sql,params);
            if (i > 0) {
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return flag;
    }
   /**
    * 更新数据库重载方法
    * @param conn 连接对象
    * @param sql sql语句
    * @param params 参数
    * @return 
    */
    public boolean update(Connection conn,String sql,Object[] params) throws SQLException {
            boolean flag = false;
            conn = getConnection();
            QueryRunner qRunner = new QueryRunner();
            int i = qRunner.update(conn,sql,params);
            if (i > 0) {
                flag = true;
            }
            return flag;
    }
/**
	 * 批量更新
	 * @param sql
	 * @param params
	 * @return
	 */
	public boolean batchUpdate(Connection conn,String sql,Object[][] params) throws SQLException{
		QueryRunner qRunner = new QueryRunner();
		int result = 0;
		boolean flag = false;
                result = qRunner.batch(conn, sql, params).length;
                if(result > 0){
                        flag = true;
                }
		return flag;
	}

}
