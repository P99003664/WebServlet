package com.ltts.model;

public class Auction {
	private int Auction_id;
	private int player_id;
	private int team_id;
	private int year;
	private int amount;
	
	public Auction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Auction(int auction_id, int player_id, int team_id, int year, int amount) {
		super();
		this.Auction_id = auction_id;
		this.player_id = player_id;
		this.team_id = team_id;
		this.year = year;
		this.amount = amount;
	}
	public int getAuction_id() {
		return Auction_id;
	}
	public void setAuction_id(int auction_id) {
		this.Auction_id = auction_id;
	}
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Auction [auction_id=" + Auction_id + ", player_id=" + player_id + ", team_id=" + team_id + ", year="
				+ year + ", amount=" + amount + "]";
	}
}