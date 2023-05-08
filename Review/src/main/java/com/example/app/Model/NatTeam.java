package com.example.app.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class NatTeam
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long no;
    public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNatteam() {
		return natteam;
	}
	public void setNatteam(String natteam) {
		this.natteam = natteam;
	}
	private int age;
    private String natteam ;
	@Override
	public String toString() {
		return "NatTeam [no=" + no + ", age=" + age + ", natteam=" + natteam + "]";
	}
    
}