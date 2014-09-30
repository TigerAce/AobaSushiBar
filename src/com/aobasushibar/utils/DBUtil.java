package com.aobasushibar.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection getConnection(){
		Connection conn = null;
		
		try{
			JdbcInfo jdbcInfo = ConfigReader.getInstance().getJdbcInfo();
			Class.forName(jdbcInfo.getDriverName());
			String dburl = jdbcInfo.getUrl();
			String username = jdbcInfo.getUsername();
			String password = jdbcInfo.getPassword();
			conn = DriverManager.getConnection(dburl,username,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			throw new RuntimeException("DB driver not found");
		}catch (Exception e){
			e.printStackTrace();
			throw new RuntimeException("DB system error");
		}
		
		return conn;
	}
	
	public static void close(PreparedStatement pstmt){
		if(pstmt != null){
			try{
				pstmt.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Connection conn){
		if(conn != null){
			try{
				conn.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	public static void close(ResultSet rs){
		if(rs != null){
			try{
				rs.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void commit(Connection conn){
		if(conn != null){
			try{
				conn.commit();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void rollback(Connection conn){
		if(conn != null){
			try{
				conn.rollback();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void setAutoCommit(Connection conn, boolean autoCommit){
		if(conn != null){
			try{
				conn.setAutoCommit(autoCommit);
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
/*	public static void main(String[] argv) {
		Connection conn = DBUtil.getConnection();
		if (conn != null) {
			System.out.println("connect success");
		} else {
			System.out.println("connect failed");
		}
		DBUtil.close(conn);
	}*/
 
}
