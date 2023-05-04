package com.review1.project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PlayerIplTeam 
{
	@Id
	private int playerno;
	private String Iplteam;
	public int getPlayerno() {
		return playerno;
	}
	public void setPlayerno(int playerno) {
		this.playerno = playerno;
	}
	public String getIplteam() {
		return Iplteam;
	}
	public void setIplteam(String iplteam) {
		Iplteam = iplteam;
	}
	


}