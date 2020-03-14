package com.hospital.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hospital.bean.AdminBean;
import com.hospital.bean.PatientBean;
import com.hospital.dao.Dao;
import com.hospital.dao.PatientDao;
import com.hospital.service.HospitalService;

@WebServlet(urlPatterns = { "/Controller", "/adminregistration", "/patientcontroller" })
public class Controller extends HttpServlet {
	public static boolean adminRegistration = false;
	static boolean patientAddmission = false;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		PrintWriter out = response.getWriter();

		if (uri.contains("/adminregistration")) {
			AdminBean adminbean = new AdminBean(request.getParameter("receptionistName"), request.getParameter("empId"),
					request.getParameter("Gender"), Long.parseLong(request.getParameter("mobNo")),
					request.getParameter("email"), request.getParameter("uname"), request.getParameter("npwd"));
			// insert in admintable
			try {
				boolean result = Dao.adminTableInsert(adminbean);
				if (result == true) {
					adminRegistration = true;
					RequestDispatcher dispatcher = request.getRequestDispatcher("AdminRegisterationSuccess.jsp");
					request.setAttribute("result", true);
					dispatcher.forward(request, response);
					System.out.println("Inserted");
				} else {
					System.out.println("Not Inserted");
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		if (uri.contains("/Controller")) {
			String uname = request.getParameter("LogId");
			String pwd = request.getParameter("LogPwd");

			try {
				if (HospitalService.validateAdminLogin(uname, pwd)) {
					RequestDispatcher dispatcher = request.getRequestDispatcher("ShowDetails.jsp");
					dispatcher.forward(request, response);
				} else {
					RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
					dispatcher.include(request, response);
					out.println("Invalid username\n or invalid password");

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (uri.contains("/patientcontroller")) {
			PatientBean patientBean = new PatientBean(request.getParameter("F_name"), request.getParameter("M_name"),
					request.getParameter("L_name"), request.getParameter("gender"),
					Integer.parseInt(request.getParameter("age")), request.getParameter("email"),
					Long.parseLong(request.getParameter("phone")), request.getParameter("address"),
					Long.parseLong(request.getParameter("pincode")), request.getParameter("state"),
					request.getParameter("country"), Controller.getAdmitDate(request.getParameter("admitDate")),
					Integer.parseInt(request.getParameter("wardId")));

			try {
				if (PatientDao.updatePatientDetail(patientBean)) {
					out.println("Data Inserted SuccessFully");
				} else {
					out.println("Data Insertion Failed");

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static LocalDate getAdmitDate(String dateStr) {
		LocalDate date = LocalDate.parse(dateStr);
		return date;

	}

}
