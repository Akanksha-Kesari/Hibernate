package com.web.spring.model;

public class Greeting {
	private String player;
	private String messegae;
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public String getMessegae() {
		return messegae;
	}
	public void setMessegae(String messegae) {
		this.messegae = messegae;
	}
	public Greeting(String player, String messegae) {
		super();
		this.player = player;
		this.messegae = messegae;
	}
	
		public Greeting() {
		// TODO Auto-generated constructor stub
	}
	

}
