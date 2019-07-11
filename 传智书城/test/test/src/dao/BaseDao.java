package dao;

import java.sql.*;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

public class BaseDao<T> {
	// 閺佺増宓佹惔鎾诡問闂傤喗鎼锋担锟�
	private static final String URL = "jdbc:mysql://192.168.106.138:3306/test?characterEncoding=utf-8";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    // 鍔犺浇椹卞姩
    static{
        boolean result = DbUtils.loadDriver(DRIVER);
        if (result == false) {
            try {
                throw new SQLException("鍔犺浇椹卞姩澶辫触");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // 鍒涘缓杩炴帴
    public Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
	/**
	 * 鏉╂柨娲栭崡鏇氶嚋鐎电钖�
	 * @param <T>
	 * 
	 * @param sql
	 * @param clazz
	 * @param params
	 *            婵″倹鐏夊▽鈩冩箒閸欏倹鏆熺亸杈啎娑擄拷 Object[] params={}
	 * @return
	 */
	public <T> T get(String sql, Class<T> clazz, Object[] params) {
		T obj = null;
		Connection conn = null;
		try {
			conn = getConnection();
			QueryRunner qRunner = new QueryRunner();
			obj = qRunner.query(conn, sql, new BeanHandler<T>(clazz), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return obj;
	}
	/**
	 * 鏉╂柨娲栭崡鏇氶嚋鐎电钖� 娴滃濮熼幙宥勭稊
	 * @param <T>
	 * 
	 * @param sql
	 * @param clazz
	 * @param params
	 *            婵″倹鐏夊▽鈩冩箒閸欏倹鏆熺亸杈啎娑擄拷 Object[] params={}
	 * @return
	 */
	public <T> T get(Connection conn,String sql, Class<T> clazz, Object[] params) throws SQLException {
		     T obj = null;
			QueryRunner qRunner = new QueryRunner();
			obj = qRunner.query(conn, sql, new BeanHandler<T>(clazz), params);		
		    return obj;
	}

	/**
	 * 鏉╂柨娲栨径姘嚋鐎电钖�
	 * 
	 * @param sql
	 * @param clazz
	 * @param params
	 *            婵″倹鐏夊▽鈩冩箒閸欏倹鏆熺亸杈啎娑擄拷 Object[] params={}
	 * @return
	 */
	public <T> List<T> query(String sql, Class<T> clazz, Object[] params) {
		List beans = null;
		Connection conn = null;
		try {
			conn = getConnection();
			QueryRunner qRunner = new QueryRunner();
			beans = (List) qRunner.query(conn, sql, new BeanListHandler<T>(clazz), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return beans;
	}

	/**
	 * 鏉╂柨娲栨晶鐐插灩閺�瑙勬Ц閸氾附鍨氶崝锟�
	 * 
	 * @param sql
	 * @param params
	 * @return
	 */
	public boolean update(String sql, Object[] params) {
		Connection conn = null;
		boolean flag = false;
		try {
			conn = getConnection();
			QueryRunner qRunner = new QueryRunner();
			int i = qRunner.update(conn, sql, params);
			if (i > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
    /**
     * 闂囷拷鐟曚浇绻樼悰灞肩皑閸斺剝鎼锋担婊勬閿涘苯婀崥灞肩娴滃濮熺粻锛勬倞娑撳鎼锋担锟�
     * @param conn
     * @param sql
     * @param params
     * @return
     * @throws SQLException
     */
	public boolean update(Connection conn, String sql, Object[] params) throws SQLException {
		boolean flag = false;
		QueryRunner qRunner = new QueryRunner();
		int i = qRunner.update(conn, sql, params);
		if (i > 0) {
			flag = true;
		}
		return flag;
	}

	/***
	 * 閹靛綊鍣洪幙宥勭稊閿涘矂娓剁憰浣烘暏閸掗绨ㄩ崝锟�
	 * 
	 * @param conn
	 * @param sql
	 * @param params
	 * @return
	 * @throws SQLException
	 */
	public boolean batchUpdate(Connection conn, String sql, Object[][] params) throws SQLException {
		QueryRunner qRunner = new QueryRunner();
		int result = 0;
		boolean flag = false;
		result = qRunner.batch(conn, sql, params).length;
		if (result > 0) {
			flag = true;
		}
		return flag;
	}
	
	/**
	 * 鏉╂柨娲栫紒鐔活吀閸楁洖锟斤拷,
	 * @param sql
	 * @param params
	 * @return
	 */
	public long getCount(String sql,Object[] params){
		long count =0L;
		Connection conn = null;
		try {
			conn = getConnection();
			QueryRunner qRunner = new QueryRunner();
			count  = (long) qRunner.query(conn, sql, new ScalarHandler(), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	/**
	 * 鏉╂柨娲栨稉濠氭暛,闁艾鐖堕弰顖涘⒔鐞涘nsert鐠囶厼褰為弮鎯扮箲閸ョ偛缍嬮崜宥囨畱娑撳鏁崐锟�
	 * @param sql
	 * @param params
	 * @return
	 */
    public Long getCurrentKey(String sql,Object[] params){
    	Connection conn = null;
		Long key = 0l;
		try {
			conn = getConnection();
			QueryRunner qRunner = new QueryRunner();
			key = (long) qRunner.update(conn, sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return key;
    }
}
