package com.example.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.Model.IplauctModel;
import com.example.app.Repository.IplauctRepository;
@Service

public class IplauctService
{
	@Autowired
public IplauctRepository irepo;
public IplauctModel saveInfo(IplauctModel i)
{
	return irepo.save(i);
}

public List<IplauctModel> getInfo()
{
	return irepo.findAll();
}

public IplauctModel updateInfo(IplauctModel iu)
{
	return irepo.saveAndFlush(iu);
}
public void deleteInfo(int pnum)
{
	irepo.deleteById(pnum);
}
}