package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configuration.MyConnection;
import com.ltts.model.Player;


public class PlayerDao {
	public boolean insertPlayer(Player p) throws Exception
	{
		Connection c= MyConnection.getConnection();
		
		PreparedStatement ps= c.prepareStatement("insert into jdbcadvplayer values(?,?,?)");
		ps.setString(1,p.getName());
		ps.setInt(2, p.getAge());
		ps.setString(3, p.getCountry());
		System.out.println("Data Inserted Succesfully");
		return ps.execute();
	}
	public List<Player> getAllPlayers() throws Exception{
		List<Player> li=new ArrayList<Player>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from jdbcadvplayer");
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Player(rs.getString(1),rs.getInt(2),rs.getString(3)));
			
		}
		return li;
		
	}
	public Player getPlayerByAge(int age) throws Exception {
		Player p=new Player();
		List<Player> li=getAllPlayers();
		for(Player p1:li) {
			if(p1.getAge() == age) {
				p.setAge(age);
				p.setName(p1.getName());
				p.setCountry(p1.getCountry());
			}
		}
		
		return p;
	}
	public boolean updatePlayer(String Name, int Age, String Country) throws Exception {
		// TODO Auto-generated method stub
		
		Connection c=MyConnection.getConnection();
		PreparedStatement ps=c.prepareStatement("UPDATE jdbcadvplayer SET Name = ?,Country = ? where Age=?");
		ps.setString(1,Name);
		ps.setInt(2,Age);
		ps.setString(3, Country);
	
	return ps.execute();
	}

}
