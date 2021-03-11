package com.ltts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.dao.AuctionDao;
import com.ltts.dao.PlayerDao;
import com.ltts.model.Auction;
import com.ltts.model.Player;

/**
 * Servlet implementation class UpdateAuctionServlet
 */
@WebServlet("/UpdateAuctionServlet")
public class UpdateAuctionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAuctionServlet() {
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
		int Auction_id=Integer.parseInt(request.getParameter("Auction_id"));
		int player_id=Integer.parseInt(request.getParameter("player_id"));
		int team_id=Integer.parseInt(request.getParameter("team_id"));
		int year=Integer.parseInt(request.getParameter("year"));
		int amount=Integer.parseInt(request.getParameter("amount"));
		Auction p=new Auction(Auction_id,player_id,team_id,year,amount);
		System.out.println("Inside Update Player Servlet: "+p);
		AuctionDao pd=new AuctionDao();
		boolean b=false;
		RequestDispatcher rd=null;
		try {
			b=pd.updatePlayer(Auction_id,player_id,team_id,year,amount); // Control TRanfers to Dao file
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

