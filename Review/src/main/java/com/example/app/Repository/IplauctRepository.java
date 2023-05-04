package com.example.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.app.Model.iplauct_model;


public interface IplauctRepository extends JpaRepository<iplauct_model, Integer> {
	//positional parameter
	@Query("select s from iplauct_model s where s.pteam=?1 and s.pname=?2")
	public List<iplauct_model>getStudentsByPteam(String pteam,String pname);
	//named parameter
	@Query("select s from iplauct_model s where s.pteam=:pteam")
	public List<iplauct_model>getStudentByPteam(String pteam);
	//DML
	@Modifying 
	@Query("delete from iplauct_model s where s.pname=?1")
	public int deleteStudentByPname(String pname);
	@Modifying
	@Query("update iplauct_model s set s.pteam=?1 where s.pname=?2")
	public int updateStudentByName(String department, String name);
	List<iplauct_model>findByPnameStartingWith(String Prefix);
	List<iplauct_model>findByPnameEndingWith(String Suffix);
	List<iplauct_model>findByPteam(String pteam);
}
