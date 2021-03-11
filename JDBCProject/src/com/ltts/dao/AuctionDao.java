package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configuration.MyConnection;
import com.ltts.model.Auction;
import com.ltts.model.Player;

public class AuctionDao {
	public boolean insertAuction(Auction a) throws Exception
	{
		Connection c= MyConnection.getConnection();
		
		PreparedStatement ps= c.prepareStatement("insert into jdbcadvauction values(?,?,?,?,?)");
		ps.setInt(1,a.getAuction_id());
		ps.setInt(2,a.getPlayer_id());
		ps.setInt(3,a.getTeam_id());
		ps.setInt(4,a.getYear());
		ps.setInt(5,a.getAmount());
		
		System.out.println("Data Inserted Succesfully");
		return ps.execute();
		
	}
	
	public List<Auction> getAllAuction() throws Exception{
		List<Auction> li=new ArrayList<Auction>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from jdbcadvauction");
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Auction(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5)));
			
		}
		return li;

}
	public Auction getAuctionById(int Auction_id) throws Exception {
		Auction a=new Auction();
		List<Auction> li=getAllAuction();
		for(Auction p1:li) {
			if(p1.getAuction_id() == Auction_id) {
				a.setAuction_id(Auction_id);
				a.setTeam_id(p1.getTeam_id());
				a.setPlayer_id(p1.getPlayer_id());
				a.setYear(p1.getYear());
				a.setAmount(p1.getAmount());
			}
		}
		
		return a;
	}
}
