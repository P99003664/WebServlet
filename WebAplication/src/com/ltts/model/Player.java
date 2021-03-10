package com.ltts.model;

import java.sql.Date;

public class Player {
	private int Player_id;
	private String Player_Name;
	private Date DateOfBirth;
	private String Nationality;
	/*private String Skills;
	//private int Runs;
	private int Wickets;
	private int Number_of_matches;
	private int Team_id;*/
	public Player() {
		super();
	}
	
	public Player(int player_id, String player_Name, Date dateOfBirth, String nationality) {
		super();
		Player_id = player_id;
		Player_Name = player_Name;
		DateOfBirth = dateOfBirth;
		Nationality = nationality;
	}

	public int getPlayer_id() {
		return Player_id;
	}

	public void setPlayer_id(int player_id) {
		Player_id = player_id;
	}

	public String getPlayer_Name() {
		return Player_Name;
	}

	public void setPlayer_Name(String player_Name) {
		Player_Name = player_Name;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	@Override
	public String toString() {
		return "Player [Player_id=" + Player_id + ", Player_Name=" + Player_Name + ", DateOfBirth=" + DateOfBirth
				+ ", Nationality=" + Nationality + "]";
	}

	
	
	
}	