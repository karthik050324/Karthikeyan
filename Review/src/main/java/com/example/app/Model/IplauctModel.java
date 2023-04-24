package com.example.app.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class IplauctModel 
{
	@Id
private int pnum;
private String pname;
private String pteam;
public int getPnum() {
	return pnum;
}
public void setPnum(int pnum) {
	this.pnum = pnum;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPteam() {
	return pteam;
}
public void setPteam(String pteam) {
	this.pteam = pteam;
}

}
