package dao;

import java.sql.*;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

public class BaseDao<T> {
	// 闁轰胶澧楀畵浣规償閹捐鍟忛梻鍌ゅ枟閹奸攱鎷呴敓锟�
	private static final String URL = "jdbc:mysql://192.168.106.138:3306/Property?characterEncoding=utf-8";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    // 閸旂姾娴囨す鍗炲З
    static{
        boolean result = DbUtils.loadDriver(DRIVER);
        if (result == false) {
            try {
                throw new SQLException("閸旂姾娴囨す鍗炲З婢惰精瑙�");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // 閸掓稑缂撴潻鐐村复
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
	 * 閺夆晜鏌ㄥú鏍础閺囨岸鍤嬮悗鐢殿攰閽栵拷
	 * @param <T>
	 * 
	 * @param sql
	 * @param clazz
	 * @param params
	 *            濠碘�冲�归悘澶娾柦閳╁啯绠掗柛娆忓�归弳鐔轰焊鏉堫偒鍟庡☉鎿勬嫹 Object[] params={}
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
	 * 閺夆晜鏌ㄥú鏍础閺囨岸鍤嬮悗鐢殿攰閽栵拷 濞存粌顑呮慨鐔煎箼瀹ュ嫮绋�
	 * @param <T>
	 * 
	 * @param sql
	 * @param clazz
	 * @param params
	 *            濠碘�冲�归悘澶娾柦閳╁啯绠掗柛娆忓�归弳鐔轰焊鏉堫偒鍟庡☉鎿勬嫹 Object[] params={}
	 * @return
	 */
	public <T> T get(Connection conn,String sql, Class<T> clazz, Object[] params) throws SQLException {
		     T obj = null;
			QueryRunner qRunner = new QueryRunner();
			obj = qRunner.query(conn, sql, new BeanHandler<T>(clazz), params);		
		    return obj;
	}

	/**
	 * 閺夆晜鏌ㄥú鏍ㄥ緞濮橆偊鍤嬮悗鐢殿攰閽栵拷
	 * 
	 * @param sql
	 * @param clazz
	 * @param params
	 *            濠碘�冲�归悘澶娾柦閳╁啯绠掗柛娆忓�归弳鐔轰焊鏉堫偒鍟庡☉鎿勬嫹 Object[] params={}
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
	 * 閺夆晜鏌ㄥú鏍ㄦ櫠閻愭彃鐏╅柡锟界憴鍕﹂柛姘鹃檮閸ㄦ岸宕濋敓锟�
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
     * 闂傚浄鎷烽悷鏇氭祰缁绘鎮扮仦鑲╃殤闁告柡鍓濋幖閿嬫媴濠婂嫭顦ч柨娑樿嫰濠�顏堝触鐏炶偐顏卞ù婊冾儏婵喓绮婚敍鍕�炲☉鎾愁儐閹奸攱鎷呴敓锟�
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
	 * 闁归潧缍婇崳娲箼瀹ュ嫮绋婇柨娑樼焸濞撳墎鎲版担鐑樻殢闁告帡顣︾花銊╁礉閿燂拷
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
	 * 閺夆晜鏌ㄥú鏍磼閻旀椿鍚�闁告娲栭敓鏂ゆ嫹,
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
	 * 閺夆晜鏌ㄥú鏍ㄧ▔婵犳碍鏆�,闂侇偅鑹鹃悥鍫曞及椤栨稑鈷旈悶娑橆吙nsert閻犲浂鍘艰ぐ鐐哄籍閹壆绠查柛銉у仜缂嶅宕滃鍥ㄧ暠濞戞挸顭烽弫顓㈠磹閿燂拷
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
