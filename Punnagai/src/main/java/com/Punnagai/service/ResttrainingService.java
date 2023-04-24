package com.Punnagai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Punnagai.demo.dao.StudentRepositery;

@Service
public class ResttrainingService {
  @Autowired
  public StudentRepositery repobj;
  
  public Resttraining saveInfo(@RequestBody ResttrainingService obj) {
	  return repobj.save(obj);
	  
  }
  public List<Resttraining> getAllResttraining()
  {
	  List<Resttraining>restList=repobj.findAll();
	  return restList;
  }
}
