package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configuration.MyConnection;
import com.ltts.model.Player;
import com.ltts.model.Team;


public class TeamDao {
	public boolean insertTeam(Team t) throws Exception
	{
		Connection c= MyConnection.getConnection();
		
		PreparedStatement ps= c.prepareStatement("insert into jdbcadvteam values(?,?,?,?)");
		ps.setInt(1,t.getTeam_id());
		ps.setString(2, t.getTeamname());
		ps.setString(3, t.getOwnername());
		ps.setString(4, t.getCoachname());
		System.out.println("Data Inserted Succesfully");
		return ps.execute();
}
	public List<Team> getAllTeam() throws Exception{
		List<Team> li=new ArrayList<Team>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from jdbcadvteam");
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Team(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			
		}
		return li;
	}
	public Team getTeamById(int teamid) throws Exception {
		Team t=new Team();
		List<Team> li=getAllTeam();
		for(Team t1:li) {
			if(t1.getTeam_id() == teamid) {
				t.setTeam_id(teamid);
				t.setTeamname(t1.getTeamname());
				t.setOwnername(t1.getOwnername());
				
			}
		}
		
		return t;
	}
}
