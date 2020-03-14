package com.hospital.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import com.hospital.bean.AdminBean;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class Dao {
	private static PreparedStatement getPreStmtIns(String sql) throws SQLException {
		Connection con = Dao.establishConnection();
		PreparedStatement psmt = con.prepareStatement(sql);
		return psmt;

	}

	private static Connection establishConnection() {
		Connection con = null;
		System.out.println("in dao");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?useSSL=false", "root", "admin");
			System.out.println("Connection Established");
		} catch (SQLException ex) {
			System.out.println("in ct");
		}
		return con;
	}

	public static boolean adminTableInsert(AdminBean adminbean) throws SQLException {
		String sql = "insert into admintable values(?,?,?,?,?,?,?)";
		Connection con = establishConnection();
		con.setAutoCommit(false);
		boolean insert = false;
		PreparedStatement pstmt = Dao.getPreStmtIns(sql);
		pstmt.setString(1, adminbean.getReceptionistName());
		pstmt.setString(2, adminbean.getEmployeeId());
		pstmt.setString(3, adminbean.getGender());
		pstmt.setLong(4, adminbean.getMobileNo());
		pstmt.setString(5, adminbean.getEmail());
		pstmt.setString(6, adminbean.getUserName());
		pstmt.setString(7, adminbean.getPassword());
		pstmt.execute();
		con.commit();
		con.close();
		insert = true;
		return insert;

	}

	public static String adminTableRetrieve(String userName) throws SQLException {
		String password = null;
		Connection con = Dao.establishConnection();
		System.out.println("Got the connection");
		if (con == null) {
			System.out.println("Some Error");
		} else {
			String sql = "SELECT password from admintable WHERE username=?";

			PreparedStatement prepstmt = con.prepareStatement(sql);
			prepstmt.setString(1, userName);

			ResultSet rs = prepstmt.executeQuery();

			while (rs.next()) {
				password = rs.getString("password");
			}
			rs.close();
			con.close();
		}

		return password;

	}
}
