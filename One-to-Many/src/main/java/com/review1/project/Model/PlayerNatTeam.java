package com.review1.project.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class PlayerNatTeam
{
	@Id
	  private int pno;
	  public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPlayernatteam() {
		return playernatteam;
	}
	public void setPlayernatteam(String playernatteam) {
		this.playernatteam = playernatteam;
	}
	public List<PlayerIplTeam> getNo() {
		return no;
	}
	public void setNo(List<PlayerIplTeam> no) {
		this.no = no;
	}
	private String playernatteam;
	  @OneToMany(cascade = CascadeType.ALL)
	  @JoinColumn
	  private List<PlayerIplTeam> no;
	
}