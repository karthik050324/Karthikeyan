package com.example.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.app.Model.iplauct_model;
import com.example.app.Repository.IplauctRepository;

import jakarta.transaction.Transactional;

import org.springframework.data.domain.Pageable;
@Service

public class IplauctService
{
	@Autowired 
public IplauctRepository irepo;
public iplauct_model saveInfo(iplauct_model i)
{
	return irepo.save(i);
}

public List<iplauct_model> getInfo()
{
	return irepo.findAll();
}

public iplauct_model updateInfo(iplauct_model iu)
{
	return irepo.saveAndFlush(iu);
}
public void deleteInfo(int pnum)
{
	irepo.deleteById(pnum);
}
public List<iplauct_model> sortIplauctModel(String name)
{
	return irepo.findAll(Sort.by(name));
}
public Page<iplauct_model> pagingStudent( int offset, int pageSize)
{
	Pageable paging=PageRequest.of(offset, pageSize);
	 Page<iplauct_model>studData=irepo.findAll(paging);
	 //List<Student>studList=studData.getContent();
	 return studData;
}
public List<iplauct_model> pagingAndSortingEmployees(int offset,
		int pageSize,String field) {
	Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
		Page<iplauct_model> stud=irepo.findAll(paging);
		return stud.getContent();
	}
public List<iplauct_model>fetchStudentsByPnamePrefix(String Prefix)
{
	 return irepo.findByPnameStartingWith(Prefix);
}
public List<iplauct_model>fetchStudentsByPnameSuffix(String Suffix)
{
	 return irepo.findByPnameEndingWith(Suffix);
}
public List<iplauct_model> sortdesTeams(String field) {
	return irepo.findAll(Sort.by(Direction.DESC, field));
}
@Transactional
public int deleteStudentByName(String name)
{
	return irepo.deleteStudentByPname(name);
}
@Transactional
public int updateStudentByName(String department,String name)
{
	return irepo.updateStudentByName(department,name);
}

public List<iplauct_model>getStudentsByPteam(String pteam,String pname)
{
	return irepo.getStudentsByPteam(pteam, pname);
}
public List<iplauct_model>getStudentByPteam(String pteam)
{
	return irepo.getStudentByPteam(pteam);
}
}
