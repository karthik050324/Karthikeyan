package com.example.app.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "IplTeam")
public class IplTeam
{
	    @Id
	    @GeneratedValue
	    private Long playerno;
	   
		private String playername;
	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "Natteam_id")
	 	 private NatTeam natteam;
		public Long getPlayerno() {
			return playerno;
		}
		public void setPlayerno(Long playerno) {
			this.playerno = playerno;
		}
		public String getPlayername() {
			return playername;
		}
		public void setPlayername(String playername) {
			this.playername = playername;
		}
		public NatTeam getNatteam() {
			return natteam;
		}
		public void setNatteam(NatTeam natteam) {
			this.natteam = natteam;
		}
		
}