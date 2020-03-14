package com.hospital.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import com.hospital.bean.PatientBean;

public class PatientDao {
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

	public static boolean updatePatientDetail(PatientBean patientBean) throws SQLException
	{
		boolean update=false;
		Connection con=PatientDao.establishConnection();
		con.setAutoCommit(false);
		String sql = "insert into patientdetail values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, patientBean.getFirstName());
		pstmt.setString(2, patientBean.getMiddleName());
		pstmt.setString(3, patientBean.getLastName());
		pstmt.setString(4, patientBean.getGender());
		pstmt.setLong(5, patientBean.getAge());
		pstmt.setString(6, patientBean.getEmail());
		pstmt.setLong(7, patientBean.getPhoneNumber());
		pstmt.setString(8, patientBean.getAddress());
		pstmt.setLong(9, patientBean.getPinCode());
		pstmt.setString(10, patientBean.getState());
		pstmt.setString(11, patientBean.getCountry());
		pstmt.setDate(12,PatientDao.convertDate( patientBean.getAdmitDate()));
		pstmt.setInt(13, patientBean.getWardId());
		pstmt.executeUpdate();
		con.commit();
		con.close();
		update=true;
		return update;
	}
	private static java.sql.Date convertDate(LocalDate lDate)
	{
		java.sql.Date sDate = java.sql.Date.valueOf(lDate);
		return sDate;
		
	}
}
