package com.ltts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.dao.PlayerDao;
import com.ltts.dao.TeamDao;
import com.ltts.model.Player;
import com.ltts.model.Team;

/**
 * Servlet implementation class UpdateTeamServlet
 */
@WebServlet("/UpdateTeamServlet")
public class UpdateTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTeamServlet() {
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
		PrintWriter out = response.getWriter(); 
		
		int teamid=Integer.parseInt(request.getParameter("teamid"));
		String teamname=request.getParameter("teamname");
		String ownername=request.getParameter("ownername");
		String coachname=request.getParameter("coachame");
		Team p=new Team(teamid,teamname,ownername,coachname);
		System.out.println("Inside Update Player Servlet: "+p);
		TeamDao pd=new TeamDao();
		boolean b=false;
		RequestDispatcher rd=null;
		try {
			b=pd.updateTeam(teamid,teamname,ownername,coachname); // Control TRanfers to Dao file
			rd=request.getRequestDispatcher("success.html");
			rd.forward(request, response);
			//System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.write("Already Player id Used: "+e);
			rd=request.getRequestDispatcher("addTeam.html");
			rd.include(request, response);
			e.printStackTrace();
		}
}
		
	}

}
