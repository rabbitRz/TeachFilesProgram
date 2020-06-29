package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	 static { 
		 try { 
			 Class.forName("com.mysql.cj.jdbc.Driver"); 
	 }catch(Exception e){ 
		 throw new RuntimeException(e); 
		 } 
	}
	 
	private static String user="root";
	private static String pwd="123456";
	private static String url="jdbc:mysql://182.92.201.241:3306/TeachFilesProgram?"
			+ "useUnicode=true&characterEncoding=utf8"
			+ "&useSSL=false&serverTimezone=UTC";
	public static Connection getConnection() {
		try {
			Connection conn=DriverManager.getConnection(url,user,pwd);
			return conn;
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public static void close(ResultSet rs,Statement stmt,
			Connection conn){
		if(rs!=null) {
			try{rs.close();}catch(Exception e) {}
		}
		if(stmt!=null) {
			try{stmt.close();}catch(Exception e) {}
		}
		if(conn!=null) {
			try{conn.close();}catch(Exception e) {}
		}
	}
}
