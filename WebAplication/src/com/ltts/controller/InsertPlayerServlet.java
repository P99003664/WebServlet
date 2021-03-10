package com.ltts.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.dao.PlayerDao;
import com.ltts.model.Player;

/**
 * Servlet implementation class InsertPlayerServlet
 */
@WebServlet("/InsertPlayerServlet")
public class InsertPlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertPlayerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int Player_id=Integer.parseInt(request.getParameter("Player_id"));
		String Player_name=request.getParameter("Player_Name");
		Date DateOfBirth=Date.valueOf(request.getParameter("DateOfBirth"))  ;
		String Nationality=request.getParameter("Nationality");
		Player p=new Player(Player_id,Player_name,DateOfBirth,Nationality);
		System.out.println("Inside Servlet: "+p);
		PlayerDao pd=new PlayerDao();
		boolean b=false;
		try {
			b=pd.insertPlayer(p); // Control TRanfers to Dao file
			System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
