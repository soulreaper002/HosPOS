package com.hospital.service;

import java.sql.SQLException;

import com.hospital.dao.Dao;

public class HospitalService {
	public static boolean validateAdminLogin(String userName,String passWord) throws SQLException
	{
		boolean result=false;
		String passwordFromDB = Dao.adminTableRetrieve(userName);
		if(passWord!=null && passWord.equals(passwordFromDB))
		{
			result=true;
		}
		return result;
		
	}

}
