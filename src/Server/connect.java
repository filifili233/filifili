package Server;
 import java.sql.*;






 
public class connect {
	 
	
	
	
		
	
	static Statement getConn() throws ClassNotFoundException, SQLException{
		try {
		Class.forName("com.mysql.jdbc.Driver");
	  conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/filifili"
				,"root","33192475");
	  stat = conn.createStatement();
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver is not found.");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stat;
	}
	
	private static connect db;
	private static Statement stat;
	private static Connection conn;
	private static PreparedStatement ps;
	private ResultSet rs;
	
	private connect() {

	}

	public static connect getconnect() {
		if (db == null) {
			db = new connect();
		}
		return db;
	}

	public int executeUpdate(String sql) throws ClassNotFoundException, SQLException {
		int result = -1;
		if (getConn() == null) {
			return result;
		}
		try {
			ps = conn.prepareStatement(sql);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int executeUpdate(String sql, Object[] obj) throws ClassNotFoundException, SQLException {
		int result = -1;
		if (getConn() == null) {
			return result;
		}
		try {
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < obj.length; i++) {
				ps.setObject(i + 1, obj[i]);
			}
			result = ps.executeUpdate();
			close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public ResultSet executeQuery(String sql) throws ClassNotFoundException, SQLException {
		if (getConn() == null) {
			return null;
		}
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public ResultSet executeQuery(String sql, Object[] obj) throws ClassNotFoundException, SQLException {
		if (getConn() == null) {
			return null;
		}
		try {
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < obj.length; i++) {
				ps.setObject(i + 1, obj[i]);
			}
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rs;
	}

	public boolean exeute(String sql) throws ClassNotFoundException, SQLException {
		if (getConn() == null) {
			return false;
		}
		try {
			Statement statement = conn.createStatement();
			statement.execute(sql);
			statement.close();
			return true;
		} catch (SQLException e) {
//			e.printStackTrace();
			return false;
		}
	}

	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	

}
