package com.dopamine.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dopamine.model.User;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/home")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("Email");

		String dateOfBirth = request.getParameter("dateOfBirth");

		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");

		SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");

		try {
			Date date = inputFormat.parse(dateOfBirth);

			dateOfBirth = outputFormat.format(date);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		String[] hearOption = request.getParameterValues("flexRadioDefault");

		String[] announceOption = request.getParameterValues("flexCheckDefault");
		
		String contactOption = request.getParameter("select");

		String hearFrom = "NA";
		String wantsUpdate = "No";
		
		if(announceOption != null && Arrays.asList(announceOption).size() == 1) {
			wantsUpdate = "Yes";
		}
		
		if(announceOption != null && Arrays.asList(hearOption).size() == 1) {
			hearFrom = hearOption[0];
		}
		
		User user = new User(firstName, lastName, email, dateOfBirth, hearFrom, wantsUpdate,
				contactOption);

		request.setAttribute("user", user);
		request.getRequestDispatcher("/views/survey.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
